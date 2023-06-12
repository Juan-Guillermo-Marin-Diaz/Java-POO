package Entity;

import java.util.Scanner;

public class Operacion {

    Scanner scan = new Scanner(System.in);
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion(){

        System.out.println("Por favor ingrese el primer número");
        setNumero1(scan.nextDouble());
        System.out.println("Por favor ingrese el segundo número");
        setNumero2(scan.nextDouble());
    }

    public double sumar(){
        return numero1 + numero2;
    }

    public double restar(){
        return numero1 - numero2;
    }

    public double multiplicar(){
        if (numero1 == 0 || numero2 == 0){
            System.out.println("Uno o ambos números ingresados es cero por ende el resultado de la multiplicación es " +
                    "cero");
            return 0;

        } else {
            return numero1 * numero2;
        }
    }

    public double dividir(){
        if (numero2 == 0){
            System.out.println("La división por cero no está definida");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
}
