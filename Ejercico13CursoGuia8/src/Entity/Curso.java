package Entity;

import java.util.Scanner;

public class Curso {

    private String nombreCurso;
    private double cantidadHorasPorDia;
    private double cantidadDiasPorSemana;
    private String turno; //mañana o tarde
    private double precioPorHora;
    private String alumnos;

    public Curso() {

    }

    public Curso(String nombreCurso, double cantidadHorasPorDia, double cantidadDiasPorSemana, String turno, double precioPorHora, String alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public double getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(double cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public void cargarAlumnos() {

        Scanner scan = new Scanner(System.in);

        String cargarAlumnos [] = new String[5];

        for (int i = 0; i < cargarAlumnos.length; i++) {

            System.out.println("Por favor ingrese el nombre del alumno " + (i + 1));

            cargarAlumnos[i] = scan.nextLine();

        }
    }

    public void crearCurso() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese el nombre del curso: ");
        setNombreCurso(scan.nextLine());

        System.out.println("Por favor ingrese el turno (mañana o tarde): ");
        setTurno(scan.nextLine());

        System.out.println("Por favor ingrese la cantidad de días por semana: ");
        setCantidadDiasPorSemana(scan.nextDouble());

        System.out.println("Por favor ingrese el precio por hora: ");
        setPrecioPorHora(scan.nextDouble());

        System.out.println("Por favor ingrese la cantidad de horas por día: ");
        setCantidadHorasPorDia(scan.nextDouble());

        cargarAlumnos();

    }

    public double calcularGananciaSemanal() {

        int cantidadAlumnos = 5;
        double gananciaSemanal = cantidadHorasPorDia * precioPorHora * cantidadAlumnos * cantidadDiasPorSemana;

        return gananciaSemanal;
    }
}
