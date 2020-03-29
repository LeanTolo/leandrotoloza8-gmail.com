package com.company;

public class Empleado {

    private int dni = 0;
    private String nombre;
    private String apellido;
    private double salario = 0;

    public Empleado(int dni, String nombre,String apellido, double salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void getEmpleado(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Dni: "+this.dni);
        System.out.println("Salario: $"+this.salario);
        System.out.println("");
    }

}
