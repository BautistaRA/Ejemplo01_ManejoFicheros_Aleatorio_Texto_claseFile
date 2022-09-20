/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_GESTION_FICHEROS;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bau
 */
public class Ej06_ListarDirRecursivo {

    public static void main(String[] args) {

        recorrerDirectorios("./miDir");

    }

    public static void recorrerDirectorios(String ruta) {
        //Se crea un objeto file con la ruta del directorio
        File directorio = new File(ruta);

        try {
            //Se comprueba si la ruta existe
            if (!directorio.exists()) {
                System.out.println("La ruta no existe.");
            } else {
                System.out.println("D ->"+directorio.getCanonicalPath());
                //obtener todo el contenido del directorio
                File[] lista = directorio.listFiles();
                if (lista != null) {
                    //se recorre el directorio y se muestran primero los archivos
                    for (File s : lista) {
                        if (s.isFile()) {
                            System.out.println("f ->" + s.getCanonicalPath());
                        }
                    }
                    //se recorre de nuevo el directorio y se obtienen los subdirectorios

                    for (File s : lista) {
                        //Si es un directorio se vuelve a llamar al método
                        if (s.isDirectory()) {

                            recorrerDirectorios(s.getCanonicalPath());

                        }
                    }
                }
            }

        } catch (IOException ex) {
            System.out.println("error");

        }
    }
}
