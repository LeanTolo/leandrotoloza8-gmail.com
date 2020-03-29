package com.company;

public class Venta {

    private int id;
    private String descripcion;
    private int cantidad;
    private double pUnitario;
    private double pTotal;

    public Venta(int id, String descripcion, int cantidad,double pUnitario,double pTotal){
            this.descripcion = descripcion;
            this.id = id;
            this.cantidad = cantidad;
            this.pTotal = getpTotal(pUnitario,cantidad);
            this.pUnitario = pUnitario;
    }

    public double getpTotal(double pUnitario,int cantidad) {
        return ((pUnitario)*(cantidad));
    }

    public void getVenta(){
        System.out.println("Id: "+this.id);
        System.out.println("Descripcion: "+this.descripcion);
        System.out.println("Cantidad: "+this.cantidad);
        System.out.println("Precio Unitario: $"+this.pUnitario);
        System.out.println("Precio Total: $"+this.pTotal);
        System.out.println("");
    }


}
