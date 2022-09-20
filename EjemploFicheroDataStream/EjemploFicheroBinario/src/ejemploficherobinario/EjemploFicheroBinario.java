/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficherobinario;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kevinsan
 */
public class EjemploFicheroBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       File fichero = new File ("alumno.dat");
        Scanner e = new Scanner (System.in);
        int opc;
        do {
            System.out.println("1.- Grabar fichero.");
            System.out.println("2.- Leer fichero.");
            System.out.println("3.- Buscar.");
            System.out.println("4.- Eliminar fichero.");
            System.out.println("5.- Eliminar Alumno.");
            System.out.println("6.- Salir.");
            opc = e.nextInt();
            
            switch (opc){
                case 1:
                    FAlumnos.grabar(fichero); 
                    break;
                case 2:
                    FAlumnos.leer(fichero);
                    break;
                case 3:
                    FAlumnos.busqueda(fichero);
                    break;
                case 4:
                    if(fichero.exists()){
                        if(fichero.delete()){
                            System.out.println("El fichero ha sido eliminado");
                        }else{
                            System.out.println("El fichero no se puede eliminar");
                        }
                    }else{
                        System.out.println("El fichero no existe");
                    }
                break;
                case 5:
                    FAlumnos.eliminar(fichero);
                break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("opcion erronea");
            }
        }
        while (opc != 6);
    }
 
    }

