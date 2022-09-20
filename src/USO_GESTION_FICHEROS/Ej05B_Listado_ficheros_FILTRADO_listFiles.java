/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_GESTION_FICHEROS;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author bau
 */
public class Ej05B_Listado_ficheros_FILTRADO_listFiles{

    String extension;

    // Constructor 
    Ej05B_Listado_ficheros_FILTRADO_listFiles(String extension) {
        this.extension = extension;
    }

//    public boolean accept(File dir, String name) {
//        return name.endsWith(extension);
//    }

    public static void main(String[] args) {
        try {
            // Obtendremos el listado de los archivos de ese directorio
            File fichero = new File("D:\\");

            // Obtenemos los Files filtrado por extension
            File[] listaFiles = fichero.listFiles(new Filtro(".pdf"));

            // Comprobamos el número de archivos en el listado
            int numarchivos = listaFiles.length;
            // Si no hay ninguno lo avisamos por consola
            if (numarchivos < 1) {
                System.out.println("No hay archivos que listar");
            } // Y si hay, escribimos su nombre por consola.
            else {
                for (File f: listaFiles) {
                    System.out.println(f);
                }
            }
        } catch (Exception ex) {
            System.out.println("Error al buscar en la ruta indicada");
        }
    }

}
