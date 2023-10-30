package org.hdcd.controller;

import org.apache.commons.io.IOUtils;
import org.hdcd.domain.Board;
import org.hdcd.domain.Item;
import org.hdcd.service.BoardService;
import org.hdcd.service.TestService;
import org.hdcd.util.MediaUtils;
import org.hdcd.util.UploadFileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/item")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @Value("${upload.path}")
    private String uploadPath;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void list(Model model) throws Exception {
        List<Item> itemList = this.testService.list();

        model.addAttribute("itemList", itemList);
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm(Model model) {
        model.addAttribute(new Item());

        return "item/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Item item, Model model) throws Exception {
        String[] files = item.getFiles();

        for (int i = 0; i < files.length; i++) {
            logger.info("files[i] = " + files[i]);
        }

        this.testService.regist(item);

        model.addAttribute("msg", "등록이 완료되었습니다.");

        return "item/success";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public String modifyForm(Integer itemId, Model model) throws Exception {
        Item item = this.testService.read(itemId);

        model.addAttribute(item);

        return "item/modify";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modify(Item item, Model model) throws Exception {

        String[] files = item.getFiles();

        for (int i = 0; i < files.length; i++) {
            logger.info("files[i] = " + files[i]);
        }

        this.testService.modify(item);

        model.addAttribute("msg", "수정이 완료되었습니다.");

        return "item/success";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String removeForm(Integer itemId, Model model) throws Exception {
        Item item = this.testService.read(itemId);

        model.addAttribute(item);

        return "item/remove";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String remove(Item item, Model model) throws Exception {
        this.testService.remove(item.getItemId());

        model.addAttribute("msg", "삭제가 완료되었습니다.");

        return "item/success";
    }

    @ResponseBody
    @RequestMapping(value = "/uploadAjax", method = RequestMethod.POST
            , produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> uploadAjax(MultipartFile file) throws Exception {
        logger.info("originalName : " + file.getOriginalFilename());

        String savedName = UploadFileUtils.uploadFile(uploadPath, file.getOriginalFilename()
                , file.getBytes());

        return new ResponseEntity<String>(savedName, HttpStatus.CREATED);
    }

    @ResponseBody
    @RequestMapping("/displayFile")
    public ResponseEntity<byte[]> displayFile(String fileName) throws Exception {
        InputStream in = null;
        ResponseEntity<byte[]> entity = null;

        logger.info("FILE NAME : " + fileName);

        try {
            String formatName = fileName.substring(fileName.lastIndexOf(".") + 1);

            MediaType mType = MediaUtils.getMediaType(formatName);

            HttpHeaders headers = new HttpHeaders();

            in = new FileInputStream(uploadPath + fileName);

            if (mType != null) {
                headers.setContentType(mType);
            } else {
                fileName = fileName.substring(fileName.indexOf("_") + 1);
                headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
                headers.add("Content-Disposition", "attachment; filename\""
                        + new String(fileName.getBytes("UTF-8"), "ISO-8859-1") + "\"");
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

    @RequestMapping("/getAttach/{itemId}")
    @ResponseBody
    public List<String> getAttach(@PathVariable("itemId") Integer itemId) throws Exception {
        logger.info("getAttach itemId : " + itemId);

        return testService.getAttach(itemId);
    }

    private String uploadFile(String originalName, byte[] fileData) throws Exception {
        UUID uid = UUID.randomUUID();

        String createdFileName = uid.toString() + "_" + originalName;

        File target = new File(uploadPath, createdFileName);

        FileCopyUtils.copy(fileData, target);

        return createdFileName;
    }

    private MediaType getMediaType(String formatName){
        if(formatName != null) {
            if(formatName.equals("JPG")) {
                return MediaType.IMAGE_JPEG;
            }

            if(formatName.equals("GIF")) {
                return MediaType.IMAGE_GIF;
            }

            if(formatName.equals("PNG")) {
                return MediaType.IMAGE_PNG;
            }
        }

        return null;
    }

}
