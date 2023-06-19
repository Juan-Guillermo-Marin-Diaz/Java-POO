package Entity;

import java.util.Scanner;

public class Movil {

    private String marca;
    private double precio;
    private String modelo;
    private double memoriaRam;
    private double almacenamiento;
    private int codigo[];

    public Movil() {

    }

    public Movil(String marca, double precio, String modelo, double memoriaRam, double almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public void cargarCelular() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese la marca del celular: ");
        setMarca(scan.nextLine());

        System.out.println("Por favor ingrese el modelo del celular: ");
        setModelo(scan.nextLine());

        System.out.println("Por favor ingrese la capacidad de almacenamiento del celular: ");
        setAlmacenamiento(scan.nextDouble());

        System.out.println("Por favor ingrese la capacidad de memoria RAM del celular: ");
        setMemoriaRam(scan.nextDouble());

        System.out.println("Por favor ingrese el precio del celular: ");
        setPrecio(scan.nextDouble());
    }

    public void ingreserCodigo() {

        Scanner scan = new Scanner(System.in);

        codigo = new int[7];

        System.out.println("Por favor ingrese el código de 7 dígitos del celular ");

        for (int i = 0; i < codigo.length; i++) {

            System.out.println("Dígito " + (i + 1) + ": ");
            codigo[i] = scan.nextInt();
        }

        System.out.println("Los datos del celular han sido guardados exitosamente");
    }
}


