package com.company;

public class Main {

    public static void main(String[] args) {

        //EJERCICIO 1

        /*

        Autor AutorJoshua = new Autor ("Joshua","Bloch","joshua@email.com",'M');
        System.out.println(AutorJoshua.getAutor());
        Autor AutorPepe = new Autor ("Pepe","Comunista","pepecomunista@email.com",'M');
        Libro LibroJava = new Libro("Effective Java",""+AutorJoshua.getAutor()+"\n"+AutorPepe.getAutor(),450,150);

        System.out.println(LibroJava.getLibro());

        LibroJava.getPrecio(500);
        LibroJava.getStock(50);
        System.out.println("\n\n");
        System.out.println(LibroJava.getLibro());

        */

        //EJERCICIO 2


        /*

        ItemVenta[] Item = new ItemVenta[2];

        ItemVenta Item1 = new ItemVenta("Caramelos","Sabor Dulce de Leche",10);
        ItemVenta Item2 = new ItemVenta("Chocolate","Chocolate Blanco",20);

        Item[0]=Item1;
        Item[1]=Item2;

        Cliente Pepe = new Cliente("Pepe","pepe@email.com",0.85);

        Factura Fac1 = new Factura(Pepe, LocalDate.now(),Item);

        System.out.println(Fac1.getFactura());

        */

        //EJERCICIO 3


        /*


        Cliente3 CuentaLauta = new Cliente3("Lauta",'M');

        Cliente3 CuentaPepe = new Cliente3("Tolo",'M');

        System.out.println(CuentaLauta.getCliente());
        System.out.println(CuentaPepe.getCliente());

        Cuenta cuenta1 = new Cuenta(11000,CuentaLauta);

        cuenta1.depositar(5000);

        cuenta1.extraer(3000);

        cuenta1.extraer(3000);

        cuenta1.depositar(5000);

        cuenta1.extraer(5000);

        cuenta1.depositar(4000);

        cuenta1.extraer(2000);

        System.out.println(cuenta1.getCuenta());

        cuenta1.mostrarMemoria();

        */
    }
}
