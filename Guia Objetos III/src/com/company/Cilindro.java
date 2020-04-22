package com.company;

public class Cilindro extends Circulo{

    private double altura = 1;

    public Cilindro(){

    }

    public Cilindro(double radio,String color,double altura){
        super (radio,color);
        this.altura = altura;
    }

    public double calculaVolumen(){
        return (Math.PI * Math.pow(super.getRadio(),2)*this.altura);
    }

    @Override
    public double calculaArea() {
        return (2*Math.PI*getRadio()*this.altura + 2 * super.calculaArea());
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de "+super.toString()+"\nAltura= "+this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
}
