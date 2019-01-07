package com.apuntes.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFiles {
    public static void main(String[] args) {
        // Creo una funcion copia que copie del origen al destino
        copia("c:/ficheroOrigen.bin", "c:/ficheroDestino.bin");
    }

    public static void copia(String ficheroOriginal, String ficheroCopia) {
        try {
            // Se abre el fichero original para lectura
            FileInputStream fileInput = new FileInputStream(ficheroOriginal);
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);

            // Se abre el fichero donde se hará la copia
            FileOutputStream fileOutput = new FileOutputStream(ficheroCopia);
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);

            // Bucle para leer de un fichero y escribir en el otro.
            byte[] array = new byte[1000];
            // cojo la informacion del origen
            int leidos = bufferedInput.read(array);
            // Voy escribiendola en el destino
            while (leidos > 0) {
                // Escribo lo que acabo de leer
                bufferedOutput.write(array, 0, leidos);
                // Leo mas datos y vuelvo a ejecutar el bucle
                leidos = bufferedInput.read(array);
            }

            // Cierre de los ficheros
            bufferedInput.close();
            bufferedOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
