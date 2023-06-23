package Entity;

import java.util.Scanner;

public class NIF {

    public long numeroDNI;
    public char letra;

    public long getNumeroDNI() {
        return numeroDNI;
    }

    public void setNumeroDNI(long numeroDNI) {
        this.numeroDNI = numeroDNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void crearNIF() {

        /**StringBuilder stringb = new StringBuilder();

        for (char letra = 'A'; letra <= 'Z' ; letra++) {

            stringb.append(letra);
        }
        String abecedario = stringb.toString();*/

        int resto = (int) (numeroDNI % 23);
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        letra = letras[resto];
    }

    public void mostrar() {

        String nifCompleto = String.format("%08d", numeroDNI) + "-" + Character.toUpperCase(letra);
        System.out.println("NIF: " + nifCompleto);
    }
}
