package escuela;

/**
 * Clase HIJA 2: AlumnoBecado.
 * Es un alumno que tiene una beca por sus buenas notas.
 * Hereda de Alumno y le agrega el dato de la beca.
 */
public class AlumnoBecado extends Alumno {

    // Atributo propio
    private double montoBeca;

    public AlumnoBecado(String nombre, String escuela, String grado, double montoBeca) {
        super(nombre, escuela, grado);
        this.montoBeca = montoBeca;
    }

    // POLIMORFISMO: el becario estudia más fuerte porque quiere mantener su beca
    @Override
    public void estudiar() {
        System.out.println(nombre + " (becado con $" + montoBeca
                + ") está estudiando muy duro para no perder su beca.");
    }

    public double getMontoBeca() {
        return montoBeca;
    }

    public void setMontoBeca(double montoBeca) {
        this.montoBeca = montoBeca;
    }
}