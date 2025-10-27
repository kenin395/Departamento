/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase abstracta Vivienda que hereda de Inmueble.
 * Representa un tipo de inmueble destinado a la vivienda,
 * añadiendo atributos específicos como el número de habitaciones y baños.
 */

package inmobiliaria; // Define el paquete donde se encuentra la clase

// Clase abstracta Vivienda que extiende de Inmueble
public abstract class Vivienda extends Inmueble {

    // Atributos adicionales específicos de una vivienda
    private int numeroHabitaciones; // Cantidad de habitaciones de la vivienda
    private int numeroBanos;        // Cantidad de baños de la vivienda

    /*
     * Constructor de la clase Vivienda
     * @param id Identificador único del inmueble
     * @param area Área total en metros cuadrados
     * @param direccion Dirección o ubicación de la vivienda
     * @param numeroHabitaciones Cantidad de habitaciones
     * @param numeroBanos Cantidad de baños
     */
    public Vivienda(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        // Llama al constructor de la clase padre (Inmueble)
        super(id, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }

    // Métodos getter para acceder a los atributos privados
    public int getNumeroHabitaciones() { return numeroHabitaciones; } // Devuelve el número de habitaciones
    public int getNumeroBanos() { return numeroBanos; }               // Devuelve el número de baños

    /*
     * Sobrescribe el método toString para mostrar la información detallada
     * de la vivienda, incluyendo los datos heredados de Inmueble y los propios.
     */
    @Override
    public String toString() {
        return String.format(
                "%s, habitaciones=%d, baños=%d, valorCompra=%.2f",
                super.toString(), numeroHabitaciones, numeroBanos, calcularValorCompra()
        );
    }
}

