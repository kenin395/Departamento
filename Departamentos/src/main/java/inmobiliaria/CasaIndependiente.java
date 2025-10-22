package inmobiliaria;

public class CasaIndependiente extends CasaUrbana {
    private static final double VALOR_M2 = 400.0;

    public CasaIndependiente(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int pisos) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos, pisos);
    }

    @Override
    protected double valorPorMetroCuadrado() {
        return VALOR_M2;
    }
}
