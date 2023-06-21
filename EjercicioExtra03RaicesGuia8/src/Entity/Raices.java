package Entity;

public class Raices {

    public double a;
    public double b;
    public double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {

        double discriminante = (Math.pow(b, 2) - 4 * a * c);

        return discriminante;
    }

    public boolean tieneRaices() {

        double discriminante = getDiscriminante();
        return discriminante >= 0;
    }

    public boolean tieneRaiz() {

       double discriminante = getDiscriminante();
       return discriminante == 0;
    }

    public void obtenerRaices() {

        if (tieneRaices()) {
            double discriminante = getDiscriminante();
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        } else {
            System.out.println("No existen raices reales para esta ecuación");
        }
    }
}
