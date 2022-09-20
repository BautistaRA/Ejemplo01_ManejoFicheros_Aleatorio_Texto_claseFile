/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_Ficheros_TEXTO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bauti
 */
public class CargarScriptXQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File fichero = new File("carta.txt");

        System.out.println(fileToString(fichero));
//        System.out.println(cargarFichero(fichero));

    }

    private static String fileToString(File file) throws UnsupportedEncodingException {
        InputStreamReader in = null;

        try {
            //Obtiene el contenido del fichero
            in = new InputStreamReader(new FileInputStream(file), "UTF-8");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CargarScriptXQ.class.getName()).log(Level.SEVERE, null, ex);
        }
        //cadena para construir la cadena resultante
        StringBuilder build = new StringBuilder();
        //array de tamaño suficiente para alamcenar los caracteres del script
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
            Logger.getLogger(CargarScriptXQ.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(CargarScriptXQ.class.getName()).log(Level.SEVERE, null, ex);
            }
            return build.toString();
        }

    }

    public static String cargarFichero(File f) {
        String script = "";

        FileReader fr;
        BufferedReader br;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                script = script + linea;
            }
        } catch (Exception e) {
        }
        return script;
    }

}//Class
