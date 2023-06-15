package Ejercicio10ArreglosGuia8;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio10ArreglosGuia8 {

    public static void main(String[] args) {

        //Definimos los dos arreglos
        double arregloA[] = new double[50];
        double arregloB[] = new double[20];

        /** Podemos contruir el objeto random de la clase Random o usar el metodo Math.random (investigar diferencia
        entre ambos ya que el método Math.random es un pseudo generardor de números aleatorios) para generar para
         generar los números aleatorios*/

        Random random = new Random();

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random();

        }

        System.out.println("El arreglo original: " + Arrays.toString(arregloA));

        Arrays.sort(arregloA);

        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        Arrays.fill(arregloB, 10, arregloB.length, 0.5);

        System.out.println("Arreglo A ordenado: " + Arrays.toString(arregloA));

        System.out.println("Arreglo B combinado: " + Arrays.toString(arregloB));

    }
}
