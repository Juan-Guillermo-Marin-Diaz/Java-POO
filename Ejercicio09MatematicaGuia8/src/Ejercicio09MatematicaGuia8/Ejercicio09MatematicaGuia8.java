package Ejercicio09MatematicaGuia8;

import Entity.Matematica;

public class Ejercicio09MatematicaGuia8 {

    public static void main(String[] args) {
        Matematica matematica = new Matematica(Math.random(), Math.random());

        System.out.println("El mayor de los números " + matematica.getNumero1() + " y " + matematica.getNumero2() +
                " es: " + matematica.devolverMayor());

        System.out.println("La potencia del número " + matematica.devolverMayor() + " elevado al número menor es " + matematica.calcularPotencial());

        System.out.println("La raíz cuadrada del número menor es " + matematica.calcularRaiz());

    }
}
