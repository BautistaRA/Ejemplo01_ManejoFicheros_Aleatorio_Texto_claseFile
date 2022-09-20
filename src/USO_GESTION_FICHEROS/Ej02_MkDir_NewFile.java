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
import java.io.*;

public class Ej02_MkDir_NewFile {

    public static void main(String[] args) {

        File d = new File("./NUEVODIR"); //directorio que creo a partir del actual
        File f1 = new File(d, "FICHERO1.TXT");
        File f2 = new File(d, "FICHERO2.TXT");
        d.mkdir();   //CREAR DIRECTORIO
        try {
            if (f1.createNewFile()) {
                System.out.println("FICHERO1 creado correctamente...");
            } else {
                System.out.println("No se ha podido crear FICHERO1...");
            }
            if (f2.createNewFile()) {
                System.out.println("FICHERO2 creado correctamente...");
            } else {
                System.out.println("No se ha podido crear FICHERO2...");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        //RENOMBRADO del FICHERO1.TXT
        f1.renameTo(new File(d, "FICHERO1NUEVO"));   //renombro FICHERO1

        if (f2.delete()) //borro FICHERO1   
        {
            System.out.println("Fichero1 borrado...");
        } else {
            System.out.println("No se ha podido borrar el Fichero1...");
        }
//        if (f1.delete()) {
//            System.out.println("Fichero2 borrado...");
//        } else {
//            System.out.println("No se ha podido borrar el Fichero2...");
//        }
        if (d.delete()) //borrar DIRECTORIO
        {
            System.out.println("Directorio NUEVODIR borrado...");
        } else {
            System.out.println("No se ha podido borrar el directorio NUEVODIR...");
        }
        try {
            File f3 = new File("NUEVODIR\\FICHERO3.TXT");
            f3.createNewFile();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        if (f1.delete()) {
            System.out.println("Fichero2 borrado...");
        } else {
            System.out.println("No se ha podido borrar el Fichero2...");
        }
    } //main

}//clase

