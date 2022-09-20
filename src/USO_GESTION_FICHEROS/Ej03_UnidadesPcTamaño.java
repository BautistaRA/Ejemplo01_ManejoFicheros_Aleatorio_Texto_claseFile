/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_GESTION_FICHEROS;

import java.io.File;
import java.io.PrintStream;

public class Ej03_UnidadesPcTamaño {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        File[] unidades = File.listRoots();
        StringBuilder cadena = new StringBuilder();
        
        System.out.printf("%s  %18s %30s %n","Unidad", "Tamaño Total", "Tamaño disponible");
        for (File f : unidades) {
            System.out.print(f);
            System.out.printf("%20s %2s %20s %2s %n", f.getTotalSpace(), "GB", f.getFreeSpace()/1073741824, "GB");
            //1 GB = 1.024 MB = 1.048.576 KB = 1.073.741.824 Bytes. (10 elevado a 9)
        }//for
    } //main }//class

}
