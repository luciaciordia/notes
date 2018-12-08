package com.apuntes;

import com.apuntes.model.Person;

public class ArrayUsages {
    public static void main(String[] args) {
        // Siempre hay que inicializar los arrays con el Size (Ej. size = 10 )
        // Crear un array de String
        String[] array = new String[10];
        // Crear un array de Person
        Person[] persons = new Person[10];

        // Añadir elementos en posicion deseada
        // Añadir String
        array[0] = "elemento1";
        // Añadir persona
        persons[0] = new Person("name", "surname");

        //Bucle para añadir
        for (int i = 0; i < 9; i++) {
            array[i] = "elemento"+i;
        }
    }
}
