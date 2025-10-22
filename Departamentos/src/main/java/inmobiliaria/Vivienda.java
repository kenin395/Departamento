package inmobiliaria;

public abstract class Vivienda extends Inmueble {
    private int numeroHabitaciones;
    private int numeroBanos;

    public Vivienda(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(id, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }

    public int getNumeroHabitaciones() { return numeroHabitaciones; }
    public int getNumeroBanos() { return numeroBanos; }

    @Override
    public String toString() {
        return String.format("%s, habitaciones=%d, baños=%d, valorCompra=%.2f",
                super.toString(), numeroHabitaciones, numeroBanos, calcularValorCompra());
    }
}
