package Entidades;

import java.util.Date;

public class Vendedor {

    private String nombre;
    private Integer dni;
    private Double sueldobasico;
    private Double comisiones;
    private Double sueldomensual;
    private Date fechainicio;

    // constructor por defecto o vacio

    public Vendedor(){

    }

    //contrutor por parametros


    public Vendedor(String nombre, Integer dni, Double sueldobasico, Double comisiones, Double sueldomensual, Date fechainicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldobasico = sueldobasico;
        this.comisiones = comisiones;
        this.sueldomensual = sueldomensual;
        this.fechainicio = fechainicio;
    }

    //agregamos getter & setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Double getSueldobasico() {
        return sueldobasico;
    }

    public void setSueldobasico(Double sueldobasico) {
        this.sueldobasico = sueldobasico;
    }

    public Double getComisiones() {
        return comisiones;
    }

    public void setComisiones(Double comisiones) {
        this.comisiones = comisiones;
    }

    public Double getSueldomensual() {
        return sueldomensual;
    }

    public void setSueldomensual(Double sueldomensual) {
        this.sueldomensual = sueldomensual;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", sueldobasico=" + sueldobasico +
                ", comisiones=" + comisiones +
                ", sueldomensual=" + sueldomensual +
                ", fechainicio=" + fechainicio +
                '}';
    }
}
