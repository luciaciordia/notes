Si usamos sólo FileInputStream, FileOuputStream, FileReader o FileWriter, cada vez que hagamos una lectura o escritura,
se hará fisicamente en el disco duro. Si escribimos o leemos pocos caracteres cada vez, el proceso se hace costoso y lento,
con muchos accesos a disco duro.

Los BufferedReader, BufferedInputStream, BufferedWriter y BufferedOutputStream añaden un buffer intermedio. Cuando leamos
o escribamos, esta clase controlará los accesos a disco.

    Si vamos escribiendo, se guardará los datos hasta que tenga basantes datos como para hacer la escritura eficiente.
    Si queremos leer, la clase leerá muchos datos de golpe, aunque sólo nos dé los que hayamos pedido. En las siguientes lecturas nos dará lo que tiene almacenado, hasta que necesite leer otra vez.

Esta forma de trabajar hace los accesos a disco más eficientes y el programa correrá más rápido.
La diferencia se notará más cuanto mayor sea el fichero que queremos leer o escribir.
