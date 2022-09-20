/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_GESTION_FICHEROS;

import java.io.File;
import java.io.IOException;

public class Ej04_DiferenciasRutas {

    public static void main(String[] args) throws IOException {
//        File f = new File(".\\scr");
        File f = new File ("./src");
        String dirActual = System.getProperty("user.dir");
        System.out.println("Directorio actual   " + dirActual);
        System.out.println("getPath()           " + f.getPath());
        System.out.println("getAbsolutePath()   " + f.getAbsolutePath());
        System.out.println("getCanonicalPath()  " + f.getCanonicalPath());
    }
}

//E:\_AD_Presencial\10_UDidacticas\UD1.1_Manejo Ficheros Java\USO_Ficheros_claseFile_y_Texto\src