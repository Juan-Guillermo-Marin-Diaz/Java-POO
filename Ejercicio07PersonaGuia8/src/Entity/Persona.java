package Entity;

import java.util.Scanner;

public class Persona {

    Scanner scan = new Scanner(System.in);
    //Declaramos los atributos de la entidad en este caso persona
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    //Hacemos el constructor por defecto o vacío
    public Persona() {
    }

    //Hacemos el constructor por parámetros
    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
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

        System.out.println("Por favor ingrese su nombre");
        setNombre(scan.next());
        System.out.println("Por favor ingrese su edad");
        setEdad(scan.nextInt());
        System.out.println("Por favor ingrese su sexo");
        setSexo(scan.next());

        if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {
            this.sexo = sexo;
        } else {
            System.out.println("El caracter introducido no es correcto, por favor ingrese H para hombre, M para mujer" +
                    " ó O para otro");
            return;
        }


        System.out.println("Por favor ingrese su masa corporal");
        setPeso(scan.nextDouble());
        System.out.println("Por favor ingrese su altura");
        setAltura(scan.nextDouble());



    }

    public void calcularIMC() {

        double pesoIdeal = this.peso / this.altura * this.altura;

        if (pesoIdeal < 20) {
            System.out.println("Usted se encuentra por debajo de su peso ideal");
            pesoIdeal = -1;
        }
        if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            System.out.println("Usted se encuentra en su peso ideal");
            pesoIdeal = 0;
        }
        if (pesoIdeal > 25) {
            System.out.println("Usted está por encima de su peso ideal");
            pesoIdeal = 1;
        }
    }

    public boolean esMayorDeEdad(int age) {

        if (age < 18) {
            System.out.println("Usted es menor de edad");
            return false;
        }
            return true;
    }

}


