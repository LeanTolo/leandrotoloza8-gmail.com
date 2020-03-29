package com.company;

public class Hora {

    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos){
        this.horas = getHoras(horas);
        this.minutos = getMinutos(minutos);
        this.segundos = getSegundos(segundos);
    }

    int getHoras (int h){
        if ((-1 < h) && (h < 24)){
            this.horas = h;
        }else{
            System.out.println("Horas mal ingresadas");
        }
        return this.horas;
    }

    int getMinutos (int m){
        if ((-1<m) && (m<60)){
            this.minutos = m;
        }else{
            System.out.println("Minutos mal ingresados");
        }
        return this.minutos;
    }

    int getSegundos (int s){
        if ((-1<s) && (s<60)){
            this.segundos = s;
        }else{
            System.out.println("Segundos mal ingresados");
        }
        return this.segundos;
    }

    public String AgregaCero(int valor){
        String Frase;
        if (valor < 10){
            Frase = ("0"+valor);
        }else{
            Frase = ""+valor;
        }
        return  Frase;
    }

    public String ImprimeHora(){
        return ("La hora es: "+AgregaCero(this.horas)+":"+AgregaCero(this.minutos)+":"+AgregaCero(this.segundos));
    }

    public void AvanzaSegundo(){
        this.segundos++;
        if (this.segundos == 60){
            this.segundos = 0;
            this.minutos++;
            if (this.minutos == 60){
                this.minutos = 0;
                this.horas++;
                if (this.horas == 24){
                    this.horas = 0;
                }
            }
        }
    }

    public void RetrocedeSegundo(){
        this.segundos--;
        if (this.segundos == -1){
            this.segundos = 59;
            this.minutos--;
            if (this.minutos == -1){
                this.minutos = 59;
                this.horas--;
                if (this.horas == -1){
                    this.horas = 23;
                }
            }
        }
    }

}
