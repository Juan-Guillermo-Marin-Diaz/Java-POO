package Entity;

public class Matematica {

    private double numero1;
    private double numero2;

    public Matematica() {

    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double devolverMayor( ) {

        return Math.max(this.numero1, this.numero2);
    }

    public double calcularPotencial() {
       double numero1redon = Math.round(this.numero1);
       double numero2redon = Math.round(this.numero2);

       double mayor = Math.max(this.numero1, this.numero2);
       double menor = Math.min(this.numero1, this.numero2);

       double potencia = Math.pow(mayor, menor);

       return potencia;
    }

    public double calcularRaiz() {

        double menor = Math.min(this.numero1, this.numero2);

        double menorAbsoluto = Math.abs(menor);

        return Math.sqrt(menorAbsoluto);
    }
}
