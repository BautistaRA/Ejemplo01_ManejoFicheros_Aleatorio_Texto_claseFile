package USO_FICHEROS_BINARIOS_ALEATORIOS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author
 * https://codesitio.com/recursos-utiles-para-tu-web-o-blog/cursos/curso-de-java-flujos-de-datos-en-java/
 */
public class Ej03_Copiar_contenido_archivo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int char1;
        FileInputStream leer;
        FileOutputStream escribir;

        //creamos los objetos de cada flujo de E/S
        leer = new FileInputStream("./original.txt");
        escribir = new FileOutputStream("./copia.txt");

        /*
      * Leemos el primer caracter y lo almacenamos en la variable int "char1".
      * solo se utilizan los "8 bits menos significativos" de la variable int.
      * Recordemos que "el tipo int ocupa 4 bytes" (32 bits)y el tipo byte (8 bits)
         */
        char1 = leer.read();

        /*
      * Recorremos con un bucle while todo el fichero byte a byte hasta el final.
      * Cuando llegue al final retorna un valor -1
         */
        int cont = 0;
        ;
        while (char1 != -1) {
            System.out.println(char1 + " " + (char) char1);
            escribir.write(char1);
            char1 = leer.read();
            cont++;
        }
        System.out.printf("vueltas  %s", cont);

        /*
      *  Cerramos los flujos abiertos (acci�n siempre necesaria
      *  para liberar recursos.
         */
        leer.close();
        escribir.close();
    }
}
