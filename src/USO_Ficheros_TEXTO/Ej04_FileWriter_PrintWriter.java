package USO_Ficheros_TEXTO;

import static es.ES.leeDeTeclado;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ej04_FileWriter_PrintWriter {

    public static void main(String[] args) {
        String nbFichero = "./ficheros/Texto03.txt";
        FileWriter fw = null;
        PrintWriter pw =null;
        try {
            pw = new PrintWriter(new FileWriter(nbFichero));   //se crea el fichero
            String cadena;
            cadena = leeDeTeclado("\"Introduce texto. Para acabar introduce la cadena FIN:");                             //se introduce por teclado una cadena de texto    
            while (!cadena.equalsIgnoreCase("FIN")) {
                pw.println(cadena);                 //se escribe la cadena en el fichero
                cadena = leeDeTeclado();             //se introduce por teclado una cadena de texto
            }
            pw.flush();
        } catch (IOException ex) {
            Logger.getLogger(Ej04_FileWriter_PrintWriter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }
}

/*
    A partir de Java 7 se puede usar la instrucción try-with-resources. Un resource (recurso) es un objeto que necesita
    ser cerrado después de usarlo. Una instrucción try-with-resources asegura que estos objetos serán cerrados al final 
    de la instrucción try. Cualquier objeto que implemente la interface java.lang.AutoCloseable, entre ellos los que 
    implementan la interface java.io.Closeable pueden ser usados como resources.
 */
//    public static void main(String[] args) {
//         try (PrintWriter salida = new PrintWriter("./salida.txt")) {
//            String cadena;
//            cadena = ESTeclado.leeDeTeclado("\"Introduce texto. Para acabar introduce la cadena FIN:");                             //se introduce por teclado una cadena de texto    
//            while (!cadena.equalsIgnoreCase("FIN")) {
//                salida.println(cadena);                         //se escribe la cadena en el fichero
//                cadena = ESTeclado.leeDeTeclado();                         //se introduce por teclado una cadena de texto    
//            }
//            salida.flush();
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());                                                                   
//        } 
//    }

