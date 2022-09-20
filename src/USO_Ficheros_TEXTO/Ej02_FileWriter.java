/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_Ficheros_TEXTO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Lee caractares desde el taclado y lo escribe en un fichero
 * @author bauti
 */
public class Ej02_FileWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Escritura del fichero
         String nbFichero = "./ficheros/Texto02.txt";
        System.out.println("\n Escritura de caracteres en fichero.");
        FileWriter f = null;
        try {
            int c;
            f = new FileWriter(nbFichero);
            while ((c = System.in.read()) != 10) // Mientras no una nueva linea
            {
                f.write(c);
                System.out.printf("Carácter Ascii guardado: %5s \n", c);
            }
        } catch (IOException ex) {
            Logger.getLogger(Ej01_FileReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(Ej01_FileReader.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
       
    }
    
}
