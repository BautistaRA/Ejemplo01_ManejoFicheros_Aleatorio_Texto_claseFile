/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_Ficheros_TEXTO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author bau
 */
public class Ej05_string_File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        crearFileTexto("En un lugar de la Mancha, de cuyo nombre no quiero acordarme,"
                + "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, "
                + "adarga antigua, rocín flaco y galgo corredor", "salida3.txt");

//        stringToFile2("En un lugar de la Mancha, de cuyo nombre no quiero acordarme, "
//                + "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, "
//                + "adarga antigua, rocín flaco y galgo corredor", "salida4.txt");
//        crearFileTexto(es.ESTeclado.leeDeTeclado("Entrar texto:"), "fichero5.txt");
//        stringToFile2(es.ESTeclado.leeDeTeclado("Entrar texto:"), "fichero6.txt");
//        System.out.println("----------------------");
//        System.out.println(fileToString(new File("./fichero5.txt")));

    }

    private static void crearFileTexto(String texto, String nombreFile) {
        PrintWriter fichero = null;
        try {
            fichero = new PrintWriter(new File(nombreFile));
            fichero.write(texto);
            fichero.close();
            System.out.println("Fichero creado correctamente");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            fichero.close();
        }
    }
/**
 * Crea un fichero texto utilizando OutputStreamWriter al lado del programador
 * y FileOutputStream al lado del File
 * @param texto
 * @param archivo
 * @throws IOException 
 */
    private static void crearFileTexto2(String texto, String archivo) throws IOException {
        File file = new File(archivo);
        //Un OutputStreamWriter es un puente entre los flujos de caracteres y los flujos de bytes: los caracteres que se escriben en él se codifican en bytes utilizando un archivo charset. 
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
        osw.write(texto);
        osw.close();

    }

    private static String fileToString(File file) throws IOException {
        
        InputStreamReader in = null;
        StringBuilder build = null;
        try {
            //Obtiene el contenido del fichero
            in = new InputStreamReader(new FileInputStream(file), "UTF-8");
            //cadena para construir la cadena resultante
            build = new StringBuilder();
            //array de tamaño suficiente para almacenar los caracteres del script
            char[] chars = new char[8192];
            int count;
            try {
                //mientras hay caracteres en el contenido del fichero los añade a la cadena
                while ((count = in.read(chars, 0, chars.length)) != -1) {
                    if (count > 0) {
                        build.append(chars, 0, count);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Ej05_string_File.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                in.close();
            }
           
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());;
        } catch (UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());

        } catch (IOException ex) {
            Logger.getLogger(Ej05_string_File.class.getName()).log(Level.SEVERE, null, ex);
        }
         return build.toString();
    }

}
