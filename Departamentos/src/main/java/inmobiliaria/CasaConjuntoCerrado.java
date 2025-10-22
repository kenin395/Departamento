package inmobiliaria;

public class CasaConjuntoCerrado extends CasaUrbana {
    private double valorAdministracion;
    private boolean incluyeAreasComunes; // piscinas, canchas, etc.

    private static final double VALOR_M2 = 350.0;

    public CasaConjuntoCerrado(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos,
                               int pisos, double valorAdministracion, boolean incluyeAreasComunes) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos, pisos);
        this.valorAdministracion = valorAdministracion;
        this.incluyeAreasComunes = incluyeAreasComunes;
    }

    public double getValorAdministracion() { return valorAdministracion; }
    public boolean isIncluyeAreasComunes() { return incluyeAreasComunes; }

    @Override
    protected double valorPorMetroCuadrado() {
        return VALOR_M2;
    }

    @Override
    public String toString() {
        return String.format("%s, admin=%.2f, areasComunes=%b",
                super.toString(), valorAdministracion, incluyeAreasComunes);
    }
}

