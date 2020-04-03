package com.company.EJ1;

public class Libro {

    private String autor;
    private String titulo;
    private double precio;
    private int stock;

    public Libro (String titulo ,String autor, double precio, int stock){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }

    String getLibro(){
        return ("Titulo: "+this.titulo+"\n"+this.autor+"\nPrecio: "+this.precio+"\nStock: "+stock);
    }

    void getPrecio(double aumento){
        this.precio = aumento;
    }

    void getStock(int aumento){
        this.stock += aumento;
    }

}
