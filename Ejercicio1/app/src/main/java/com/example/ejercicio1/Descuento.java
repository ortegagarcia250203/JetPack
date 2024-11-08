package com.example.ejercicio1;


public class Descuento {

    public double calcular(int edad, boolean esMadreSoltera, int mes) {
        if ((edad >= 70 || esMadreSoltera) && (mes == 1 || mes == 2)) {
            return 0.70;
        } else if ((edad >= 70 || esMadreSoltera) && (mes >= 3 && mes <= 12)) {
            return 0.50;
        } else if (mes == 1 || mes == 2) {
            return 0.40;
        } else {
            return 0.0;
        }
    }
}
