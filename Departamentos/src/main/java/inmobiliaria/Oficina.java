package inmobiliaria;

public class Oficina extends Local {
    private boolean esGobierno;
    private static final double VALOR_M2 = 450.0;

    public Oficina(int id, int area, String direccion, Localizacion localizacion, boolean esGobierno) {
        super(id, area, direccion, localizacion);
        this.esGobierno = esGobierno;
    }

    public boolean isEsGobierno() { return esGobierno; }

    @Override
    protected double valorPorMetroCuadrado() {
        return VALOR_M2;
    }

    @Override
    public String toString() {
        return String.format("%s, esGobierno=%b", super.toString(), esGobierno);
    }
}
