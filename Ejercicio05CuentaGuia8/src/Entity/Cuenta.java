package Entity;

import java.util.Scanner;

public class Cuenta {
    Scanner scan = new Scanner(System.in);

    private int numeroCuenta;
    private long DNI;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, Integer DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void cuenta() {

        System.out.println("Por favor ingrese su DNI");
        setDNI(scan.nextInt());
        System.out.println("Por favor ingrese su número de cuenta");
        setNumeroCuenta(scan.nextInt());
    }

    public void ingresar(double ingreso) {

        System.out.println("Por favor digite la cantidad de dinero a ingresar");
        ingreso = scan.nextDouble();
        saldoActual = saldoActual + ingreso;
    }

    public void retirar(double retiro) {

        System.out.println("Por favor digite la cantidad de dinero a retirar");
        retiro = scan.nextDouble();
        saldoActual = saldoActual - retiro;

        if (retiro > saldoActual) {
            saldoActual = 0;
        }
    }

    public void extraccionRapida() {

        System.out.println("Por favor ingrese la cantidad que desea retirar; recuerde que solo se le permitirá " +
                "retirar el 20% de su saldo actual");
        double fastextraction = scan.nextDouble();

        if (fastextraction > saldoActual * 0.20) {

            System.out.println("La cantidad a retirar sobrepasa el porcentaje permitido del 20%");

        } else {

            saldoActual = saldoActual - fastextraction;
        }
    }

    public void consultarSaldo() {

        System.out.println("El saldo disponible en su cuenta es: " + getSaldoActual() + "$");
    }

    public void consultardatos() {

        System.out.println("Confirmar datos de la cuenta\n" + "\nDNI\n" + getDNI() + "\nNúmero de cuenta\n"+  +
                getNumeroCuenta() + "\nSaldo actual\n" + getSaldoActual());
    }
}
