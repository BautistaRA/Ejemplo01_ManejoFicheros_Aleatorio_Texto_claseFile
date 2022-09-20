package USO_GESTION_FICHEROS;
import java.io.File;
public class Ej05_Listado_ficheros_Uso_Clase_Filtro {
    public static void main(String[] args) {
        System.out.println("Archivos en el directorio actual:");
        File f = new File("E:\\_AD_Presencial\\10_UDidacticas");
        String[] archivos = f.list();
        
        System.out.println("-----------TODOS LOS ARCHIVOS ............");
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
        
        String  ext = ".pdf";
        String[] archivosDoc = f.list(new Filtro(ext));
        System.out.println("\n\n----------- ARCHIVOS CON EXTENSIÓN "+ext+ " --------------");
        for (int i = 0; i < archivosDoc.length; i++) {
            System.out.println(archivosDoc[i]);
        }
    }
}
