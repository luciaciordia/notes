package com.apuntes.files;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirFichero {
    public static void main(String[] args) {
        // Creo un fichero fuera del try para que luego pueda cerrarlo en el finally
        FileWriter fichero = null;
        try {
            // Digo la ruta del fichero
            fichero = new FileWriter("c:/prueba.txt");
            PrintWriter pw = new PrintWriter(fichero);

            // Escribo 10 veces Linea 1, Linea 2, Linea 3...
            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            // Si algo va mal se escribira la excepcion por pantalla
            e.printStackTrace();
        } finally {
            // El finally quiere decir que pase lo que pase, vaya bien o vaya mal este trozo de codigo se ejecutara
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
