package inmobiliaria; // Define el paquete donde se encuentra la clase

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase concreta DepartamentoFamiliar que hereda de la clase abstracta Departamento.
 * Representa una unidad de vivienda con un tamaño y distribución adecuados para
 * una familia (típicamente con dos o más habitaciones).
 * Hereda todas las características de un Departamento (incluyendo el valor de la administración)
 * y define un valor por metro cuadrado específico para este segmento del mercado inmobiliario.
 */
// Clase concreta DepartamentoFamiliar que extiende de Departamento
public class DepartamentoFamiliar extends Departamento {

    // Valor constante por metro cuadrado específico para los departamentos familiares
    private static final double VALOR_M2 = 300.0;

    /*
     * Constructor de la clase DepartamentoFamiliar
     * Asume que tendrá más de una habitación, permitiendo un número variable de habitaciones
     * a diferencia del ApartaEstudio.
     * @param id Identificador único del inmueble
     * @param area Área total en metros cuadrados
     * @param direccion Dirección o ubicación del departamento familiar
     * @param numeroHabitaciones Cantidad de habitaciones (usualmente 2 o más)
     * @param numeroBanos Cantidad de baños
     * @param valorAdministracion Costo mensual de la administración del edificio
     */
    public DepartamentoFamiliar(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, double valorAdministracion) {
        // Llama al constructor de la clase padre Departamento para inicializar todos los atributos heredados
        super(id, area, direccion, numeroHabitaciones, numeroBanos, valorAdministracion);
    }

    /*
     * Implementación del método abstracto valorPorMetroCuadrado().
     * Define el valor por m² específico para los departamentos familiares,
     * usado para el cálculo del precio de venta.
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