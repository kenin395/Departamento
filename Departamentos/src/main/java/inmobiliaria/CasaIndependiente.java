package inmobiliaria; // Define el paquete donde se encuentra la clase

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase concreta CasaIndependiente que hereda de CasaUrbana.
 * Representa una vivienda unifamiliar que no forma parte de un conjunto cerrado
 * ni comparte muros estructurales significativos con otras propiedades.
 * Hereda todas las características de una Casa Urbana (como la disponibilidad
 * de servicios urbanos) y define su propio valor por metro cuadrado.
 */
// Clase concreta CasaIndependiente que extiende de la clase CasaUrbana
public class CasaIndependiente extends CasaUrbana {

    // Valor constante por metro cuadrado para las casas independientes
    private static final double VALOR_M2 = 400.0;

    /*
     * Constructor de la clase CasaIndependiente
     * @param id Identificador único del inmueble
     * @param area Área total en metros cuadrados
     * @param direccion Dirección o ubicación de la casa
     * @param numeroHabitaciones Cantidad de habitaciones
     * @param numeroBanos Cantidad de baños
     * @param pisos Número de pisos
     */
    public CasaIndependiente(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int pisos) {
        // Llama al constructor de la clase padre CasaUrbana para inicializar todos los atributos heredados
        super(id, area, direccion, numeroHabitaciones, numeroBanos, pisos);
    }

    /*
     * Implementación del método abstracto valorPorMetroCuadrado() heredado de Casa (indirectamente).
     * Define el valor por m² específico para las casas independientes.
     * @return Valor por metro cuadrado (constante VALOR_M2).
     */
    @Override
    protected double valorPorMetroCuadrado() {
        return VALOR_M2;
    }

    /*
     * Nota: La clase CasaIndependiente no tiene atributos propios adicionales,
     * por lo que el método toString() se hereda directamente de CasaUrbana (o de Casa),
     * el cual ya proporciona una descripción completa de sus características básicas
     * (id, área, dirección, habitaciones, baños y pisos).
     * Si fuera necesario añadir una descripción específica, se debería sobrescribir aquí.
     */
}