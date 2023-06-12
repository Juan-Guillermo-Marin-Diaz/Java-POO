package Ejercicio04Rectanguloguia8;

import Entity.Rectangulo;

public class Ejercicio04RectanguloGuia8 {

    public static void main(String[] args) {
        Rectangulo rectan = new Rectangulo();

        rectan.crearRectangulo();
        System.out.println("La Superficie del Restángulo es: " + rectan.superficie() + " unidades cuadradas");
        System.out.println("El Perímetro del Rectángulo es: "+ rectan.perimetro() + " unidades lineales");
        rectan.dibujarRectangulo();

    }
}
