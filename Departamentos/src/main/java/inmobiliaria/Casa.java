/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase abstracta Casa que hereda de Vivienda.
 * Representa un tipo de vivienda que incluye el atributo adicional "pisos",
 * el cual indica el número de niveles o plantas que tiene la casa.
 * Sirve como clase base para otros tipos de casas específicas.
 */

package inmobiliaria; // Define el paquete donde se encuentra la clase

// Clase abstracta Casa que extiende de Vivienda
public abstract class Casa extends Vivienda {

    // Atributo que almacena la cantidad de pisos que posee la casa
    private int pisos;

    /*
     * Constructor de la clase Casa
     * @param id Identificador único del inmueble
     * @param area Área total del inmueble en metros cuadrados
     * @param direccion Dirección o ubicación de la casa
     * @param numeroHabitaciones Cantidad de habitaciones de la casa
     * @param numeroBanos Cantidad de baños de la casa
     * @param pisos Número de pisos o niveles de la casa
     */
    public Casa(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int pisos) {
        // Llama al constructor de la clase padre Vivienda para inicializar los atributos heredados
        super(id, area, direccion, numeroHabitaciones, numeroBanos);
        this.pisos = pisos; // Inicializa el atributo propio de la clase Casa
    }

    // Método getter que devuelve el número de pisos de la casa
    public int getPisos() {
        return pisos;
    }

    /*
     * Sobrescribe el método toString para mostrar la información completa de la casa,
     * incluyendo los datos heredados de Vivienda e Inmueble, y el número de pisos.
     */
    @Override
    public String toString() {
        return String.format("%s, pisos=%d", super.toString(), pisos);
    }
}
