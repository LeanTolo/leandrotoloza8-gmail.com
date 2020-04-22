package com.company;

public class RectanguloEj3 extends ColorEj3 {

    private double alto = 1.0;
    private double largo = 1.0;

    public RectanguloEj3(){

    }

    public RectanguloEj3(double alto,double largo,String color){
        super(color);
        this.alto = alto;
        this.largo = largo;
    }

    public double calculaArea(){
        return (alto*largo);
    }

    public double calculaPerimetro(){
        return (2*alto+2*largo);
    }

    @Override
    public String toString(){
        return "\n\nRectangulo: \nAlto: "+this.alto+"\nLargo: "+this.largo+"\nColor: "+getColor()+"\nArea: "+calculaArea()+"\nPerimetro: "+calculaPerimetro();
    }

    public double getLargo() {
        return largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }


}
