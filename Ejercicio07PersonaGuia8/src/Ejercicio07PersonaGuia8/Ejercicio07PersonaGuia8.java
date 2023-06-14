package Ejercicio07PersonaGuia8;

import Entity.Persona;

public class Ejercicio07PersonaGuia8 {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        persona1.crearPersona();
        persona1.calcularIMC();
        persona1.esMayorDeEdad(0);

        persona2.crearPersona();
        persona2.calcularIMC();
        persona2.esMayorDeEdad(0);

        persona3.crearPersona();
        persona3.calcularIMC();
        persona3.esMayorDeEdad(0);

        persona4.crearPersona();
        persona4.calcularIMC();
        persona4.esMayorDeEdad(0);

    }
}
