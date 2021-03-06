package com.apuntes.model;

public class Person {
    // Atributos
    private String name;
    private String surname;

    // Constructor sin parametros -> new Person()
    public Person() {
    }

    // Constructor con parametros -> new Person("name", "surname")
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Getter
    public String getName() {
        return name;
    }


    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Metodos

    // Metodo que devuelve algo - Funcion
    public String getCompleteName() {
        return name + surname;
    }

    // Metodo que no devuelve nada - Void - Procedimiento
    public void borrar() {
        name = null;
        surname = null;
    }

    // Metodo que no devuelve nada - Procedimiento recibiendo parametros
    public void inicializar(String holaEsteEsMiNombre) {
        name = holaEsteEsMiNombre.toUpperCase();
    }
}
