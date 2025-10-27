package inmobiliaria; // Define el paquete donde se encuentra el enumerado

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Enumerado Localizacion.
 * Define los posibles tipos de ubicación para un Local (comercial o de oficina)
 * según su acceso: dentro de una estructura (INTERNO) o directamente a la vía pública (CALLE).
 * Esta clase es usada por la clase abstracta Local.
 */
// Declaración del tipo enumerado Localizacion
public enum Localizacion {

    /**
     * El local está ubicado dentro de una estructura (ej. edificio de oficinas,
     * centro comercial), sin acceso directo a la calle o vía pública.
     */
    INTERNO,

    /**
     * El local tiene acceso directo a la calle o vía pública,
     * usualmente con una vitrina visible desde el exterior.
     */
    CALLE
}