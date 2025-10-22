package inmobiliaria;

public abstract class Casa extends Vivienda {
    private int pisos;

    public Casa(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int pisos) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos);
        this.pisos = pisos;
    }

    public int getPisos() { return pisos; }

    @Override
    public String toString() {
        return String.format("%s, pisos=%d", super.toString(), pisos);
    }
}
