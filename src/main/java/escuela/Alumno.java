package escuela;

// Importamos las colecciones que vamos a usar
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Esta es la clase PADRE. De aquí van a heredar las demás clases.
 * Piensa en ella como una "plantilla general" de lo que es un alumno.
 */
public class Alumno {

    // =========================================================
    // ATRIBUTOS (las "cosas" que tiene un alumno)
    // =========================================================

    // Atributo PÚBLICO: cualquiera puede verlo
    public String nombre;

    // Atributo PROTEGIDO: lo pueden ver la misma clase y sus hijas
    protected String escuela;

    // Atributo PRIVADO: solo se puede ver desde esta clase (usamos getters/setters)
    private String grado;

    // ---------- Variables de tipo PRIMITIVO y su versión OBJETO ----------
    // (van intercaladas como pidió el profe)

    // 1) Edad: primitiva (int) y objeto (Integer)
    private int edad_primitiva;
    private Integer edad_objeto;

    // 2) Altura: primitiva (double) y objeto (Double)
    private double altura_primitiva;
    private Double altura_objeto;

    // 3) Promedio: primitivo (float) y objeto (Float)
    private float promedio_primitivo;
    private Float promedio_objeto;

    // 4) Asistencia: primitivo (boolean) y objeto (Boolean)
    private boolean asistencia_primitiva;
    private Boolean asistencia_objeto;

    // 5) Inicial del nombre: primitivo (char) y objeto (Character)
    private char inicial_primitiva;
    private Character inicial_objeto;

    // 6) Matrícula: primitivo (long) y objeto (Long)
    private long matricula_primitiva;
    private Long matricula_objeto;

    // 7) Nivel (1°, 2°, 3°...): primitivo (byte) y objeto (Byte)
    private byte nivel_primitivo;
    private Byte nivel_objeto;

    // ---------- COLECCIONES ----------
    // Cada una guarda cosas distintas, como si fueran cajitas

    // Lista de materias (ArrayList = lista normal, rápida)
    protected ArrayList<String> materias;

    // Lista de calificaciones (LinkedList = lista encadenada, útil para agregar/quitar)
    private LinkedList<Float> calificaciones;

    // Conjunto de amigos (HashSet = NO repite nombres)
    private HashSet<String> amigos;

    // Mapa de "materia -> calificación" (HashMap = guarda pares clave-valor)
    private HashMap<String, Float> notas;

    // =========================================================
    // CONSTRUCTOR (cómo se crea un alumno)
    // =========================================================
    public Alumno(String nombre, String escuela, String grado) {
        this.nombre = nombre;
        this.escuela = escuela;
        this.grado = grado;

        // Inicializamos las colecciones para que no estén vacías
        this.materias = new ArrayList<>();
        this.calificaciones = new LinkedList<>();
        this.amigos = new HashSet<>();
        this.notas = new HashMap<>();
    }

    // =========================================================
    // GETTERS Y SETTERS (para ver y cambiar los datos privados)
    // =========================================================

    // GETTER: nos devuelve el grado
    public String getGrado() {
        return grado;
    }

    // SETTER: nos deja cambiar el grado
    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getEdad_primitiva() {
        return edad_primitiva;
    }

    public void setEdad_primitiva(int edad_primitiva) {
        this.edad_primitiva = edad_primitiva;
    }

    public Integer getEdad_objeto() {
        return edad_objeto;
    }

    public void setEdad_objeto(Integer edad_objeto) {
        this.edad_objeto = edad_objeto;
    }

    public double getAltura_primitiva() {
        return altura_primitiva;
    }

    public void setAltura_primitiva(double altura_primitiva) {
        this.altura_primitiva = altura_primitiva;
    }

    public Double getAltura_objeto() {
        return altura_objeto;
    }

    public void setAltura_objeto(Double altura_objeto) {
        this.altura_objeto = altura_objeto;
    }

    public float getPromedio_primitivo() {
        return promedio_primitivo;
    }

    public void setPromedio_primitivo(float promedio_primitivo) {
        this.promedio_primitivo = promedio_primitivo;
    }

    public Float getPromedio_objeto() {
        return promedio_objeto;
    }

    public void setPromedio_objeto(Float promedio_objeto) {
        this.promedio_objeto = promedio_objeto;
    }

