package inmobiliaria; // Define el paquete donde se encuentra la clase

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase abstracta Local que hereda de Inmueble.
 * Sirve como base para todos los inmuebles de tipo comercial.
 * Introduce el atributo clave 'localizacion' (interno o a pie de calle),
 * que es crucial para la valoración de los locales comerciales.
 * Al ser abstracta, no se pueden crear instancias directas de ella,
 * sino solo de sus clases hijas concretas.
 */
// Clase abstracta Local que extiende de la clase abstracta Inmueble
public abstract class Local extends Inmueble {

    // Atributo adicional común a todos los locales comerciales
    // Define si el local está ubicado internamente (ej. en un centro comercial) o a pie de calle.
    private Localizacion localizacion; // INTERNO o CALLE

    /*
     * Constructor de la clase abstracta Local
     * @param id Identificador único del inmueble
     * @param area Área total en metros cuadrados
     * @param direccion Dirección o ubicación del local
     * @param localizacion Tipo de ubicación del local (INTERNO o CALLE, usando el enum Localizacion)
     */
    public Local(int id, int area, String direccion, Localizacion localizacion) {
        // Llama al constructor de la clase padre Inmueble para inicializar los atributos heredados
        super(id, area, direccion);
        // Inicializa el atributo propio
        this.localizacion = localizacion;
    }

    // Método getter para acceder al atributo privado

    /**
     * Obtiene la localización del local (INTERNO o CALLE).
     * @return El valor del enum Localizacion.
     */
    public Localizacion getLocalizacion() { return localizacion; }

    /*
     * Sobrescribe el método toString para mostrar la información del local.
     * Llama a super.toString() para obtener los datos de Inmueble (id, área, dirección)
     * y añade la localización del local.
     * Las clases hijas pueden sobrescribir este método para incluir más detalles.
     */
    @Override
    public String toString() {
        return String.format("%s, localizacion=%s",
                super.toString(), localizacion);
    }

    /*
     * Nota: Esta clase hereda el método abstracto valorPorMetroCuadrado() de Inmueble.
     * Dado que 'Local' es abstracta, no está obligada a implementar dicho método,
     * delegando esta responsabilidad a sus clases hijas concretas (por ejemplo,
     * LocalInterior o LocalComercialCalle), quienes definirán el valor según su localización.
     */
}