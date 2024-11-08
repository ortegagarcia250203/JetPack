package com.example.ejercicio1;

public class Zona {
    private String clave;
    private String nombre;
    private double costo;

    public Zona(String clave, String nombre, double costo) {
        this.clave = clave;
        this.nombre = nombre;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }
}
