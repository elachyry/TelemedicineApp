package Models;

import java.io.File;
import java.io.IOException;

import jakarta.servlet.http.Part;

public class HelperClass {
    public static final String UPLOAD_DIR = "images";
	public String dbFileName = "";
		public String SaveImage(String applicationPath , Part part) throws IOException{
			/**
			 * *** Get The Absolute Path Of The Web Application ****
			 */
			String fileName = extractFileName(part);// file name
			String uploadPath = applicationPath + File.separator + UPLOAD_DIR;
			System.out.println("applicationPath:" + applicationPath);
			File fileUploadDirectory = new File(uploadPath);
			if (!fileUploadDirectory.exists()) {
				fileUploadDirectory.mkdirs();
			}
			String savePath = uploadPath + File.separator+hashCode()+"-"+ fileName ;
			System.out.println("savePath: " + savePath);
			String sRootPath = new File(savePath).getAbsolutePath();
			System.out.println("sRootPath: " + sRootPath);
			part.write(savePath + File.separator);
			File fileSaveDir1 = new File(savePath);
			/*
			 * if you may have more than one files with same name then you can calculate
			 * some random characters and append that characters in fileName so that it will
			 * make your each image name identical.
			 */
			dbFileName = UPLOAD_DIR + File.separator +hashCode()+"-"+ fileName;
			part.write(savePath + File.separator);
			return dbFileName;
		}
		
		 private String extractFileName(Part part) {//This method will print the file name.
		       String contentDisp = part.getHeader("content-disposition");
		       String[] items = contentDisp.split(";");
		       for (String s : items) {
		           if (s.trim().startsWith("filename")) {
		               return s.substring(s.indexOf("=") + 2, s.length() - 1);
		           }
		       }
		       return "";
		   }
}
