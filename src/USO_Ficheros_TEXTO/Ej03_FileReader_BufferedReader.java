/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_Ficheros_TEXTO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ies juan bosco
 */
public class Ej03_FileReader_BufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String nbFichero = "./ficheros/Texto01.txt";
        FileReader fr;
        BufferedWriter bw = null;
        BufferedReader br = null;

        //Lectura de líneas de texto
        try {
            br = new BufferedReader(new FileReader(nbFichero));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }finally{
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Ej03_FileReader_BufferedReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Escritura de líneas de texto
        try {

            bw = new BufferedWriter(new FileWriter("./ficheros/copia_Texto01.txt",true));
            for (int i = 1; i < 5; i++) {
                bw.write("Linea ... " + i * 4);
                bw.newLine();//escribe un salto de línea
            }
        } catch (FileNotFoundException fn) {
            System.out.println("No se encuentra el fichero");
        } catch (IOException io) {
            System.out.println("Error de E/S ");
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(Ej03_FileReader_BufferedReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
