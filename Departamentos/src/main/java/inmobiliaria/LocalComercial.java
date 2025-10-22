package inmobiliaria;

public class LocalComercial extends Local {
    private String centroComercial;
    private static final double VALOR_M2 = 400.0;

    public LocalComercial(int id, int area, String direccion, Localizacion localizacion, String centroComercial) {
        super(id, area, direccion, localizacion);
        this.centroComercial = centroComercial;
    }

    public String getCentroComercial() { return centroComercial; }

    @Override
    protected double valorPorMetroCuadrado() {
        return VALOR_M2;
    }

    @Override
    public String toString() {
        return String.format("%s, centroComercial='%s'", super.toString(), centroComercial);
    }
}
