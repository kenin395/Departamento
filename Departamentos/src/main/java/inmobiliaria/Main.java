package inmobiliaria;

public class Main {
    public static void main(String[] args) {
        CasaRural rural = new CasaRural(1, 120, "Km 45 - Parroquia X", 3, 2, 2, 80.5, 2200);
        CasaConjuntoCerrado conjunto = new CasaConjuntoCerrado(2, 200, "Urbanización Y", 4, 3, 2, 150.0, true);
        CasaIndependiente independiente = new CasaIndependiente(3, 180, "Calle Principal 123", 4, 3, 2);

        ApartaEstudio estudio = new ApartaEstudio(4, 35, "Edificio Apto 1", 1, 30.0);
        DepartamentoFamiliar fam = new DepartamentoFamiliar(5, 90, "Residencial B", 3, 2, 80.0);

        LocalComercial local = new LocalComercial(6, 60, "Mall Central - Local 45", Localizacion.CALLE, "Mall Central");
        Oficina gov = new Oficina(7, 150, "Av. Gobierno 100", Localizacion.INTERNO, true);

        Inmueble[] inmuebles = {rural, conjunto, independiente, estudio, fam, local, gov};

        for (Inmueble i : inmuebles) {
            System.out.println(i);
            System.out.printf("Valor de compra: %.2f\n\n", i.calcularValorCompra());
        }
    }
}
