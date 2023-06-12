package Entity;

import java.util.Scanner;

public class Circunferencia {

    Scanner scan = new Scanner(System.in);
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(){

        System.out.println("Por favor ingrese el radio de la circunferencia");
        double radio = scan.nextDouble();
        setRadio(radio);
    }

    public double area(){

        return Math.PI * getRadio() * getRadio();
    }

    public double perimetro(){

        return 2 * Math.PI * getRadio();
    }
}

