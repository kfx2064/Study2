package org.hdcd.spring.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

public class UploadFileUtils {

    private static final Logger logger = LoggerFactory.getLogger(UploadFileUtils.class);

    public static String uploadFile(String uploadPath, String originalName,
                                    byte[] fileData) throws Exception {
        UUID uid = UUID.randomUUID();

        String savedName = uid.toString() + "_" + originalName;

        String savedPath = calcPath(uploadPath);

        File target = new File(uploadPath + savedPath, savedName);

        FileCopyUtils.copy(fileData, target);

        String uploadFileName = makeUploadedFileName(uploadPath, savedPath, savedName);

        return uploadFileName;
    }

    private static String makeUploadedFileName(String uploadPath, String path,
                                               String fileName) throws Exception {
        String uploadedFileName = uploadPath + path + File.separator + fileName;

        return uploadedFileName.substring(uploadPath.length()).replace(File.separatorChar, '/');
    }

    private static String calcPath(String uploadPath) {
        Calendar cal = Calendar.getInstance();

        String yearPath = File.separator + cal.get(Calendar.YEAR);

        String monthPath = yearPath + File.separator +
                new DecimalFormat("00").format(cal.get(Calendar.MONTH) + 1);

        String datePath = monthPath + File.separator +
                new DecimalFormat("00").format(cal.get(Calendar.DATE));

        makeDir(uploadPath, yearPath, monthPath, datePath);

        logger.info(datePath);

        return datePath;
    }

    private static void makeDir(String uploadPath, String... paths) {
        if (new File(paths[paths.length - 1]).exists()) {
            return;
        }

        for (String path : paths) {
            File dirPath = new File(uploadPath + path);

            if (!dirPath.exists()) {
                dirPath.mkdir();
            }
        }
    }
}
