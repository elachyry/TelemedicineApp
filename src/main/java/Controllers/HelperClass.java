package Controllers;

import java.io.File;

import javax.servlet.http.Part;

import jakarta.servlet.ServletException;

public class HelperClass {
	 /*
     * Récupération du nom du fichier dans la requête.
     */
    	String getFileName( Part part ) {
        for ( String content : part.getHeader( "content-disposition" ).split( ";" ) ) {
            if ( content.trim().startsWith( "filename" ) )
                return content.substring( content.indexOf( "=" ) + 2, content.length() - 1 );
        }
        return "Default.file";
    }
    
    
}
