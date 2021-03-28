package edu.vinaenter.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import edu.vinaenter.constant.GlobalConstant;

public class FileUtil {

	// create method to upload file
	public static String uploadFile(MultipartFile multipartFile) {
		if (!multipartFile.getOriginalFilename().equals(GlobalConstant.EMPTY)) {
			System.out.println(System.getenv(GlobalConstant.PATH_PROJECT));
			String newDir = System.getenv(GlobalConstant.PATH_PROJECT);
			String dirPath = newDir + File.separator + GlobalConstant.DIR_UPLOAD;
			File saveDir = new File(dirPath);
			if (!saveDir.exists()) {
				saveDir.mkdirs();
			}
			String fileName = renameFile(multipartFile.getOriginalFilename());
			String filePath = dirPath + File.separator + fileName;
			try {
				multipartFile.transferTo(new File(filePath));
				System.out.println("Upload thành công");
			} catch (IllegalStateException | IOException e) {
				System.out.println("Upload thất bại");
				e.printStackTrace();
			}
			return fileName;
		}
		return GlobalConstant.EMPTY;
	}

	public static String renameFile(String fileName) {
		if (!fileName.equals(GlobalConstant.EMPTY)) {
			StringBuilder bd = new StringBuilder();
			bd.append(FilenameUtils.getBaseName(fileName)).append("_").append(System.nanoTime()).append(".")
					.append(FilenameUtils.getExtension(fileName));
			return bd.toString();
		}
		return GlobalConstant.EMPTY;
	}

}
