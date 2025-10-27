package inmobiliaria; // Define el paquete donde se encuentra la clase

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase concreta Oficina que hereda de la clase abstracta Local.
 * Representa un espacio destinado a actividades administrativas o profesionales.
 * A diferencia de un LocalComercial, el valor puede variar si el cliente es
 * una entidad gubernamental, lo cual se registra con el atributo 'esGobierno'.
 * Define un valor por metro cuadrado específico para este tipo de inmueble.
 */
// Clase concreta Oficina que extiende de Local
public class Oficina extends Local {

    // Atributo adicional propio de una oficina
    // Indica si la oficina es usada o destinada para una entidad de gobierno.
    private boolean esGobierno;

    // Valor constante por metro cuadrado específico para las oficinas
    private static final double VALOR_M2 = 450.0;

    /*
     * Constructor de la clase Oficina
     * @param id Identificador único del inmueble
     * @param area Área total en metros cuadrados
     * @param direccion Dirección o ubicación de la oficina
     * @param localizacion Tipo de ubicación (INTERNO o CALLE, usando el enum Localizacion)
     * @param esGobierno Booleano que indica si la oficina es para uso gubernamental
     */
    public Oficina(int id, int area, String direccion, Localizacion localizacion, boolean esGobierno) {
        // Llama al constructor de la clase padre Local para inicializar los atributos heredados
        super(id, area, direccion, localizacion);
        // Inicializa el atributo propio
        this.esGobierno = esGobierno;
    }

    // Método getter para acceder al atributo privado

    /**
     * Verifica si la oficina es para uso gubernamental.
     * @return True si es para una entidad de gobierno, False en caso contrario.
     */
    public boolean isEsGobierno() { return esGobierno; }

    /*
     * Implementación del método abstracto valorPorMetroCuadrado().
     * Define el valor por m² específico para las oficinas,
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
     * y añade si la oficina es de uso gubernamental.
     */
    @Override
    public String toString() {
        return String.format("%s, esGobierno=%b",
                super.toString(), esGobierno);
    }
}