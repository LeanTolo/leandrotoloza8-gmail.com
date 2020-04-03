package com.company.EJ3;

public class Cliente3 {

    private static int contador = 0;
    private String nombre;
    private char genero;
    private int id;


    public Cliente3(String nombre,char genero){
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre(){
        return (this.nombre);
    }

    public String getCliente(){
        return ("ID: "+this.id+"\nNombre: "+this.nombre+"\nGenero: "+this.genero);
    }




}
