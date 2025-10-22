package inmobiliaria;

public class CasaRural extends Casa {
    private double distanciaALaCapital; // km
    private double altitud; // msnm

    private static final double VALOR_M2 = 200.0;

    public CasaRural(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos,
                     int pisos, double distanciaALaCapital, double altitud) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos, pisos);
        this.distanciaALaCapital = distanciaALaCapital;
        this.altitud = altitud;
    }

    public double getDistanciaALaCapital() { return distanciaALaCapital; }
    public double getAltitud() { return altitud; }

    @Override
    protected double valorPorMetroCuadrado() {
        return VALOR_M2;
    }

    @Override
    public String toString() {
        return String.format("%s, distanciaCapital=%.2fkm, altitud=%.2fm",
                super.toString(), distanciaALaCapital, altitud);
    }
}
