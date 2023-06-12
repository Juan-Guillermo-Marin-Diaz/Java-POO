package Ejercicio02CircunferenciaGuia8;

import Entity.Circunferencia;

public class Ejercicio02CircunferenciaGuia8 {

    public static void main(String[] args) {

        Circunferencia circum = new Circunferencia(0);

        circum.setRadio(0);

        System.out.println("Inicializando radio de la circunferencia: " + circum.getRadio());

        circum.crearCircunferencia();

        System.out.println("El radio ingresado es: " + circum.getRadio());

        System.out.println("Área de la circunferencia: " + circum.area() + " m^2");

        System.out.println("Perímetro del la circunferencia: " + circum.perimetro() + " m");

    }
}
