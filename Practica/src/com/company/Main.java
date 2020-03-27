package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* EJERCICIO 13
        double cateto1 = 0;
        double cateto2 = 0;
        double hipotenusa = 0;
        System.out.println("Ingrese cateto1:\n");
        cateto1 = in.nextDouble();
        System.out.println("Ingrese cateto2:\n");
        cateto2 = in.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        System.out.println("Cateto1 : "+ cateto1 + " Cateto2 : "+ cateto2 + " Hipotenusa: " + hipotenusa );
        */
        /*EJERCICIO 14
        double r = 0;
        double volumen = 0;
        System.out.println("Ingrese radio:\n");
        r = in.nextDouble();
        volumen = 4 * (Math.PI) * (Math.pow(r,3)) / 3;
        System.out.println("Volumen: "+ volumen);
        */
        /* EJERCICIO 16
        int r = 0;

        System.out.println("Ingrese numero de 3 cifras:\n");
        r = in.nextInt();
        String numero = "";
        numero = Integer.toString(r);
        System.out.println("Cifra 1 = "+numero.charAt(0));
        System.out.println("Cifra 2 = "+numero.charAt(1));
        System.out.println("Cifra 3 = "+numero.charAt(2));
        */
        /* EJERCICIO 18

        int h = 0;
        int m = 0;
        int s = 0;
        System.out.println("Ingrese horas:\n");
        h = in.nextInt();
        System.out.println("Ingrese minutos:\n");
        m = in.nextInt();
        System.out.println("Ingrese segundos:\n");
        s = in.nextInt();

        if ((h<24) && (m<60) && (s<60)){
            System.out.println("Son las: " + h + " horas " + m + " minutos " + s + " segundos");
        } else {
            System.out.println("Ingreso un horario invalido");
        }

         */


    }
}