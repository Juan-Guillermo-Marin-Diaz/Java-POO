package Ejercicio01LibroGuia8;

import Entity.Libro;
import Service.LibroServicio;


public class Ejercicio01LibroGuia8 {

    public static void main(String[] args) {

        LibroServicio bookservice = new LibroServicio();
        Libro book1 = bookservice.cargarlibro();
        bookservice.confirmardatos(book1);
    }
}
