package Ejercicio11ClaseDateGuia8;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio11ClaseDateGuia8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese el año");
        int anio = scan.nextInt();
        System.out.println("Por favor ingrese el mes");
        int mes = scan.nextInt();
        System.out.println("Por favor ingrese el día");
        int dia = scan.nextInt();

        Date fechaingresada = new Date(anio - 1900, mes - 1, dia);

        System.out.println("Fecha ingresada: " + fechaingresada);

        Date fechaActual = new Date();

        int diferenciaDeAnios = fechaActual.getYear() - fechaingresada.getYear();

        System.out.println("La cantidad de años de diferencia entre la fecha ingresada y la fecha actual es:\n " + diferenciaDeAnios + " años");

    }
}
