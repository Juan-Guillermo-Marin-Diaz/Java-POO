package Entity;

import java.util.Scanner;

public class Rectangulo {
    Scanner scan = new Scanner(System.in);
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo(){

        System.out.println("Por favor ingrese la medida de la base del Rectángulo");
        this.base = scan.nextDouble();
        System.out.println("Por favor ingrese la altura del Rectángulo");
        this.altura = scan.nextDouble();
    }
    
    public double superficie(){
        return base * altura;
    }
    
    public double perimetro(){
        return (base + altura) * 2;
    }
    
    public void dibujarRectangulo(){

        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
