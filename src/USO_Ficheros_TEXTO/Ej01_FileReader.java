/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_Ficheros_TEXTO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Lee caracteres de un fichero de texto y lo muestra
 *
 * @author bauti
 */
public class Ej01_FileReader {

    public static void main(String[] args) throws IOException {
        String nbFichero = "./ficheros/Texto01.txt";
        //Lectura del fichero
        System.out.println("\n Lectura de caracteres en fichero.");
        FileReader fic = null;
        try {
            fic = new FileReader(nbFichero); //crear el flujo de entrada   
            int i;

            while ((i = fic.read()) != -1) //Devuelve -1 cuando llega al final del archivo.
            {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ej01_FileReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fic.close(); //cerrar fichero   
        }
    }
}
//            char[] b =new char[10];
//            while ((i = fic.read(b)) != -1) {//lee carácter a carácter. Devuelve -1 cuando llega al final del archivo.
//                System.out.printf("Caracter Asciii recuperado %5s. Carácter %5s \n", b[0], (char) i);
//            }
