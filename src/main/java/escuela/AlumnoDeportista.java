package escuela;

/**
 * Clase HIJA 3: AlumnoDeportista.
 * Es un alumno que además estudia, practica un deporte.
 * Hereda de Alumno y agrega el deporte que practica.
 */
public class AlumnoDeportista extends Alumno {

    // Atributo propio
    private String deporte;

    public AlumnoDeportista(String nombre, String escuela, String grado, String deporte) {
        super(nombre, escuela, grado);
        this.deporte = deporte;
    }

    // POLIMORFISMO: el deportista estudia pero también entrena
    @Override
    public void estudiar() {
        System.out.println(nombre + " (deportista de " + deporte
                + ") estudia rápido para ir a entrenar.");
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
}