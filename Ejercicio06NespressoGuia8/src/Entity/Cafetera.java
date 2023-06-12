package Entity;

import java.util.Scanner;

public class Cafetera {

    Scanner scan = new Scanner(System.in);

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        capacidadMaxima = 0;
        cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {

        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int tamañoTaza) {

        if (cantidadActual >= tamañoTaza) {
            cantidadActual -= tamañoTaza;
            System.out.println("La taza se ha llenado");
        } else {
            int cantidadServida = cantidadActual;
            cantidadActual = 0;
            System.out.println("La taza no se pudo llenar. La cantidad en la taza es " + cantidadServida + "unidades " +
                    "de café");
        }

    }

    public void vaciarCafetera() {

        cantidadActual = 0;
    }

    public void agregarCafe(int cantidad) {

        cantidadActual += cantidad;
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
    }
}
