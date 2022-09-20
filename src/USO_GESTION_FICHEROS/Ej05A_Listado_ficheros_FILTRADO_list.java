package USO_GESTION_FICHEROS;
import java.io.File;
public class Ej05A_Listado_ficheros_FILTRADO_list {
    public static void main(String[] args) {
        System.out.println("Archivos en el directorio actual:");
        File f = new File("E:\\_AD_Presencial\\10_UDidacticas");
        String[] archivos = f.list();
        
        System.out.println("-----------LISTADO DE TODOS LOS ARCHIVOS ............");
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
        
        
        String  ext = ".pdf";
        Filtro filtro = new Filtro (ext);
        String[] archivosDoc = f.list(filtro); // list con filtro 
        System.out.println("\n\n----------- LISTADO DE ARCHIVOS CON EXTENSIÓN "+ext+ " --------------");
        for (int i = 0; i < archivosDoc.length; i++) {
            System.out.println(archivosDoc[i]);
        }
    }
}
