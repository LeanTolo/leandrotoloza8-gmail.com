package com.company;

public class CuadradoEj3 extends RectanguloEj3{

    public CuadradoEj3(){
        super (1,1,"Sin color");
    }

    public CuadradoEj3(double lado1,String color){
        super(lado1,lado1,color);
    }

    @Override
    public String toString(){
        return "\n\nCuadrado: \nLado: "+getAlto()+"\nColor: "+getColor()+"\nArea: "+calculaArea()+"\nPerimetro: "+calculaPerimetro();
    }

}
