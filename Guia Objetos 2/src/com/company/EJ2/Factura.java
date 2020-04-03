package com.company.EJ2;

import com.company.EJ3.ItemVenta;

import java.time.LocalDate;
import java.util.UUID;


public class Factura {

    private String idfac;
    public Cliente cliente;
    private  LocalDate date = LocalDate.now();;
    private double montoTotal = 0;
    private double montoDescuento;

    private ItemVenta[] Item;

    public Factura(Cliente cliente, LocalDate date,ItemVenta[] Item){
        this.Item = Item;
        this.idfac = UUID.randomUUID().toString();
        this.cliente = cliente;
        this.date = date;
        this.montoTotal = getMontoTotal();
        this.montoDescuento = (getMontoTotal() * (1- cliente.getDescuento()/100));
    }

    public String getFactura(){
        return ("ID: "+this.idfac+"\nFecha: "+this.date+"\nMonto: $"+montoTotal+"\nMonto con Descuento: $"+montoDescuento+"\nCliente: "+this.cliente.getCliente());
    }

    public double getMontoTotal() {
        int i = 0;
        double monto = 0;
        while (i < 2){
            monto += Item[i].precioU;
            i++;
        }
        return monto;
    }
}
