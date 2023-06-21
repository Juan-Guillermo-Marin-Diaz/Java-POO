package Entity;

public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {

    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public int setLongitud(int longitud) {
        this.longitud = longitud;

        return longitud;
    }


    public int mostrarVocales(String frase){

        int contadorVocales = 0;
        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {

            char c = frase.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }

        }
        return contadorVocales;
    }

    public String invertirFrase(String frase) {

        StringBuilder reversa = new StringBuilder(frase);
        reversa.reverse();

        return reversa.toString();
    }

    public int vecesRepetido(String letra) {

        int contador = 0;

        for (int i = 0; i < this.frase.length(); i++) {

            if (this.frase.charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        return contador;
    }

    public void compararLogintud(String frase, String nuevaFrase) {

        int longitudFrase1 = this.frase.length();
        int longitudNuevaFrase = nuevaFrase.length();

        if (longitudFrase1 == longitudNuevaFrase) {
            System.out.println("La longitud de las frases es igual");
        } else if (longitudFrase1 > longitudNuevaFrase) {
            System.out.println("La longitud de la primera frase es mayor que la de la nueva frase");
        } else {
            System.out.println("La longitud de la primera frase es menor que la frase nueva");
        }
    }

    public String unirFrases(String frase, String nuevaFrase) {

        String fraseUnida = this.frase + " " + nuevaFrase;

        return fraseUnida;
    }

    public String reemplazar(String letra, String caracterDeReemplazo) {

        String fraseReemplazada  = this.frase.replace(letra, caracterDeReemplazo);

        return fraseReemplazada;
    }

    public boolean contiene(String letraABuscar) {

        return frase.contains(letraABuscar);
    }
}
