package Entity;

import java.util.Scanner;

public class Puntos {

    public double x1, x2, y1, y2;

    public void crearPuntos() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese la coordenada para el eje x1");
        x1 = scan.nextDouble();
        System.out.println("Por favor ingrese la coordenada para y1");
        y1 = scan.nextDouble();
        System.out.println("Por favor ingrese la coordenada para x2");
        x2 = scan.nextDouble();
        System.out.println("Por favor ingrese la coordenada para y2");
        y2 = scan.nextDouble();

    }

    public double calcularDistancia() {

        crearPuntos();

        double distanciaP1P2 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return distanciaP1P2;

    }


}
