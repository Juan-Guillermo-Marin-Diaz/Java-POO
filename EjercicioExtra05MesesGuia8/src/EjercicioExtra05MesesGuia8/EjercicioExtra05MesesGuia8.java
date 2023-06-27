package EjercicioExtra05MesesGuia8;

import java.util.Scanner;

public class EjercicioExtra05MesesGuia8 {

    public static void main(String[] arg) {

        //Declaramos el arreglo meses con los meses del año
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        //Declaramos el mes secreto como tipo String el cual se intentará adivinar
        String mesSecreto = meses[9]; // Mes secreto es octubre en este ejemplo

        //Declaramos la variable adivinado de tipo boolean como false
        boolean adivinado = false;

        //Creamos el objeto scanner para leer la información ingresada por teclado
        Scanner scan = new Scanner(System.in);

        //Hacemos un ciclo while donde el signo de admiración se utiliza como operador de negación lógica lo que invierte el valor de la variable adivinado, en este caso !adivinado verifica si adivinado es false, si adivinado es false !adivinado será true, por esto el ciclo seguirá ejecutandose mientras adivinado sea false
        while (!adivinado) {
            System.out.print("Adivina el mes secreto. Introduce el nombre del mes en minúsculas: ");

            //Declaramos una variable respuesta de tipo String para guardar la información ingresada por teclado con el objeto scan
            String respuesta = scan.nextLine();

            //Generamos un condicional if que va analizar la repuesta ingresada por el usuario y la comparará con los 12 meses en el arreglo y si son iguales mostrará el mensaje !Has acertado
            if (respuesta.equals(mesSecreto)) {
                System.out.println("¡Has acertado!");

                //Cuando adivinado es igual a true el ciclo while deja de ejecutarse
                adivinado = true;

                //Si no acierta se muestra el siguiente mensaje y el código continua ejecutandose
            } else {
                System.out.println("No has acertado. Inténtalo de nuevo.");
            }
        }

        //Se cierra el objeto scan para liberar  recursos y evitar pérdidas de memoria
        scan.close();

    }
}
