/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_GESTION_FICHEROS;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bauti
 */
public class Ej00_Prueba_listFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List misF;
        misF = getFicheros("D:\\AD_Presencial\\_CURSO2223\\UD01_AccesoFicheros\\Ejemplos");
        for (int i = 0; i < misF.size(); i++) {
            System.out.println(misF.get(i));

        }

    }

    public static List getFicheros(String dir) {
        int j = 0;
        File dirIni = new File(dir);
        List ficheros = new ArrayList();
        if (dirIni.exists()) {
            File[] listaDir = dirIni.listFiles();
            System.out.println(listaDir.length);
            if (listaDir != null) {
                for (File listaDir1 : listaDir) {
                    if (listaDir1.isFile()) {
                        ficheros.add(listaDir1.getName())  ;
                        j++;
                    }
                }
            }//if
        }//if
        return ficheros;
    }// getFicheros
}
