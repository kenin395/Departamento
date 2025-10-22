package inmobiliaria;

public class ApartaEstudio extends Departamento {
    private static final double VALOR_M2 = 200.0;

    // Apartaestudio tiene una sola habitación (lo forzamos)
    public ApartaEstudio(int id, int area, String direccion, int numeroBanos, double valorAdministracion) {
        super(id, area, direccion, 1, numeroBanos, valorAdministracion);
    }

    @Override
    protected double valorPorMetroCuadrado() {
        return VALOR_M2;
    }
}
