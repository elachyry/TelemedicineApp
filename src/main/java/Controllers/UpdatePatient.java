package Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;

/*
 * Notre serlvet permettant de récupérer les fichiers côté serveur.
 * Elle répondra à l'URL /upload dans l'application Web considérée.
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50)
public class UpdatePatient extends HttpServlet {

    private static final long serialVersionUID = 1273074928096412095L;
    public static final String UPLOAD_DIR = "images";
	public String dbFileName = "";
    
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   Part part = req.getPart("image");//
		String fileName = extractFileName(part);// file name

		/**
		 * *** Get The Absolute Path Of The Web Application ****
		 */
		String applicationPath = getServletContext().getRealPath("");
		String uploadPath = applicationPath + File.separator + UPLOAD_DIR;
		System.out.println("applicationPath:" + applicationPath);
		File fileUploadDirectory = new File(uploadPath);
		if (!fileUploadDirectory.exists()) {
			fileUploadDirectory.mkdirs();
		}
		String savePath = uploadPath + File.separator + fileName;
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
		dbFileName = UPLOAD_DIR + File.separator + fileName;
		part.write(savePath + File.separator);
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