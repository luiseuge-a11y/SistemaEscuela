package escuela;

/**
 * Clase HIJA 1: AlumnoRegular.
 * Hereda TODO lo que tiene Alumno (nombre, edad, colecciones, etc.)
 * pero le agrega su propio toque.
 */
public class AlumnoRegular extends Alumno {

    // Atributo propio de esta clase hija
    private String salon;

    // Constructor: llama al constructor del padre con "super"
    public AlumnoRegular(String nombre, String escuela, String grado, String salon) {
        super(nombre, escuela, grado); // le pasa los datos al padre
        this.salon = salon;
    }

    // POLIMORFISMO: reescribimos el método "estudiar" del padre
    // Ahora el alumno regular estudia de una forma más tranquila
    @Override
    public void estudiar() {
        System.out.println(nombre + " (alumno regular del salón " + salon
                + ") está leyendo su libro de texto.");
    }

    // Getter y setter del atributo propio
    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }
}