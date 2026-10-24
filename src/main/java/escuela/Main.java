package escuela;

/**
 * Aquí es donde corre todo el programa.
 * Vamos a crear alumnos, llenar sus datos y ver cómo funcionan
 * la herencia, el polimorfismo y el encapsulamiento.
 */
public class Main {

    public static void main(String[] args) {

        // =========================================================
        // 1) HERENCIA: creamos objetos de las 3 clases hijas
        // =========================================================
        AlumnoRegular r1 = new AlumnoRegular("Luis", "Primaria Benito Juárez", "3°A", "Salón 101");
        AlumnoBecado b1 = new AlumnoBecado("Sofía", "Primaria Benito Juárez", "5°B", 1500.0);
        AlumnoDeportista d1 = new AlumnoDeportista("Carlos", "Primaria Benito Juárez", "4°C", "Fútbol");

        // Los 3 son alumnos, por eso pueden usar los métodos del padre
        System.out.println("--- HERENCIA: los 3 son alumnos ---");
        r1.mostrarInfo();
        b1.mostrarInfo();
        d1.mostrarInfo();

        // =========================================================
        // 2) POLIMORFISMO: guardamos objetos HIJOS en variables PADRE
        // =========================================================
        // Aunque la variable dice "Alumno", el objeto REAL es de la hija.
        // Java va a ejecutar el método de la hija, no el del padre.
        System.out.println("\n--- POLIMORFISMO: variable padre, objeto hijo ---");

        Alumno alumno1 = new AlumnoRegular("Ana", "Primaria Benito Juárez", "2°A", "Salón 202");
        Alumno alumno2 = new AlumnoBecado("Diego", "Primaria Benito Juárez", "6°A", 2000.0);
        Alumno alumno3 = new AlumnoDeportista("María", "Primaria Benito Juárez", "1°B", "Natación");

        // Los metemos en un arreglo para recorrerlos con un for
        Alumno[] listaAlumnos = {alumno1, alumno2, alumno3, r1, b1, d1};

        // CICLO FOR: recorre todos los alumnos y llama a estudiar()
        // Cada uno estudiará a su manera (polimorfismo en acción)
        System.out.println("\n--- CICLO FOR recorriendo todos los alumnos ---");
        for (int i = 0; i < listaAlumnos.length; i++) {
            listaAlumnos[i].estudiar();
        }

        // =========================================================
        // 3) ENCAPSULAMIENTO: usamos getters y setters
        // =========================================================
        // Como los atributos son privados, los cambiamos con setters
        System.out.println("\n--- ENCAPSULAMIENTO: usando setters ---");

        // Le ponemos edad a Luis (el alumno regular)
        r1.setEdad_primitiva(9);
        r1.setEdad_objeto(9);
        r1.setAltura_primitiva(1.35);
        r1.setAltura_objeto(1.35);
        r1.setPromedio_primitivo(9.5f);
        r1.setPromedio_objeto(9.5f);
        r1.setAsistencia_primitiva(true);
        r1.setAsistencia_objeto(true);
        r1.setInicial_primitiva('L');
        r1.setInicial_objeto('L');
        r1.setMatricula_primitiva(2023001L);
        r1.setMatricula_objeto(2023001L);
        r1.setNivel_primitivo((byte) 3);
        r1.setNivel_objeto((byte) 3);

        // Le agregamos materias, calificaciones, amigos y notas
        r1.materias.add("Matemáticas");
        r1.materias.add("Español");
        r1.materias.add("Ciencias");

        r1.getCalificaciones().add(10.0f); // si fuera privado usaríamos setter
        r1.getCalificaciones().add(9.0f);

        r1.getAmigos().add("Sofía");
        r1.getAmigos().add("Carlos");
        r1.getAmigos().add("Sofía"); // ¡no se repite porque es HashSet!

        r1.getNotas().put("Matemáticas", 10.0f);
        r1.getNotas().put("Español", 9.0f);

        // Ahora leemos con getters
        System.out.println("\n--- Datos de Luis con GETTERS ---");
        System.out.println("Edad primitiva: " + r1.getEdad_primitiva());
        System.out.println("Edad objeto: " + r1.getEdad_objeto());
        System.out.println("Altura primitiva: " + r1.getAltura_primitiva());
        System.out.println("Altura objeto: " + r1.getAltura_objeto());
        System.out.println("Promedio primitivo: " + r1.getPromedio_primitivo());
        System.out.println("Promedio objeto: " + r1.getPromedio_objeto());
        System.out.println("Asistencia primitiva: " + r1.isAsistencia_primitiva());
        System.out.println("Asistencia objeto: " + r1.getAsistencia_objeto());
        System.out.println("Inicial primitiva: " + r1.getInicial_primitiva());
        System.out.println("Inicial objeto: " + r1.getInicial_objeto());
        System.out.println("Matrícula primitiva: " + r1.getMatricula_primitiva());
        System.out.println("Matrícula objeto: " + r1.getMatricula_objeto());
        System.out.println("Nivel primitivo: " + r1.getNivel_primitivo());
        System.out.println("Nivel objeto: " + r1.getNivel_objeto());
        System.out.println("Grado (con getter): " + r1.getGrado());

        // Mostramos toda su info
        System.out.println("\n--- Info completa de Luis ---");
        r1.mostrarInfo();
    }
}