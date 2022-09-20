/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_FICHEROS_BINARIOS_ALEATORIOS;
import java.io.*;
public class Ej01_Escribir_Leer_Bytes_FileOutputStream {
    public static void main(String[] args) throws IOException {
        File fichero = new File("EscribirBytes.dat");
        FileOutputStream fos = new FileOutputStream(fichero);
        int i;
        System.out.println("Escribe 10 líneas en el fichero...\n\n");
        for (i = 0; i < 10; i++) {
            fos.write(i * 10); 	  
        }
        fos.close(); //cerrar stream de salida   
    
        //Lectura de 10 lineas 
        FileInputStream fis = new FileInputStream(fichero);
        System.out.println("Lee el fichero y lo visualiza en la consola...");
        while ((i = fis.read()) != -1) //lee datos del flujo de entrada
        {
            System.out.println(i);
        }
        fis.close();  //cerrar stream de entrada 
    }
}
