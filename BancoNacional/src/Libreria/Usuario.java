package Libreria;

public class Usuario {
    private String nombreApellido;
    private int edad;
    private String direccion;

    public Usuario(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Usuario(String nombreApellido, int edad, String direccion) {
        this.nombreApellido = nombreApellido;
        this.edad = edad;
        this.direccion = direccion;
    }
}
