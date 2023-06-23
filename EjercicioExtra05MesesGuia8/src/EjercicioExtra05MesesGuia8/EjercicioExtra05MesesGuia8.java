package EjercicioExtra05MesesGuia8;

public class EjercicioExtra05MesesGuia8 {

    public static void main(String[] args) {

        StringBuilder stringb = new StringBuilder();

         for (char letra = 'A'; letra <= 'Z' ; letra++) {

         stringb.append(letra);
         }
         String abecedario = stringb.toString();

        System.out.println(abecedario);
    }
}
