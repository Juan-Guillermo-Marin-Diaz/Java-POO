package Entity;

import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private Date fechaDeNacimiento;

    public Persona() {

    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void crearPersona() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre de la persona");
        this.nombre = scan.nextLine();
        System.out.println("Por favor ingrese la fecha de nacimiento de la persona");
        System.out.println("Ingrese el año de nacimiento");
        int year = scan.nextInt();
        System.out.println("Por favor ingrese el mes de nacimiento");
        int month = scan.nextInt();
        System.out.println("por favor ingrese el día de nacimiento");
        int day = scan.nextInt();

        this.fechaDeNacimiento = new Date(year - 1900, month - 1, day);

        //El método scan.close() se utiliza para liberar recursos de memoria
        scan.close();

    }

    public void calcularEdad() {

        System.out.println("En base a su fecha de nacimiento:\n " + getFechaDeNacimiento());

        Date fechaActual = new Date();

        int edadAnios = fechaActual.getYear() - getFechaDeNacimiento().getYear();

        int edadMeses = fechaActual.getMonth() - getFechaDeNacimiento().getMonth();

        int edadDias = fechaActual.getDay() - getFechaDeNacimiento().getDay();

        System.out.println("Su edad es: " + edadAnios + " años / " + edadMeses + " meses / " + edadDias + " dias");

    }

    public boolean menorQue(int edad) {

        if (edad > fechaDeNacimiento.getYear()) {
            return true;
        } else {
            return false;
        }
    }
}
