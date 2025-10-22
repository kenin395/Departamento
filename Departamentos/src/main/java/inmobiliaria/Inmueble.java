package inmobiliaria;

public abstract class Inmueble {
    private int id;
    private int area; // m2
    private String direccion;

    public Inmueble(int id, int area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;
    }

    public int getId() { return id; }
    public int getArea() { return area; }
    public String getDireccion() { return direccion; }

    // Cada subclase devuelve el valor por m2 correspondiente
    protected abstract double valorPorMetroCuadrado();

    public double calcularValorCompra() {
        return area * valorPorMetroCuadrado();
    }

    @Override
    public String toString() {
        return String.format("%s{id=%d, area=%dm2, direccion='%s', valorCompra=%.2f}",
                this.getClass().getSimpleName(), id, area, direccion, calcularValorCompra());
    }
}
