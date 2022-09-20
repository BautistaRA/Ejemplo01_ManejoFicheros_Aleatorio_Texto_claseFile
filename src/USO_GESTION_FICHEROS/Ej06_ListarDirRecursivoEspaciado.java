/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_GESTION_FICHEROS;

import es.ES;
import java.io.File;

/**
 *
 * @author bauti
 */
public class Ej06_ListarDirRecursivoEspaciado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dir = ES.leeDeTeclado("Entrar el directorio de inicio: ");
        //"D:\\AD_Presencial\\_CURSO2021\\Tema01-Manejo de ficheros\\PRUEBA"
        File dirFile = new File(dir);
        int nivel = 0;
        mostrarDir(dirFile, nivel);
    }

    public static void mostrarDir(File dir, int nivel) {
        nivel++;
        File[] listaDir = dir.listFiles();
        if (listaDir != null) {
            for (File ele : listaDir) {
                if (ele.isFile()) {

                    System.out.println(tabular(nivel) + ele.getName());
                } else {
                    System.out.println("--" + nivel + "---" + tabular(nivel) + ele.getName().toUpperCase());
                    mostrarDir(ele, nivel);
                }
            }
        }
    }

    public static String tabular(int n) {
        String cad = "";
        for (int i = 0; i < n; i++) {
            cad = cad + "\t";
        }
        return cad;

    }
}
