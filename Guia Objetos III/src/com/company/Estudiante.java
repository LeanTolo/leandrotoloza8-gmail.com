package com.company;

public class Estudiante extends Persona{


    private int añoIngreso;
    private double cuotaMensual;
    private String carrera;


    public Estudiante(){}

    public Estudiante(int dni,String nombre,String apellido,String email,String direccion, int añoIngreso, double cuotaMensual, String carrera){
        super(dni,nombre,apellido,email,direccion);
        this.añoIngreso = añoIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

}
