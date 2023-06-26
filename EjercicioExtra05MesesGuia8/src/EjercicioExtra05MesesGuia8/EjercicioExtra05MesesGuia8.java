package EjercicioExtra05MesesGuia8;

import java.util.Scanner;

public class EjercicioExtra05MesesGuia8 {

    public static void main(String[] arg) {

        //Declaramos el arreglo meses con los meses del año
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[9]; // Mes secreto es octubre en este ejemplo
        boolean adivinado = false;

        Scanner scanner = new Scanner(System.in);

        while (!adivinado) {
            System.out.print("Adivina el mes secreto. Introduce el nombre del mes en minúsculas: ");
            String respuesta = scanner.nextLine();

            if (respuesta.equals(mesSecreto)) {
                System.out.println("¡Has acertado!");
                adivinado = true;
            } else {
                System.out.println("No has acertado. Inténtalo de nuevo.");
            }
        }

        scanner.close();

    }
}
