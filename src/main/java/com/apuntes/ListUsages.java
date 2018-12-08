package com.apuntes;

import com.apuntes.model.Person;

import java.util.ArrayList;
import java.util.List;

public class ListUsages {
    /**
     * En las listas no importa el orden se trabaja con ellas para recorrer ,añadir y modificar.
     * @param args
     */
    public static void main(String[] args) {

        // Asi se crea una lista
        List<String> stringList = new ArrayList<String>();

        // Como añadir un elemento
        stringList.add("elemento1");
        stringList.add("elemento2");
        stringList.add("elemento3");
        stringList.add("elemento4");

        // Metodo 1: Como recorrer una lista de String/int/boolean
        for (String elemento: stringList) {
            System.out.println(elemento);
        }

        // Metodo 2: Como recorrer una lista de String/int/boolean
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        // si una lista es nula siempre hay que inicializarla sino Nullpointer
        List<Person> personList = null;
        if (personList == null) {
            personList = new ArrayList<Person>();
        }
        // Manera uno de meter objetos
        personList.add(new Person("Lucia1","Ciordia1"));
        personList.add(new Person("Lucia2","Ciordia2"));
        personList.add(new Person("Lucia3","Ciordia3"));

        // Manera dos de meter objetos
        Person person4 = new Person("Lucia4", "Ciordia4");
        personList.add(person4);


        //Para recorrer la lista de objetos creados por mi:
        //Metodo 1: Forma de hacer bucle simple
        for (Person p : personList) {
            System.out.println(p.getName());
        }

        //Lo mismo de otra manera
        //Metodo 2: Forma de hacer bucle con indice
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).getName());
        }

        //Como buscar un elemento recorriendo una lista
        Person elementoBuscado = null;
        for (Person p : personList) {
            // Si Lucia1 coincide con el nombre del elemento p
            // (p es cada uno de los elementos de personList)
            if ("Lucia1".equals(p.getName())) {
                elementoBuscado = p;
            }
        }
        // si lo he encontrado lo pinto
        if (elementoBuscado != null) {
            System.out.println(elementoBuscado.getName());
        } else {
            // Si no lo he encontrado pinto "no encontrado"
            System.out.println("No encontrado.");
        }

        // Modificar todos los elementos de la lista.
        for (Person p : personList) {
            p.setName("mi-nombre");
        }

        //Coger el nombre de la posicion 3 de la lista personList
        personList.get(3).getName();
        // Poner en la posicion 3 de la lista
        personList.set(3, new Person("a", "b"));

        //Borrar posicion 3
        personList.remove(3);

        //Borrar toda la lista
        personList.clear();
    }
}
