package Entity;

public class Libro {
    private Integer ISBN;
    private String Titulo;
    private String Autor;
    private int NumeroDePaginas;

    public Libro() {
    }

    public Libro(Integer ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        Titulo = titulo;
        Autor = autor;
        NumeroDePaginas = numeroDePaginas;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        NumeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN +
                ", Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", NumeroDePaginas=" + NumeroDePaginas +
                '}';
    }
}
