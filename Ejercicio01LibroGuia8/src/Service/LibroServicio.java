package Service;


import Entity.Libro;

import java.util.Scanner;

public class LibroServicio {

    Scanner scan = new Scanner(System.in);
    Libro book = new Libro();

    public Libro cargarlibro(){

        System.out.println("Por favor ingrese el ISBN del libro");
        book.setISBN(scan.nextInt());
        System.out.println("Por favor ingrese el titulo del libro");
        book.setTitulo(scan.next());
        System.out.println("Por favor ingrese el autor del libro");
        book.setAutor(scan.next());
        System.out.println("Por favor ingrese el número de páginas del libro");
        book.setNumeroDePaginas(scan.nextInt());

        return book;

    }

    public void confirmardatos(Libro book){

        System.out.println("El ISBN ingresado es: "+ book.getISBN());
        System.out.println("El título ingresado es: "+ book.getTitulo());
        System.out.println("El autor ingresado es: "+ book.getAutor());
        System.out.println("El número de paginas ingresado es: "+ + book.getNumeroDePaginas());
    }

}


