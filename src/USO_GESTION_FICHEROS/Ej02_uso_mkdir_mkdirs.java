package USO_GESTION_FICHEROS;

import java.io.File; 
public class Ej02_uso_mkdir_mkdirs { 
    public static void main(String[] args) { 
    boolean status;
    status = new File("miDir").mkdir(); // éxíto
    report(status); 
    status = new File("./miDir\\dir2").mkdir(); // éxíto
    report(status); 
    status = new File("./miDir\\dir1\\dir2").mkdir(); // fallará 
    report(status); 
    status = new File("./miDir\\dir1\\dir3").mkdirs(); // éxíto 
    report(status); 
    } 
    static void report (boolean b) { 
        System.out.println (b ? "éxito" : "fallo"); } }