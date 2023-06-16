package Ejercicio12ClasePersonaGuia8;

import Entity.Persona;

import java.util.Scanner;

public class Ejercicio12ClasePersonaGuia8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Persona persona = new Persona();

        persona.crearPersona();

        persona.calcularEdad();

        System.out.println("Por favor ingrese otra edad en años ");
        int otraEdad = scan.nextInt();
        System.out.println("¿Es la edad de " + persona.getNombre() + " menor que la otra edad ingresada? " + persona.menorQue(otraEdad));

        persona.mostrarPersona();

    }
}
