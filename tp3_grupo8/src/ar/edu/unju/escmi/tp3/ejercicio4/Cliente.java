package ejercicio4;

public class Cliente {

    private int dni;
    private String nombre;
    private char categoria;

    public Cliente(int dni, String nombre, char categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "DNI: " + dni +
               ", Nombre: " + nombre +
               ", Categoría: " + categoria;
    }

    public int getDni() {
        return dni;
    }

    public char getCategoria() {
        return categoria;
    }
}