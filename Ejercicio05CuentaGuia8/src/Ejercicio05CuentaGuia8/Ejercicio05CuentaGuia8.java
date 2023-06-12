package Ejercicio05CuentaGuia8;

import Entity.Cuenta;

public class Ejercicio05CuentaGuia8 {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        cuenta.cuenta();
        cuenta.ingresar(0);
        cuenta.consultarSaldo();
        cuenta.retirar(0);
        cuenta.consultarSaldo();
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.consultardatos();
    }
}
