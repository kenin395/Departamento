package inmobiliaria; // Define el paquete donde se encuentra la clase

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase concreta LocalComercial que hereda de la clase abstracta Local.
 * Representa un espacio diseñado para actividades comerciales, típicamente ubicado
 * dentro de un centro comercial.
 * Añade el atributo específico del 'centroComercial' al que pertenece.
 * Define un valor por metro cuadrado específico para este tipo de local.
 */
// Clase concreta LocalComercial que extiende de Local
public class LocalComercial extends Local {

    // Atributo adicional propio de un local ubicado en un centro comercial
    private String centroComercial;

    // Valor constante por metro cuadrado específico para los locales comerciales (en este contexto, usualmente en un CC)
    private static final double VALOR_M2 = 400.0;

    /*
     * Constructor de la clase LocalComercial
     * @param id Identificador único del inmueble
     * @param area Área total en metros cuadrados
     * @param direccion Dirección o ubicación del local
     * @param localizacion Tipo de ubicación (INTERNO o CALLE, aunque es más común INTERNO para esta clase)
     * @param centroComercial Nombre del centro comercial donde se ubica el local
     */
    public LocalComercial(int id, int area, String direccion, Localizacion localizacion, String centroComercial) {
        // Llama al constructor de la clase padre Local para inicializar los atributos heredados
        super(id, area, direccion, localizacion);
        // Inicializa el atributo propio
        this.centroComercial = centroComercial;
    }

    // Método getter para acceder al atributo privado

    /**
     * Obtiene el nombre del centro comercial donde se ubica el local.
     * @return Nombre del centro comercial.
     */
    public String getCentroComercial() { return centroComercial; }

    /*
     * Implementación del método abstracto valorPorMetroCuadrado().
     * Define el valor por m² específico para los locales comerciales,
     * usado para el cálculo del precio de venta.
     * @return Valor por metro cuadrado (constante VALOR_M2).
     */
    @Override
    protected double valorPorMetroCuadrado() {
        return VALOR_M2;
    }

    /*
     * Sobrescribe el método toString para mostrar toda la información del inmueble.
     * Llama a super.toString() para obtener los datos de Local (incluyendo la localización)
     * y añade el nombre del centro comercial.
     */
    @Override
    public String toString() {
        return String.format("%s, centroComercial='%s'",
                super.toString(), centroComercial);
    }
}