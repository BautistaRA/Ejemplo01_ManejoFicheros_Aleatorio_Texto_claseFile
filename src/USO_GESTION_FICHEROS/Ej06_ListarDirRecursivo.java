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
        recorrerDirectorios(".\\miDir");
//        recorrerDirectorios("C:\\");

//        recorrerDirectorios("D:\\AD_Presencial\\_CURSO2021\\Tema01-Manejo de ficheros\\PRUEBA\\texto.txt");
//        recorrerDirectorios("D:\\AD_Presencial\\_CURSO2021\\Tema01-Manejo de ficheros\\PRUEBA-NOVALIDO");
    }

    public static void recorrerDirectorios(String ruta) {
        //Se crea un objeto file con la ruta del directorio
        File directorio = new File(ruta);
        //Se comprueba si la ruta existe
        if (!directorio.exists()) {
            try {
                System.out.println("La ruta " + directorio.getCanonicalPath() + " no existe.");
                return;
            } catch (IOException ex) {
                Logger.getLogger(Ej06_ListarDirRecursivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //Se comprueba si es un directorio
        if (!directorio.isDirectory()) {
            try {
                System.out.println("La ruta " + directorio.getCanonicalPath() + " no es un directorio");
                return;
            } catch (IOException ex) {
                Logger.getLogger(Ej06_ListarDirRecursivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println(directorio.getAbsolutePath());
        //obtener todo el contenido del directorio
        File[] lista = directorio.listFiles();
        if (lista != null) {
            //se recorre el directorio y se muestran primero los archivos
            for (File s : lista) {
                if (s.isFile()) {
                    System.out.println("Archivo ->  " + s.getName());
                }
            }
            //se recorre de nuevo el directorio y se obtienen los subdirectorios
            for (File s : lista) {
                //Si es un directorio se vuelve a llamar al método
                if (s.isDirectory()) {
                    recorrerDirectorios(s.getAbsolutePath());
                }
            }
        }
    }
}
