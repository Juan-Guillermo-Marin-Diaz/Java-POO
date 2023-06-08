package mascotapp;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Mascota m1 = new Mascota("Fernando Grandote", scan.next(), "Perro");

        m1.setNombre("Pepe Grandote");

        m1.pasear(100);
        System.out.println(m1.toString());

    }
    
}