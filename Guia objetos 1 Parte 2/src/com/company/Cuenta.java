package com.company;

public class Cuenta {

    private int id;
    private String nombre;
    private double balance;

    public Cuenta (int id, String nombre, double balance){
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public double setBalance(double balance) {
        return this.balance = balance;
    }

    public String getCuenta() {
        return "Cuenta{Id = " + this.id + " , Nombre = " + this.nombre  + " , Balance = $" + this.balance + '}';
    }

    public double UsarCredito(double credito){
        return (credito + this.balance);
    }

    public double UsarDebito(double debito){
        if (this.balance < debito){
            System.out.println("Dinero en cuenta Insuficiente");
        }else {
            this.balance -= debito;
        }
        return this.balance;
    }



}
