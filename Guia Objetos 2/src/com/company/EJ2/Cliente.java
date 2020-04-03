package com.company.EJ2;

import java.text.DecimalFormat;
import java.util.UUID;

public class Cliente {

    private String idcliente ;
    private String nombre;
    private String email;
    private double descuento;
    DecimalFormat f = new DecimalFormat("##.00");


    public Cliente(String nombre,String email,double descuento){
        this.idcliente = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.email = email;
        this.descuento = ((1-descuento)*100);
    }

    public String getCliente(){
        return ("ID: "+this.idcliente+"\nNombre: "+this.nombre+"\nEmail: "+this.email+"\nDescuento: %"+f.format(this.descuento));
    }

    public double getDescuento() {
        return descuento;
    }
}