    public boolean isAsistencia_primitiva() {
        return asistencia_primitiva;
    }

    public void setAsistencia_primitiva(boolean asistencia_primitiva) {
        this.asistencia_primitiva = asistencia_primitiva;
    }

    public Boolean getAsistencia_objeto() {
        return asistencia_objeto;
    }

    public void setAsistencia_objeto(Boolean asistencia_objeto) {
        this.asistencia_objeto = asistencia_objeto;
    }

    public char getInicial_primitiva() {
        return inicial_primitiva;
    }

    public void setInicial_primitiva(char inicial_primitiva) {
        this.inicial_primitiva = inicial_primitiva;
    }

    public Character getInicial_objeto() {
        return inicial_objeto;
    }

    public void setInicial_objeto(Character inicial_objeto) {
        this.inicial_objeto = inicial_objeto;
    }

    public long getMatricula_primitiva() {
        return matricula_primitiva;
    }

    public void setMatricula_primitiva(long matricula_primitiva) {
        this.matricula_primitiva = matricula_primitiva;
    }

    public Long getMatricula_objeto() {
        return matricula_objeto;
    }

    public void setMatricula_objeto(Long matricula_objeto) {
        this.matricula_objeto = matricula_objeto;
    }

    public byte getNivel_primitivo() {
        return nivel_primitivo;
    }

    public void setNivel_primitivo(byte nivel_primitivo) {
        this.nivel_primitivo = nivel_primitivo;
    }

    public Byte getNivel_objeto() {
        return nivel_objeto;
    }

    public void setNivel_objeto(Byte nivel_objeto) {
        this.nivel_objeto = nivel_objeto;
    }
    // =========================================================
    // GETTERS Y SETTERS PARA COLECCIONES
    // =========================================================

    // GETTER para calificaciones (LinkedList)
    public LinkedList<Float> getCalificaciones() {
        return calificaciones;
    }

    // SETTER para calificaciones
    public void setCalificaciones(LinkedList<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }

    // GETTER para amigos (HashSet)
    public HashSet<String> getAmigos() {
        return amigos;
    }

    // SETTER para amigos
    public void setAmigos(HashSet<String> amigos) {
        this.amigos = amigos;
    }

    // GETTER para notas (HashMap)
    public HashMap<String, Float> getNotas() {
        return notas;
    }

    // SETTER para notas
    public void setNotas(HashMap<String, Float> notas) {
        this.notas = notas;
    }

    // =========================================================
    // MÉTODO POLIMÓRFICO (las hijas lo van a reescribir)
    // =========================================================
    // Este método dice qué hace un alumno al estudiar.
    // Cada tipo de alumno lo hará a su manera.
    public void estudiar() {
        System.out.println(nombre + " está estudiando sus materias normales.");
    }

    // Método para mostrar info general (lo usaremos en el Main)
    public void mostrarInfo() {
        System.out.println("=== Información del Alumno ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Escuela: " + escuela);
        System.out.println("Grado: " + getGrado());
        System.out.println("Edad (primitiva): " + edad_primitiva);
        System.out.println("Edad (objeto): " + edad_objeto);
        System.out.println("Altura (primitiva): " + altura_primitiva + " m");
        System.out.println("Altura (objeto): " + altura_objeto + " m");
        System.out.println("Promedio (primitivo): " + promedio_primitivo);
        System.out.println("Promedio (objeto): " + promedio_objeto);
        System.out.println("¿Asistió? (primitivo): " + asistencia_primitiva);
        System.out.println("¿Asistió? (objeto): " + asistencia_objeto);
        System.out.println("Inicial (primitiva): " + inicial_primitiva);
        System.out.println("Inicial (objeto): " + inicial_objeto);
        System.out.println("Matrícula (primitiva): " + matricula_primitiva);
        System.out.println("Matrícula (objeto): " + matricula_objeto);
        System.out.println("Nivel (primitivo): " + nivel_primitivo);
        System.out.println("Nivel (objeto): " + nivel_objeto);
        System.out.println("Materias (ArrayList): " + materias);
        System.out.println("Calificaciones (LinkedList): " + calificaciones);
        System.out.println("Amigos (HashSet): " + amigos);
        System.out.println("Notas (HashMap): " + notas);
        System.out.println("================================");
    }
}