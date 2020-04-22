package com.company;

public class Main {

    public static void main(String[] args) {

        /* EJERCICIO 1
        Circulo circ1,circ2;
        circ1 = new Cilindro();
        System.out.println(circ1.toString());
        circ2 = new Cilindro(2,"azul",3);
        System.out.println(circ2.toString());
        System.out.println("\n\nArea del cilindro: "+circ2.calculaArea());
        */

        /*EJERCICIO 2

        Persona est1, est2, est3, est4, staff1, staff2, staff3, staff4;
        est1 = new Estudiante(40513461, "pablo", "loco", "loks@email.com", "casa de pablo", 2001, 2500, "TSP");
        est2 = new Estudiante(28542461, "juan", "malik", "blabnar@email.com", "casa de juan", 2019, 3500, "Maincra");
        est3 = new Estudiante(38513611, "jose", "romero", "ojosso@email.com", "casa de jose", 2006, 9000, "Warzone");
        est4 = new Estudiante(45513411, "pedro", "olok", "ololoks@email.com", "casa de pedro", 2010, 2500, "TSP");
        staff1 = new Staff(41005131, "ruben", "jorobado", "altomail@mail.com", "depto de la mama de ruben", 35000, "mañana");
        staff2 = new Staff(38551312, "franco", "piropero", "email@paja.com", "casa de franco", 460000, "tarde");
        staff3 = new Staff(25000416, "Michael", "Jackson", "@", "Mansion", 980000, "mañana");
        staff4 = new Staff(12005466, "Vieja", "chota", "viejachota@mail.com", "depto de vieja", 65000, "tarde");

        Persona personas[] = {est1, est2, est3, est4, staff1, staff2, staff3, staff4};

        //Ya investigue lo que hace instance off
        int cantEstudiantes = 0;
        int cantStaff = 0;
        double ingresosTot = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] instanceof Estudiante) {
                cantEstudiantes++;
                Estudiante aux = (Estudiante) personas[i];
                ingresosTot += aux.getCuotaMensual();
            } else {
                if (personas[i] instanceof Staff) {
                    cantStaff++;
                }
            }
        }

        System.out.println("Cantidad de Estudiantes: " + cantEstudiantes + "\nCantidad de Staffs : " + cantStaff + "\nIngresos Totales: " + ingresosTot);
        */

        //EJERCICIO 3

        ColorEj3 circ1,cuad1,rect1;

        circ1 = new CicruloEj3(5,"Rojo");
        cuad1 = new CuadradoEj3(5,"Azul");
        rect1 = new RectanguloEj3(5,10,"Violeta");

        System.out.println(circ1.toString());
        System.out.println(cuad1.toString());
        System.out.println(rect1.toString());
        
    }
}
