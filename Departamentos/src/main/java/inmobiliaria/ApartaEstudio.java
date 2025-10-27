package inmobiliaria; // Define el paquete donde se encuentra la clase

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase concreta ApartaEstudio que hereda de la clase abstracta Departamento.
 * Representa una unidad de vivienda pequeña, típicamente de un solo ambiente (o con una
 * habitación única) dentro de un edificio.
 * Se caracteriza por forzar el número de habitaciones a uno (1) en su constructor.
 * Define un valor fijo por metro cuadrado específico para este tipo de inmueble.
 */
// Clase concreta ApartaEstudio que extiende de Departamento
public class ApartaEstudio extends Departamento {

    // Valor constante por metro cuadrado específico para los apartaestudios
    private static final double VALOR_M2 = 200.0;

    /*
     * Constructor de la clase ApartaEstudio
     * Asume que, por definición, un apartaestudio siempre tiene una sola habitación (1).
     * @param id Identificador único del inmueble
     * @param area Área total en metros cuadrados
     * @param direccion Dirección o ubicación del apartaestudio
     * @param numeroBanos Cantidad de baños
     * @param valorAdministracion Costo mensual de la administración del edificio
     */
    public ApartaEstudio(int id, int area, String direccion, int numeroBanos, double valorAdministracion) {
        // Llama al constructor de la clase padre Departamento.
        // Se le pasa '1' como número de habitaciones, forzando la característica del apartaestudio.
        super(id, area, direccion, 1, numeroBanos, valorAdministracion);
    }

    /*
     * Implementación del método abstracto valorPorMetroCuadrado().
     * Este método es heredado indirectamente de Inmueble y define el valor por m²
     * específico para los apartaestudios, usado para calcular su precio de venta.
     * @return Valor por metro cuadrado (constante VALOR_M2).
     */
    @Override
    protected double valorPorMetroCuadrado() {
        return VALOR_M2;
    }

    /*
     * Nota: Esta clase hereda el método toString() de Departamento, el cual ya
     * proporciona una descripción completa de sus características (incluyendo
     * el valor de administración y los datos de Vivienda). No es necesario
     * sobrescribirlo a menos que se desee añadir una descripción específica.
     */
}