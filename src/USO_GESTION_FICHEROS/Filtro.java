/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_GESTION_FICHEROS;

import java.io.File;
import java.io.FilenameFilter;

/*
Un filtro es un objeto de una clase que implemente el interface FilenameFilter, 
y tiene que redefinir la única función del interface denominada accept. Esta 
función devuelve un dato de tipo boolean. En este caso, la hemos definido de 
forma que si el nombre del archivo termina con una determinada extensión devuelve
true en caso contrario devuelve false. La función endsWith de la clase String 
realiza esta tarea. La extensión se le pasa al constructor de la clase Ej05_Filtro 
para inicializar el dato extension.
 */
public class Filtro implements FilenameFilter {

    String extension;

    Filtro(String extension) {
        this.extension = extension;
    }

    @Override
    /**
     * Comprueba si el nombre de ruta abstracto especificado debe incluirse o no
     * en una lista de nombres de ruta.
     */
    public boolean accept(File dir, String nombre) {
        return nombre.endsWith(extension);
    }
}
