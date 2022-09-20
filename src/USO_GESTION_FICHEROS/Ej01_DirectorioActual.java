/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_GESTION_FICHEROS;

/**
 *
 * @author Bautista
 */
import java.io.File;
import java.io.IOException;
public class Ej01_DirectorioActual {
    public static void main(String[] args) throws IOException{
        File f = new File(".\\NUEVODIR");
//          File f = new File("c:\\users\\..\\Program Files");
        
//        File f = new File(System.getProperty("user.dir"));
//        String dirActual = System.getProperty("user.dir");
//        System.out.println("Directorio actual   " + dirActual);

        System.out.println("getPath()           " + f.getPath());
        System.out.println("getAbsolutePath()   " + f.getAbsolutePath());
        System.out.println("getCanonicalPath()  " + f.getCanonicalPath());   
    }
}
