package Entity;

import java.util.Scanner;

public class Persona {

    Scanner scan = new Scanner(System.in);
    //Declaramos los atributos de la entidad en este caso persona
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    //Hacemos el constructor por defecto o vacío
    public Persona() {
    }

    //Hacemos el constructor por parámetros
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Implementamos los métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {

        //System.out.println("Por favor ingrese su nombre");
        //setNombre(scan.next());
        //System.out.println("Por favor ingrese su edad");
        //setEdad(scan.nextInt());
        //System.out.println("Por favor ingrese su sexo");
        //setSexo(scan.next().charAt(0));
        //System.out.println("Por favor ingrese su masa corporal en kg");
        //setPeso(scan.nextDouble());
        //System.out.println("Por favor ingrese su altura en metros");
        //setAltura(scan.nextDouble());

        //Hacemos uso del ciclo while para validar el sexo
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.print("Sexo incorrecto. Ingrese el sexo nuevamente (H, M, O): ");
            setSexo(scan.next().charAt(0));
        }
    }

    public int calcularIMC() {

        double pesoIdeal = this.peso / (this.altura * this.altura);

        if (pesoIdeal < 20) {
            return -1;
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

}


