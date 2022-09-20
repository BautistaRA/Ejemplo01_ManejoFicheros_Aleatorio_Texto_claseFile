/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_Ficheros_TEXTO;

import java.io.*;

class Ej04_Lectura_Teclado_System {

    public static void main(String args[]) throws IOException {
        int c;
        String  cad = "";
        int contador = 0;
        // se lee hasta encontrar el fin de línea
        while ((c = System.in.read()) != '\n') { 
            contador++;
            System.out.println(c);
            cad = cad + (char)c;
//            System.out.print((char) c);
        }
        System.out.println(cad); // Se escribe el fin de línea
        System.err.println("Contados " + contador + " bytes en total.");
    }
}
