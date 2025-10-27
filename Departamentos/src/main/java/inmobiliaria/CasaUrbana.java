package inmobiliaria;
// Indica que esta clase pertenece al paquete 'inmobiliaria'.
// Esto ayuda a mantener el código organizado dentro del proyecto.

public abstract class CasaUrbana extends Casa {
    // La clase CasaUrbana es abstracta, por lo tanto no se pueden crear objetos directamente de ella.
    // Extiende (hereda) de la clase Casa, obteniendo todos sus atributos y métodos.
    // Representa un tipo general de casa ubicada en una zona urbana.

    // Constructor de la clase CasaUrbana
    public CasaUrbana(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int pisos) {
        // Llama al constructor de la clase padre 'Casa' usando la palabra clave 'super'
        // para inicializar los atributos heredados.
        super(id, area, direccion, numeroHabitaciones, numeroBanos, pisos);
    }
}