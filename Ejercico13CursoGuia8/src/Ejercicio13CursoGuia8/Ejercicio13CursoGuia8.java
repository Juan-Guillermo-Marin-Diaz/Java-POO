package Ejercicio13CursoGuia8;

import Entity.Curso;

public class Ejercicio13CursoGuia8 {

    public static void main(String[] args) {

        Curso curso = new Curso();

        //curso.cargarAlumnos();
        curso.crearCurso();
        System.out.println("Las ganancias semanales son de: $" + curso.calcularGananciaSemanal());
    }
}
