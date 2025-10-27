package inmobiliaria; // Define el paquete donde se encuentra la clase

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase principal (Main) para demostrar el uso de la jerarquía de clases de Inmuebles.
 * Crea instancias de cada tipo de inmueble y las almacena en un arreglo.
 * Itera sobre el arreglo para imprimir la descripción de cada inmueble y calcular su precio de venta.
 * NOTA: Asume la existencia de los métodos 'calcularValorCompra()' y 'valorPorMetroCuadrado()'
 * en la jerarquía de Inmueble.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Creación de instancias de Casas
        CasaRural rural = new CasaRural(1, 120, "Km 45 - Parroquia X", 3, 2, 2, 80.5, 2200);
        CasaConjuntoCerrado conjunto = new CasaConjuntoCerrado(2, 200, "Urbanización Y", 4, 3, 2, 150.0, true);
        CasaIndependiente independiente = new CasaIndependiente(3, 180, "Calle Principal 123", 4, 3, 2);

        // 2. Creación de instancias de Departamentos
        ApartaEstudio estudio = new ApartaEstudio(4, 35, "Edificio Apto 1", 1, 30.0);
        DepartamentoFamiliar fam = new DepartamentoFamiliar(5, 90, "Residencial B", 3, 2, 80.0);

        // 3. Creación de instancias de Locales (Comerciales y Oficinas)
        // Se usa Localizacion.CALLE y Localizacion.INTERNO del enum
        LocalComercial local = new LocalComercial(6, 60, "Mall Central - Local 45", Localizacion.CALLE, "Mall Central");
        Oficina gov = new Oficina(7, 150, "Av. Gobierno 100", Localizacion.INTERNO, true);

        // 4. Arreglo polimórfico de tipo Inmueble
        Inmueble[] inmuebles = {rural, conjunto, independiente, estudio, fam, local, gov};

        // 5. Iteración y demostración de polimorfismo
        for (Inmueble i : inmuebles) {
            // Imprime la descripción completa del inmueble usando el método toString() de cada clase
            System.out.println(i);
            // Calcula y muestra el precio de venta (polimorfismo en acción)
            System.out.printf("Valor de compra: %.2f\n\n", i.calcularValorCompra());
        }
    }
}