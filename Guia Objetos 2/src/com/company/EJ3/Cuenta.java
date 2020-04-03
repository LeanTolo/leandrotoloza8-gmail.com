package com.company.EJ3;

public class Cuenta {

    private static int contador;
    private double balance;
    private int id;
    private Cliente3 cliente;

    private String[] Memoria = new String[10];
    private int i;

    public Cuenta (double balance,Cliente3 cliente){
        contador ++;
        this.id = contador;
        this.balance = balance;
        this.cliente = cliente;
        this.Memoria = Memoria;
        this.i = 0;
    }

    public double setBalance(double balance) {
        return this.balance = balance;
    }

    public String getCuenta() {
        return "Cuenta{Id = " + this.id + " , Balance = $" + this.balance + '}';
    }

    public double depositar(double deposito){
        RegistroDeposito(deposito);
        return (this.balance += deposito);
    }

    public double extraer(double debito){
        if (this.balance < debito-2000){
            System.out.println("Dinero en cuenta Insuficiente");
        }else {
            this.balance -= debito;
            RegistroExtraccion(debito);
        }
        return this.balance;
    }

    public void RegistroDeposito(double deposito){
        if (this.i <10){
            this.Memoria[i] = "El cliente " + cliente.getNombre() + ", depositó " + deposito;
            i++;
        }
    }

    public void RegistroExtraccion(double extraccion){
        if (this.i <10){
            this.Memoria[i] = "El cliente " + cliente.getNombre() + ", extrajo " + extraccion;
            i++;
        }
    }

    public void mostrarMemoria(){
        for(int f=0;f<i;f++){
            System.out.println(Memoria[f]);
        }
    }

}
