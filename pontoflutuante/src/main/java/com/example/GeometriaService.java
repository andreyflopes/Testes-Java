package com.example;

public class GeometriaService {
    public double CalcularAreaTringulo(double base, double altura){
        return(base*altura)/2;
    }

    public double CalcularAreaQuadrado(double lado){
        return(lado*lado);
    }

     public double CalcularAreaRetangulo(double base, double altura){
        return(base*altura);
     }

     public double CalcularAreaCircunferencia(double raio){
        return Math.PI*Math.pow(raio, 2);
     }

    public double CalcularVolumeEsfera(double raio){
        return (4*Math.PI*Math.pow(raio, 3)/3);
    }
}

