package parcialTeatro;

public class Actor {
    private String nombreApellido;
    private String genero;
    private int edad;

    public Actor(String nombreApellido, String genero, int edad) {
        this.nombreApellido = nombreApellido;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
