package inmobiliaria; // Define el paquete donde se encuentra la clase

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase concreta CasaConjuntoCerrado que hereda de CasaUrbana.
 * Representa una vivienda unifamiliar o apartamento dentro de una
 * urbanización o conjunto residencial con administración y posibles
 * áreas comunes.
 * Incorpora el valor de la administración y si incluye o no el uso de dichas áreas.
 * Define un valor fijo por metro cuadrado para este tipo de inmueble.
 */
// Clase concreta CasaConjuntoCerrado que extiende de la clase CasaUrbana
public class CasaConjuntoCerrado extends CasaUrbana {

    // Atributos adicionales propios de una casa en conjunto cerrado
    private double valorAdministracion;        // Valor mensual de la cuota de administración
    private boolean incluyeAreasComunes;        // Indica si la administración cubre el uso de áreas comunes (piscina, canchas, etc.)

    // Valor constante por metro cuadrado para las casas en conjunto cerrado
    private static final double VALOR_M2 = 350.0;

    /*
     * Constructor de la clase CasaConjuntoCerrado
     * @param id Identificador único del inmueble
     * @param area Área total en metros cuadrados
     * @param direccion Dirección o ubicación de la casa
     * @param numeroHabitaciones Cantidad de habitaciones
     * @param numeroBanos Cantidad de baños
     * @param pisos Número de pisos
     * @param valorAdministracion Costo mensual de la administración del conjunto
     * @param incluyeAreasComunes Booleano que indica si la cuota incluye el uso de áreas comunes
     */
    public CasaConjuntoCerrado(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos,
                               int pisos, double valorAdministracion, boolean incluyeAreasComunes) {
        // Llama al constructor de la clase padre CasaUrbana para inicializar los atributos heredados
        // CasaUrbana a su vez llama al constructor de Casa, inicializando todos los datos básicos.
        super(id, area, direccion, numeroHabitaciones, numeroBanos, pisos);
        this.valorAdministracion = valorAdministracion;
        this.incluyeAreasComunes = incluyeAreasComunes;
    }

    // Métodos getter para acceder a los atributos privados

    /**
     * Obtiene el valor de la cuota de administración mensual.
     * @return Valor de la administración.
     */
    public double getValorAdministracion() { return valorAdministracion; }

    /**
     * Verifica si la propiedad incluye el uso de áreas comunes.
     * @return True si incluye el uso de áreas comunes, False en caso contrario.
     */
    public boolean isIncluyeAreasComunes() { return incluyeAreasComunes; }

    /*
     * Implementación del método abstracto valorPorMetroCuadrado() heredado de Casa (indirectamente).
     * Define el valor por m² específico para las casas en conjunto cerrado.
     * @return Valor por metro cuadrado (constante VALOR_M2).
     */
    @Override
    protected double valorPorMetroCuadrado() {
        return VALOR_M2;
    }

    /*
     * Sobrescribe el método toString para mostrar toda la información del inmueble.
     * Incluye los datos heredados de las clases superiores (Casa y CasaUrbana, a través de super.toString())
     * y los atributos propios (valorAdministracion e incluyeAreasComunes).
     * El formato '%.2f' se usa para mostrar el valor de administración con dos decimales.
     */
    @Override
    public String toString() {
        return String.format("%s, admin=%.2f, areasComunes=%b",
                super.toString(), valorAdministracion, incluyeAreasComunes);
    }
}