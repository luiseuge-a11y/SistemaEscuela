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

    
