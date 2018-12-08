package com.apuntes;

public class TypesUsages {
    // Constante cosa que jamas cambia
    public static final String NAME = "NAME";

    // Metodo static vs metodo normal

    // Static :
    // Sera llamado como TypesUsages.sumarA(10,20) (ClassName.method())
    public static int sumarA (int a, int b) {
        return a + b;
    }

    //Normal
    // Sera llamaddo
    // TypeUsages typeUsages = new TypeUsages();
    // typeUsages.sumarB(10, 20)   (instanciaDeObjeto.method())
    public int sumarB (int a, int b) {
        return a + b;
    }

}
