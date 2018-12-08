package com.apuntes;

import com.apuntes.model.Person;

public class BasicUsages {

    public static void main(String[] args) {
        // Crear un objecto - Instanciar
        // Crear clase sin parametros
        Person person = new Person();

        //Setter - Sirve para modificar cosas
        person.setName("Lucia");

        //Getter - Sirve para recuperar cosas
        String name = person.getName();
        System.out.println(name); // Imprimira Lucia

        // Ahora voy a modificar el nombre con el setter
        person.setName("Nuevo-Nombre");
        // name no hace falta definirlo otra vez (String name: NO ) porque ya esta arriba
        name = person.getName();
        System.out.println(name); // Imprimira Nuevo-Nombre


        // Crear un objecto - Instanciar
        // Crear clase con parametros
        Person person2 = new Person("Name", "Surname");

        // Como llamar a metodos

        // 1 - Funcion - Siempre recupera un valor
        // En este caso devuelve un String;
        String completeName = person2.getCompleteName();
        System.out.println(completeName); // Imprimira "Name Surname"

        // 2 - Procedimiento - No devuelve nada solo hay que llamarlo y ya esta
        person2.borrar();


        // Como pasar por parametro para que lo reciba otro objeto.
        person.inicializar("HolaEsteEsMiNombre");
    }
}
