package com.company;

public class Circulo {

    private double radio = 1.0;
    private String color = "rojo";

    public Circulo(){

    }

    public Circulo(double radio,String color){
        this.radio = radio;
        this.color = color;
    }

    public double calculaArea(){
        return (Math.PI * Math.pow(radio,2));
    }

    @Override
    public String toString(){
        return "Circulo: \nRadio: "+this.radio+"\nColor: "+this.color;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}
