package Ejercicio08CadenaGuia8;

import Entity.Cadena;

import java.util.Scanner;

public class Ejercicio08CadenaGuia8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cadena cadena = new Cadena();

        System.out.println("Por favor ingrese una frase");
        cadena.setFrase(scan.nextLine());
        System.out.println("El número de vocales en le frase es: " + cadena.mostrarVocales(cadena.getFrase()) + " " +
                "vocales");

        System.out.println("La frase " + cadena.getFrase() + " invertida queda " + cadena.invertirFrase(cadena.getFrase()));

        System.out.println("Por favor ingrese una letra");
        String letter = scan.nextLine();
        System.out.println("La letra " + letter + " se repite " + cadena.vecesRepetido(letter) + " veces  en la frase " + cadena.getFrase());

        System.out.println("Por favor ingrese una frase");
        String newFrase = scan.nextLine();
        cadena.compararLogintud(cadena.getFrase(), newFrase);

        System.out.println("Por favor ingrese una frase nueva");
        String newFrase1 = scan.nextLine();
        System.out.println("Las frases unidas quedan " + cadena.unirFrases(cadena.getFrase(), newFrase1));

        System.out.println("Por favor ingrese una letra para reemplazar la a en la frase");
        String nuevaLetra = scan.next();
        System.out.println("La frase con el reemplazo de letra queda: " + cadena.reemplazar("a", nuevaLetra));

        System.out.println("Por favor ingrese una letra para buscar en la frase");
        String letraBuscar = scan.next();
        System.out.println("¿La frase contiene la letra buscada? " +  cadena.contiene(letraBuscar));

    }
}
