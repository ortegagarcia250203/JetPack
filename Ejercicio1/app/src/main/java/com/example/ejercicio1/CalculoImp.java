package com.example.ejercicio1;

public class CalculoImp {

    public double calcularDescuento(int edad, boolean esMadreSoltera, int mes) {
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

    public double calcularImpuestoTotal(Persona persona, int mes) {
        double costoTotal = 0.0;
        for (Predio predio : persona.getPredios()) {
            costoTotal += predio.calcularCosto();
        }
        double descuento = calcularDescuento(persona.getEdad(), persona.isMadreSoltera(), mes);
        return costoTotal * (1 - descuento);
    }
}
