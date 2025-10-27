/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase abstracta que modela un inmueble dentro del sistema inmobiliario.
 * Contiene atributos comunes a cualquier tipo de inmueble (id, área, dirección)
 * y define el comportamiento general para calcular el valor de compra.
 */

package inmobiliaria; // Define el paquete donde se encuentra la clase

// Clase abstracta Inmueble, que servirá como base para diferentes tipos de propiedades
public abstract class Inmueble {

    // Atributos comunes a todos los inmuebles
    private int id;            // Identificador único del inmueble
    private int area;          // Área del inmueble en metros cuadrados
    private String direccion;  // Dirección o ubicación del inmueble

    /*
     * Constructor de la clase Inmueble
     * @param id Identificador único del inmueble
     * @param area Área del inmueble en metros cuadrados
     * @param direccion Dirección del inmueble
     */
    public Inmueble(int id, int area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;
    }

    // Métodos getter para acceder a los atributos privados
    public int getId() { return id; }               // Devuelve el identificador del inmueble
    public int getArea() { return area; }           // Devuelve el área en m²
    public String getDireccion() { return direccion; } // Devuelve la dirección

    /*
     * Método abstracto que define el valor por metro cuadrado del inmueble.
     * Cada subclase (por ejemplo, Casa, Apartamento, Local) debe implementar
     * su propio valor por m² según el tipo de propiedad.
     */
    protected abstract double valorPorMetroCuadrado();

    /*
     * Calcula el valor total de compra del inmueble multiplicando
     * el área por el valor por metro cuadrado.
     * @return Valor total del inmueble.
     */
    public double calcularValorCompra() {
        return area * valorPorMetroCuadrado();
    }

    /*
     * Sobrescribe el método toString para mostrar la información del inmueble
     * de forma legible, incluyendo su tipo, id, área, dirección y valor de compra.
     */
    @Override
    public String toString() {
        return String.format("%s{id=%d, area=%dm2, direccion='%s', valorCompra=%.2f}",
                this.getClass().getSimpleName(), id, area, direccion, calcularValorCompra());
    }
}
