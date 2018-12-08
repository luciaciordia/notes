package com.apuntes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapUsages {
    public static void main(String[] args) {
        // Crear un mapa clave - valor
        Map<String,Integer> mapa = new HashMap<String, Integer>();
        // Como añadir elementos
        mapa.put("lucia1", 10);
        mapa.put("lucia2", 20);
        mapa.put("lucia3", 30);
        mapa.put("lucia4", 40);
        mapa.put("lucia5", 50);
        mapa.put("lucia6", 60);

        //si repito el insertar en una clave que ya esta estaremos modicando el valor
        mapa.put("lucia3", 9000);

        //recuperar todas las clave
        Set<Map.Entry<String, Integer>> entries = mapa.entrySet();
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            // Clave : entry.getKey Valor : entry.getValue()
            System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
        }

        // Recuperar el valor a partir de una clave
        mapa.get("lucia5"); // 50

        // Ver si existe una clave
        mapa.containsKey("lucia6"); //true
    }
}
