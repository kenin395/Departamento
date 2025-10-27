/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase concreta CasaRural que hereda de Casa.
 * Representa una vivienda ubicada en zonas rurales,
 * incorporando características específicas como la distancia a la capital
 * y la altitud sobre el nivel del mar.
 * Define además un valor fijo por metro cuadrado para este tipo de inmueble.
 */

package inmobiliaria; // Define el paquete donde se encuentra la clase

// Clase concreta CasaRural que extiende de la clase abstracta Casa
public class CasaRural extends Casa {

    // Atributos adicionales propios de una casa rural
    private double distanciaALaCapital; // Distancia a la capital en kilómetros
    private double altitud;              // Altitud sobre el nivel del mar en metros

    // Valor fijo por metro cuadrado para las casas rurales
    private static final double VALOR_M2 = 200.0;

    /*
     * Constructor de la clase CasaRural
     * @param id Identificador único del inmueble
     * @param area Área total en metros cuadrados
     * @param direccion Dirección o ubicación de la casa
     * @param numeroHabitaciones Cantidad de habitaciones
     * @param numeroBanos Cantidad de baños
     * @param pisos Número de pisos
     * @param distanciaALaCapital Distancia desde la casa hasta la capital (en km)
     * @param altitud Altitud del lugar donde se ubica la casa (en metros sobre el nivel del mar)
     */
    public CasaRural(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos,
                     int pisos, double distanciaALaCapital, double altitud) {
        // Llama al constructor de la clase padre Casa para inicializar los atributos heredados
        super(id, area, direccion, numeroHabitaciones, numeroBanos, pisos);
        this.distanciaALaCapital = distanciaALaCapital;
        this.altitud = altitud;
    }

    // Métodos getter para acceder a los atributos privados
    public double getDistanciaALaCapital() { return distanciaALaCapital; } // Devuelve la distancia a la capital
    public double getAltitud() { return altitud; }                         // Devuelve la altitud del terreno

    /*
     * Implementación del método abstracto valorPorMetroCuadrado().
     * Define el valor por m² específico para las casas rurales.
     * @return Valor por metro cuadrado (constante).
     */
    @Override
    protected double valorPorMetroCuadrado() {
        return VALOR_M2;
    }

    /*
     * Sobrescribe el método toString para mostrar toda la información del inmueble,
     * incluyendo los datos heredados de las clases superiores y los atributos propios.
     */
    @Override
    public String toString() {
        return String.format("%s, distanciaCapital=%.2fkm, altitud=%.2fm",
                super.toString(), distanciaALaCapital, altitud);
    }
}
