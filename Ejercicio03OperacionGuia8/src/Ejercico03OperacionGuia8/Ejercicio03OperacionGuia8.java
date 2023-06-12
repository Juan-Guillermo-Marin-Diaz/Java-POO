package Ejercico03OperacionGuia8;

import Entity.Operacion;

public class Ejercicio03OperacionGuia8 {

    public static void main(String[] args) {

        Operacion operBasicas = new Operacion();
        operBasicas.crearOperacion();
        System.out.println("El resultado de la suma es: " + operBasicas.sumar());
        System.out.println("El resultado de la resta es: " + operBasicas.restar());
        System.out.println("El resultado de la multiplicación es: " + operBasicas.multiplicar());
        System.out.println("El resultado de la división es: " + operBasicas.dividir());

    }
}
