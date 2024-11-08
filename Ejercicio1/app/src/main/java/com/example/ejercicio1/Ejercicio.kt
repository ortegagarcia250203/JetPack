package com.example.ejercicio1

import java.util.Arrays

object EjercicioKt {
    @JvmStatic
    fun main(args: Array<String>) {
        // Definimos el catálogo de zonas
        val zonas = mapOf(
            "MAR" to Zona("MAR", "Marginado", 2.00),
            "RUR" to Zona("RUR", "Rural", 8.00),
            "URB" to Zona("URB", "Urbana", 10.00),
            "RES" to Zona("RES", "Residencial", 25.00)
        )

        // Solicitamos ingresar la edad de la persona
        print("Ingrese la edad de la persona: ")
        val edad: Int = readLine()?.toIntOrNull() ?: 0

        // Solicitamos ingresar si la persona es madre soltera (true/false)
        print("¿Es la persona madre soltera? (true/false): ")
        val esMadreSoltera: Boolean = readLine()?.toBoolean() ?: false

        // Solicitamos ingresar la cantidad de predios que tiene la persona
        print("Ingrese la cantidad de predios que tiene la persona: ")
        val cantidadPredios: Int = readLine()?.toIntOrNull() ?: 0

        // Definimos una lista para almacenar los predios
        val predios = mutableListOf<Predio>()

        // Recorremos la cantidad de predios para solicitar los datos de cada uno
        for (i in 1..cantidadPredios) {
            println("Predio $i:")

            // Solicitamos la clave de la zona
            print("Ingrese la clave de la zona (MAR, RUR, URB, RES): ")
            val claveZona: String? = readLine()

            // Validamos que la clave ingresada sea válida
            val zona = zonas[claveZona?.toUpperCase()]
            if (zona == null) {
                println("Zona no válida. Por favor, ingrese una clave correcta.")
                return
            }

            // Solicitamos el área del predio
            print("Ingrese el área del predio en metros cuadrados: ")
            val area: Double = readLine()?.toDoubleOrNull() ?: 0.0

            // Creamos el predio y lo agregamos a la lista
            val predio = Predio(zona, area)
            predios.add(predio)
        }

        // Definimos una persona con los predios ingresados
        val persona = Persona("Juan Pérez", edad, esMadreSoltera, predios)

        // Calculamos el impuesto total para el mes de Enero
        val calculoImpuesto = CalculoImp()
        val mes = 1 // Enero
        val impuesto = calculoImpuesto.calcularImpuestoTotal(persona, mes)

        println("El impuesto total a pagar en el mes $mes es: $impuesto")
    }
}
