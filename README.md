Sistema de Gestión de Alumnos - Escuela Primaria
Este proyecto es un ejercicio práctico en Java diseñado para aplicar los pilares de la programación orientada a objetos. La idea es simular cómo se estructuraría la información de estudiantes en una escuela, manejando distintos roles y tipos de datos.
¿Qué hace este código?
El sistema se basa en una clase padre (Alumno) y tres clases hijas (AlumnoRegular, AlumnoBecado, AlumnoDeportista). A través de ellas se ponen a prueba varios conceptos:

    Herencia: Las clases hijas aprovechan la estructura base sin reescribir código.
    Polimorfismo: El método estudiar() se comporta diferente según el tipo de alumno, incluso cuando los tratamos a todos como objetos de la clase padre en un ciclo.
    Encapsulamiento: Los datos sensibles o internos están protegidos y solo se modifican o leen a través de getters y setters.
    Colecciones: Se usan ArrayList, LinkedList, HashSet y HashMap para manejar listas de materias, calificaciones, amigos y notas.
    Tipos de datos: Se incluyen 7 pares de variables intercaladas (primitivas y sus equivalentes objeto, como int e Integer) para mostrar cómo Java maneja los valores por defecto (0, null) frente a los asignados.

    Cómo ejecutar el proyecto

    Clona este repositorio en tu máquina:
    Abre la carpeta en IntelliJ IDEA (o tu IDE de preferencia).
    Si usas Maven, asegúrate de que las dependencias se carguen correctamente.
    Ejecuta la clase Main.java ubicada en el paquete escuela.
    Revisa la consola para ver la salida de la herencia, el polimorfismo en el ciclo for y la prueba de los getters/setters.

    
```mermaid
classDiagram
    ...
```
    %% Clase Padre
    class Alumno {
        +String nombre
        #String escuela
        -String grado
        -int edad_primitiva
        -Integer edad_objeto
        -double altura_primitiva
        -Double altura_objeto
        -float promedio_primitivo
        -Float promedio_objeto
        -boolean asistencia_primitiva
        -Boolean asistencia_objeto
        -char inicial_primitiva
        -Character inicial_objeto
        -long matricula_primitiva
        -Long matricula_objeto
        -byte nivel_primitivo
        -Byte nivel_objeto
        #ArrayList~String~ materias
        -LinkedList~Float~ calificaciones
        -HashSet~String~ amigos
        -HashMap~String, Float~ notas
        +Alumno(String, String, String)
        +getGrado() String
        +setGrado(String) void
        +estudiar() void
        +mostrarInfo() void
    }

    %% Clases Hijas
    class AlumnoRegular {
        -String salon
        +AlumnoRegular(String, String, String, String)
        +estudiar() void
        +getSalon() String
        +setSalon(String) void
    }

    class AlumnoBecado {
        -double montoBeca
        +AlumnoBecado(String, String, String, double)
        +estudiar() void
        +getMontoBeca() double
        +setMontoBeca(double) void
    }

    class AlumnoDeportista {
        -String deporte
        +AlumnoDeportista(String, String, String, String)
        +estudiar() void
        +getDeporte() String
        +setDeporte(String) void
    }

    %% Clase Principal
    class Main {
        +main(String[] args) void
    }

    %% Relaciones
    Alumno <|-- AlumnoRegular : "Herencia (extends)"
    Alumno <|-- AlumnoBecado : "Herencia (extends)"
    Alumno <|-- AlumnoDeportista : "Herencia (extends)"
    Main ..> AlumnoRegular : "Crea y usa"
    Main ..> AlumnoBecado : "Crea y usa"
    Main ..> AlumnoDeportista : "Crea y usa"
