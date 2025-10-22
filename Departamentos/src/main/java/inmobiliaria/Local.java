package inmobiliaria;

public abstract class Local extends Inmueble {
    private Localizacion localizacion; // INTERNO o CALLE

    public Local(int id, int area, String direccion, Localizacion localizacion) {
        super(id, area, direccion);
        this.localizacion = localizacion;
    }

    public Localizacion getLocalizacion() { return localizacion; }

    @Override
    public String toString() {
        return String.format("%s, localizacion=%s", super.toString(), localizacion);
    }
}
