package inmobiliaria;

public class DepartamentoFamiliar extends Departamento {
    private static final double VALOR_M2 = 300.0;

    public DepartamentoFamiliar(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, double valorAdministracion) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos, valorAdministracion);
    }

    @Override
    protected double valorPorMetroCuadrado() {
        return VALOR_M2;
    }
}
