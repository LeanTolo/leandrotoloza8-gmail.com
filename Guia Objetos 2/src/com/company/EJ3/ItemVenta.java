package com.company.EJ3;

public class ItemVenta {

    private static int id = 0;
    private String nombre;
    private String descripcion;
    public double precioU;

    public ItemVenta(String nombre, String descripcion, double precioU){
        this.id ++;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioU = precioU;
    }




}
