/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_GESTION_FICHEROS;

import java.io.File;

/**
 *
 * @author bauti
 */

public class VerDir {
public static void main(String[] args) {
  System.out.println("Archivos en el directorio actual:");
  File f = new File("D:\\AD_Presencial\\_CURSO2021\\Tema01_Ficheros");
  File[] archivos = f.listFiles();
  for (int i = 0; i < archivos.length; i++) {
    	if (archivos[i].isDirectory())
            System.out.println("DIRECTORIO "+ archivos[i].getName());
        else 
            System.out.println("FICHERO "+archivos[i].getName());
  } } }

