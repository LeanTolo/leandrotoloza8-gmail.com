package com.company;

public class Propiedades {
    private int ancho = 1;
    private int largo = 1;
    private int area = 0;
    private int perimetro = 0;

    public Propiedades (int ancho, int largo){
        this.ancho = ancho;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getArea() { return (this.largo * this.ancho); }

    public int getPerimetro (){ return (this.largo * 2 + 2 * this.ancho); }
}
