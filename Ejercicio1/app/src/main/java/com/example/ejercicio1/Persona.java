package com.example.ejercicio1;

import java.util.List;

public class Persona {

    private String nombre;
    private int edad;
    private boolean esMadreSoltera;
    private List<Predio> predios;

    public Persona(String nombre, int edad, boolean esMadreSoltera, List<Predio> predios) {
        this.nombre = nombre;
        this.edad = edad;
        this.esMadreSoltera = esMadreSoltera;
        this.predios = predios;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isMadreSoltera() {
        return esMadreSoltera;
    }

    public List<Predio> getPredios() {
        return predios;
    }
}
