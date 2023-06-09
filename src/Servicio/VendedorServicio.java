package Servicio;

import Entidades.Vendedor;

import java.util.Date;
import java.util.Scanner;
public class VendedorServicio {

    Scanner scan = new Scanner(System.in);

    public Vendedor altaVendedor(){

        // se instancia un objeto tipo vendedor
        Vendedor v1 = new Vendedor();
        //se llenan los atributos

        System.out.println("Por favor ingrese el nombre del vendedor");
        v1.setNombre(scan.next());
        System.out.println("Por favor ingrese el DNI del vendedor");
        v1.setDni(scan.nextInt());
        System.out.println("Por favor ingrese el sueldo básico del vendedor");
        v1.setSueldobasico(scan.nextDouble());
        System.out.println("Por favor ingrese el día que el vendedor inició labores");
        int dia = scan.nextInt();
        System.out.println("Por favor ingrese el mes en el que el vendedor inició labores");
        int mes = scan.nextInt();
        System.out.println("Por favor ingrese el año en el que el vendedor inició labores");
        int anio = scan.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.getFechainicio();
        return v1;

    }

    public void SueldoMensual(Vendedor v1){

        System.out.println("Por favor ingrese las ventas totales del vendedor");
        Double ventas = scan.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldomensual(v1.getSueldobasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor: " + v1.getNombre() + " es de $" + v1.getSueldomensual());

    }

    public void vacaciones(Vendedor v1){

        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechainicio().getYear();

        if (antiguedad < 5){
            System.out.println("le corresponden 14 dias de vacaciones");
        } else if (antiguedad < 10){
            System.out.println("Le corresponden 21 días de vacaciones");
        } else if(antiguedad < 20){
            System.out.println("Le corresponden 28 días de vacaciones");
        } else if(antiguedad > 20){
            System.out.println("Le corresponden 35 días de vacaciones");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }
}
