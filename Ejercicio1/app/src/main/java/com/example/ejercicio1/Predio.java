package com.example.ejercicio1;

public class Predio {
    private Zona zona;
    private double area;

    public Predio(Zona zona, double area) {
        this.zona = zona;
        this.area = area;
    }

    public double calcularCosto() {
        return zona.getCosto() * area;
    }

    public Zona getZona() {
        return zona;
    }
}
