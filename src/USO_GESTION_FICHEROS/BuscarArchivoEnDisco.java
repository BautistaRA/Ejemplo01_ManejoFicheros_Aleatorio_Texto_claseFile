/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_GESTION_FICHEROS;

import static es.ES.leeDeTeclado;
import java.io.File;

/**
 *
 * @author Bautista
 */
public class BuscarArchivoEnDisco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dirInicio = leeDeTeclado("Entra el directorio de inicio de búsqueda: ");
        String archivoBuscar = leeDeTeclado("Entrar archivo a  buscar: ");
        
        System.out.println(buscarArchivo(dirInicio, archivoBuscar));
    }

//    public static String buscarArchivo(String dirInicio, String archivoBuscar, String rutaEncontrada) {
//        File directorio = new File(dirInicio);
//        File[] lista = directorio.listFiles();
//        int i = 0;
//        while (rutaEncontrada == "" && i < lista.length) {
//            if (lista[i].isFile()) {
//                if (lista[i].getName().equals(archivoBuscar)) {
//                    rutaEncontrada = lista[i].getAbsolutePath();
//                }
//            } else if (lista[i].isDirectory()) {
//                rutaEncontrada= buscarArchivo(lista[i].getAbsolutePath(),archivoBuscar, rutaEncontrada);
//            }
//
//            i++;
//        }
//        return rutaEncontrada;
//    }
//    
    public static String buscarArchivo(String dirInicio, String archivoBuscar) {

        File directorio = new File(dirInicio);
        File[] lista = directorio.listFiles();
        String ruta="";

        int i = 0;

        for (File ele:lista) {
            if (ele.isFile()) {
                if (ele.getName().equals(archivoBuscar)) {
                    System.out.println("EUREKA.....................");
                    ruta = ele.getAbsolutePath();
                    return ruta;
                }
            } else if (ele.isDirectory()) {
                buscarArchivo(ele.getAbsolutePath(), archivoBuscar);
            }
            i++;
        }
        return ruta;

    }
}
