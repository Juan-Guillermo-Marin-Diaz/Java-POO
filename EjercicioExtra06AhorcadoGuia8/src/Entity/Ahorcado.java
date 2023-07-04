package Entity;

public class Ahorcado {
//Definimos los atributos de la clase ahorcado
    private String palabraBuscar[] = new String[0];
    private int cantidadLetrasEncontradas;
    private int cantidadJugadas;

//Hacemos el constructor vacío o por defecto

    public Ahorcado() {

    }

//Hacemos el constructor parámetrizado
    public Ahorcado(String[] palabraBuscar, int cantidadLetrasEncontradas, int cantidadJugadas) {
        this.palabraBuscar = palabraBuscar;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJugadas = cantidadJugadas;
    }

//Hacemos los getter y los setter
    public String[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(String[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }
}
