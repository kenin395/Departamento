package inmobiliaria; // Define el paquete donde se encuentra la clase

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase abstracta Departamento que hereda de Vivienda.
 * Sirve como base para todos los tipos de inmuebles que son unidades dentro
 * de un edificio (apartamentos, apartaestudios, etc.).
 * Introduce el atributo común 'valorAdministracion' que es inherente a este tipo
 * de propiedades. Al ser abstracta, no se pueden crear instancias directas
 * de ella, sino solo de sus clases hijas concretas.
 */
// Clase abstracta Departamento que extiende de la clase Vivienda
public abstract class Departamento extends Vivienda {

    // Atributo adicional común a todos los departamentos
    // Es el valor de la cuota mensual de administración del edificio o conjunto.
    private double valorAdministracion;

    /*
     * Constructor de la clase abstracta Departamento
     * @param id Identificador único del inmueble
     * @param area Área total en metros cuadrados
     * @param direccion Dirección o ubicación del departamento (incluye número de apto)
     * @param numeroHabitaciones Cantidad de habitaciones
     * @param numeroBanos Cantidad de baños
     * @param valorAdministracion Costo mensual de la administración del edificio
     */
    public Departamento(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, double valorAdministracion) {
        // Llama al constructor de la clase padre Vivienda para inicializar los atributos heredados
        super(id, area, direccion, numeroHabitaciones, numeroBanos);
        // Inicializa el atributo propio
        this.valorAdministracion = valorAdministracion;
    }

    // Método getter para acceder al atributo privado

    /**
     * Obtiene el valor de la cuota de administración mensual.
     * @return Valor de la administración.
     */
    public double getValorAdministracion() { return valorAdministracion; }

    /*
     * Sobrescribe el método toString para mostrar la información del departamento.
     * Llama a super.toString() para obtener los datos de Vivienda (id, área, dirección, etc.)
     * y añade el valor de la administración.
     * Las clases hijas pueden sobrescribir este método para incluir más detalles.
     */
    @Override
    public String toString() {
        return String.format("%s, administracion=%.2f",
                super.toString(), valorAdministracion);
    }

    /*
     * Nota: Esta clase hereda el método abstracto calcularPrecioVenta() de Inmueble
     * (a través de Vivienda). Dado que 'Departamento' es abstracta, no está obligada
     * a implementar dicho método abstracto, delegando esta responsabilidad a
     * sus clases hijas concretas (por ejemplo, ApartaEstudio o ApartamentoFamiliar).
     */
}