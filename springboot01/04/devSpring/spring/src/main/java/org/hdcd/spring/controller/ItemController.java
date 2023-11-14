package org.hdcd.spring.controller;

import org.apache.commons.io.IOUtils;
import org.hdcd.spring.domain.Item;
import org.hdcd.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Value("${upload.path}")
    private String uploadPath;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void list(Model model) throws Exception {
        List<Item> itemList = itemService.list();

        model.addAttribute("itemList", itemList);
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String registerForm(Model model) {
        model.addAttribute(new Item());

        return "item/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String register(Item item, RedirectAttributes rttr) throws Exception {
        MultipartFile pictureFile = item.getPicture();

        MultipartFile previewFile = item.getPreivew();

        String createdPictureFilename =
                uploadFile(pictureFile.getOriginalFilename(), pictureFile.getBytes());
        String createdPreviewFilename =
                uploadFile(previewFile.getOriginalFilename(), previewFile.getBytes());

        item.setPictureUrl(createdPictureFilename);
        item.setPreviewUrl(createdPreviewFilename);

        itemService.register(item);

        rttr.addFlashAttribute("msg", "SUCCESS");
        return "redirect:/item/list";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String modifyForm(Integer itemId, Model model) throws Exception {
        Item item = itemService.read(itemId);

        model.addAttribute(item);

        return "item/modify";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String modify(Item item, RedirectAttributes rttr) throws Exception {
        MultipartFile pictureFile = item.getPicture();

        if (pictureFile != null && pictureFile.getSize() > 0) {
            String createFilename =
                    uploadFile(pictureFile.getOriginalFilename(), pictureFile.getBytes());

            item.setPictureUrl(createFilename);
        }

        MultipartFile previewFile = item.getPreivew();

        if (previewFile != null && previewFile.getSize() > 0) {
            String createdFilename =
                    uploadFile(previewFile.getOriginalFilename(), previewFile.getBytes());

            item.setPreviewUrl(createdFilename);
        }

        itemService.modify(item);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/item/list";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String removeForm(Integer itemId, Model model) throws Exception {
        Item item = itemService.read(itemId);

        model.addAttribute(item);

        return "item/remove";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String remove(Item item, RedirectAttributes rttr) throws Exception {
        itemService.remove(item.getItemId());

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/item/list";
    }

    private String uploadFile(String originalName, byte[] fileData) throws Exception {
        UUID uid = UUID.randomUUID();

        String createdFileName = uid.toString()+ "_" + originalName;

        File target = new File(uploadPath, createdFileName);

        FileCopyUtils.copy(fileData, target);

        return createdFileName;
    }

    @ResponseBody
    @RequestMapping("/display")
    public ResponseEntity<byte[]> displayFile(Integer itemId) throws Exception {
        InputStream in = null;
        ResponseEntity<byte[]> entity = null;

        String fileName = itemService.getPreview(itemId);

        try {
            String formatName = fileName.substring(fileName.lastIndexOf(".") + 1);

            MediaType mType = getMediaType(formatName);

            HttpHeaders headers = new HttpHeaders();

            in = new FileInputStream(uploadPath + File.separator + fileName);

            if (mType != null) {
                headers.setContentType(mType);
            }

            entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
        } finally {
            in.close();
        }
        return entity;
    }

    private MediaType getMediaType(String formatName) {
        if (formatName != null) {
            if (formatName.equals("JPG")) {
                return MediaType.IMAGE_JPEG;
            }

            if (formatName.equals("GIF")) {
                return MediaType.IMAGE_GIF;
            }

            if (formatName.equals("PNG")) {
                return MediaType.IMAGE_PNG;
            }
        }

        return null;
    }

    @ResponseBody
    @RequestMapping("/download")
    public ResponseEntity<byte[]> downloadFile(Integer itemId, Authentication authentication)
        throws Exception {
        InputStream in = null;
        ResponseEntity<byte[]> entity = null;

        String fullName = itemService.getPicture(itemId);

        try {
            HttpHeaders headers = new HttpHeaders();

            in = new FileInputStream(uploadPath + File.separator + fullName);

            String fileName = fullName.substring(fullName.indexOf("_") + 1);

            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.add("Content-Disposition", "attachment; filename=\""
                        + new String(fileName.getBytes("UTF-8"), "ISO-8859-1") + "\"");

            entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in),
                    headers, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
        } finally {
            in.close();
        }

        return entity;
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public String read(Integer itemId, Model model) throws Exception {
        Item item = itemService.read(itemId);

        model.addAttribute(item);

        return "item/read";
    }
}
