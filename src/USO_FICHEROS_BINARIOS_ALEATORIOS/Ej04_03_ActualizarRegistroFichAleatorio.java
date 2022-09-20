/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USO_FICHEROS_BINARIOS_ALEATORIOS;

import es.ES;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
public class Ej04_03_ActualizarRegistroFichAleatorio {
    public static void main(String[] args) throws IOException {
        File fichero = new File("AleatorioEmple.dat");
        //declara el fichero de acceso aleatorio
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        StringBuffer buffer = null;//buffer para almacenar apellido

        int id = ES.leeN("Entra el id");//id a modificar
        String apellidos = ES.leeDeTeclado("Entra Apellidos: ");
        int depto = ES.leeN("Entra depto: ");
        double salario = ES.leeN("Salario: ");
        long posicion = (id - 1) * 36; //(4+20+4+8)  modifico salario y dep
        posicion = posicion + 4 + 20; //sumo el tamaño de ID+apellido
        file.seek(posicion); //nos posicionamos 
//        buffer = new StringBuffer(apellidos);
//        buffer.setLength(10); //10 caracteres para el apellido
//        file.writeChars(buffer.toString());//insertar apellido
        file.writeInt(depto);       //insertar departamento
        file.writeDouble(salario);//insertar salario
        file.close();  //cerrar fichero 
    }
}

