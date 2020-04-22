package com.company;

public class Staff extends Persona{

    private int salario;
    private String turno;


    public Staff(){}

    public Staff(int dni,String nombre,String apellido,String email,String direccion, int salario,String turno){
        super(dni,nombre,apellido,email,direccion);
        this.salario = salario;
        this.turno = turno;
    }






}
