package inmobiliaria;

public abstract class Departamento extends Vivienda {
    private double valorAdministracion; // aplicable según tipo (apartamento de familia y apartaestudio)

    public Departamento(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, double valorAdministracion) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }

    public double getValorAdministracion() { return valorAdministracion; }

    @Override
    public String toString() {
        return String.format("%s, administracion=%.2f", super.toString(), valorAdministracion);
    }
}
