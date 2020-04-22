package com.company;

public class CicruloEj3 extends ColorEj3{

    private double radio = 1.0;

    public CicruloEj3(){

    }

    public CicruloEj3(double radio,String color){
        super(color);
        this.radio = radio;
    }

    public double calculaArea(){
        return (Math.PI * Math.pow(radio,2));
    }

    public double calculaPerimetro(){
        return (2*Math.PI*radio);
    }

    @Override
    public String toString(){
        return "\n\nCirculo: \nRadio: "+this.radio+"\nColor: "+getColor()+"\nArea: "+calculaArea()+"\nPerimetro: "+calculaPerimetro();
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }


}
