/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficherobinario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kevinsan
 */
public class FAlumnos {
    static int matricula;
    static String nombre;
    static float nota;
    public FAlumnos() {
    }
    public static void grabar(File f) throws IOException{
        char respuesta;
        DataOutputStream fdo=null;
        Scanner e=new Scanner(System.in);
        try{
            fdo=new DataOutputStream(new FileOutputStream(f,true));
            do{
              System.out.println("matricula-->");
              matricula=e.nextInt();  
              System.out.println("nombre-->");
              nombre=e.next();
              System.out.println("nota-->");
              nota=e.nextFloat();
              fdo.writeInt(matricula);
              fdo.writeUTF(nombre);
              fdo.writeFloat(nota);  
              System.out.println("otro registro(S/N)");
              respuesta=e.next().charAt(0);
              System.in.skip(System.in.available());
              //limpia el buffer intermedio
            }while(respuesta=='s'|| respuesta=='S');
        }
        catch(IOException ex){
           System.out.println(ex.toString());
        }
        finally{
            if(fdo!=null){
                fdo.close();}
        }
        
    }  
    public static void leer(File f) throws IOException{
        DataInputStream fdi=null;
        boolean fin=false;
        try{
            fdi=new DataInputStream(new FileInputStream(f));
            //leo registros y los muestro 
            //mientras no se acbe el fichero
            do{
                matricula=fdi.readInt();
                nombre=fdi.readUTF();
                nota=fdi.readFloat();
                System.out.println(matricula+" "+nombre+" "+nota);
                              
            }while(!fin);           
        }
        catch(EOFException eofex){
            fin=true;
        }
        catch(IOException ex){
            System.out.println(ex.toString());
        }
        finally{
            if(fdi!=null){
                fdi.close();}
        }
    }
    
    
    
    public static void busqueda(File f) throws IOException{
        DataInputStream fdi=null;
        int matri=0;
        Scanner e=new Scanner(System.in);
        boolean fin=false;
        try{
            fdi=new DataInputStream(new FileInputStream(f));
            
            System.out.println("Teclee la matricula del alumno que busca");
            matri=e.nextInt();
            //leo registros y los muestro 
            //mientras no se acbe el fichero
            do{
                matricula=fdi.readInt();
                nombre=fdi.readUTF();
                nota=fdi.readFloat();
                if(matricula==matri){
                 System.out.println(matricula+" "+nombre+" "+nota);
                }    
                
                
                
                          
            }while(!fin);           
        }
        catch(EOFException eofex){
            fin=true;
        }
        catch(IOException ex){
            System.out.println(ex.toString());
        }
        finally{
            if(fdi!=null){
                fdi.close();}
        }
    }
    
    
     public static void eliminar(File f) throws IOException{
        DataInputStream fdi=null;
        DataOutputStream fdo=null;
        String nomb=f.getName();
        File fich=new File("auxiliar.dat");
        int matri=0;
        Scanner e=new Scanner(System.in);
        boolean fin=false;
       if(f.exists()){
        try{
            fdi=new DataInputStream(new FileInputStream(f));
            fdo=new DataOutputStream(new FileOutputStream(fich));
            System.out.println("Teclee la matricula del alumno que desea eliminar ");
            matri=e.nextInt();
            //leo registros y los muestro 
            //mientras no se acbe el fichero
            do{
                matricula=fdi.readInt();
                nombre=fdi.readUTF();
                nota=fdi.readFloat();
                if(matricula!=matri){
                  fdo.writeInt(matricula);
                  fdo.writeUTF(nombre);
                  fdo.writeFloat(nota);  
                }else{
                    System.out.println("El alumno ha sido eliminado");
                }    
                
                
                
                          
            }while(!fin);           
        }
        catch(EOFException eofex){
            fin=true;
           
        }
        catch(IOException ex){
            System.out.println(ex.toString());
           
        }
        finally{
            
              
            if(fdi!=null){
                fdi.close();}
            if(fdo!=null){
            fdo.close();
        }
       
            if(f.delete()){
            fich.renameTo(new File(nomb));
            }
        }
    }else{
            System.out.println("El archivo no existe");
}
 }
}
