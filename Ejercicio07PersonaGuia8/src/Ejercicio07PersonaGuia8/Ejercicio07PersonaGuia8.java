package Ejercicio07PersonaGuia8;

import Entity.Persona;

public class Ejercicio07PersonaGuia8 {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Daniela", 15, 'M', 50.0, 1.68 );
        //persona1.crearPersona();
        int imcPersona1 = persona1.calcularIMC();
        boolean esMayorDeEdadPersona1 = persona1.esMayorDeEdad();

        Persona persona2 = new Persona("Juan", 25, 'H', 70.5, 1.75);
        int imcPersona2 = persona2.calcularIMC();
        boolean esMayorDeEdadPersona2 = persona2.esMayorDeEdad();

        Persona persona3 = new Persona("María", 18, 'M', 55.2, 1.65);
        int imcPersona3 = persona3.calcularIMC();
        boolean esMayorDeEdadPersona3 = persona3.esMayorDeEdad();

        Persona persona4 = new Persona("Carlos", 17, 'O', 90.0, 1.80);
        int imcPersona4 = persona4.calcularIMC();
        boolean esMayorDeEdadPersona4 = persona4.esMayorDeEdad();

        int cantidadPersonasPorDebajoPeso = 0;
        int cantidadPersonasPesoIdeal = 0;
        int cantidadPersonasSobrepeso = 0;
        int cantidadPersonasMayoresEdad = 0;
        int cantidadPersonasMenoresEdad = 0;

        // Verificar IMC y mayor de edad para persona1
        if (imcPersona1 == -1) {
            cantidadPersonasPorDebajoPeso++;
        } else if (imcPersona1 == 0) {
            cantidadPersonasPesoIdeal++;
        } else {
            cantidadPersonasSobrepeso++;
        }

        if (esMayorDeEdadPersona1) {
            cantidadPersonasMayoresEdad++;
        } else {
            cantidadPersonasMenoresEdad++;
        }

        if (imcPersona2 == -1) {
            cantidadPersonasPorDebajoPeso++;
        } else if (imcPersona2 == 0) {
            cantidadPersonasPesoIdeal++;
        } else {
            cantidadPersonasSobrepeso++;
        }

        if (esMayorDeEdadPersona2) {
            cantidadPersonasMayoresEdad++;
        } else {
            cantidadPersonasMenoresEdad++;
        }

        if (imcPersona3 == -1) {
            cantidadPersonasPorDebajoPeso++;
        } else if (imcPersona3 == 0) {
            cantidadPersonasPesoIdeal++;
        } else {
            cantidadPersonasSobrepeso++;
        }

        if (esMayorDeEdadPersona3) {
            cantidadPersonasMayoresEdad++;
        } else {
            cantidadPersonasMenoresEdad++;
        }

        if (imcPersona4 == -1) {
            cantidadPersonasPorDebajoPeso++;
        } else if (imcPersona4 == 0) {
            cantidadPersonasPesoIdeal++;
        } else {
            cantidadPersonasSobrepeso++;
        }

        if (esMayorDeEdadPersona4) {
            cantidadPersonasMayoresEdad++;
        } else {
            cantidadPersonasMenoresEdad++;
        }

        // Repetir para las otras personas

        // Calcular porcentajes
        double porcentajePersonasPorDebajoPeso = (double) cantidadPersonasPorDebajoPeso / 4 * 100;
        double porcentajePersonasPesoIdeal = (double) cantidadPersonasPesoIdeal / 4 * 100;
        double porcentajePersonasSobrepeso = (double) cantidadPersonasSobrepeso / 4 * 100;
        double porcentajePersonasMayoresEdad = (double) cantidadPersonasMayoresEdad / 4 * 100;
        double porcentajePersonasMenoresEdad = (double) cantidadPersonasMenoresEdad / 4 * 100;

        // Mostrar resultados
        System.out.println("Resultados:");
        System.out.println("Persona 1 - IMC: " + imcPersona1);
        System.out.println("Persona 1 - Mayor de edad: " + esMayorDeEdadPersona1);
        System.out.println("Persona 2 - IMC: " + imcPersona2);
        System.out.println("Persona 2 - Mayor de edad: " + esMayorDeEdadPersona2);
        System.out.println("Persona 3 - IMC: " + imcPersona3);
        System.out.println("Persona 3 - Mayor de edad: " + esMayorDeEdadPersona3);
        System.out.println("Persona 4 - IMC: " + imcPersona4);
        System.out.println("Persona 4 - Mayor de edad: " + esMayorDeEdadPersona4);
        System.out.println("Cantidad de personas por debajo del peso ideal " + cantidadPersonasPorDebajoPeso + " persona/s");
        System.out.println("Cantidad de personas con el peso ideal " + cantidadPersonasPesoIdeal + " persona/s");
        System.out.println("Cantidad de personas por encima del peso ideal " + cantidadPersonasSobrepeso + " persona/s");
        System.out.println("Cantidad de personas menores de edad " + cantidadPersonasMenoresEdad + " persona/s");
        System.out.println("Cantidad de personas mayores de edad " + cantidadPersonasMayoresEdad + " persona/s");
        System.out.println("Porcentaje de personas por debajo del peso ideal " + porcentajePersonasPorDebajoPeso + "%");
        System.out.println("Porcentaje de personas con peso ideal " + porcentajePersonasPesoIdeal + "%");
        System.out.println("Porcentaje de personas por encima del peso ideal " + porcentajePersonasSobrepeso + "%");
        System.out.println("Porcentaje de personas menores de edad " + porcentajePersonasMenoresEdad + "%");
        System.out.println("Porcentaje de personas mayores de edad " + porcentajePersonasMayoresEdad + "%");



    }
}
