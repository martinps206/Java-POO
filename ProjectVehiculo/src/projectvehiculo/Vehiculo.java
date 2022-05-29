package projectvehiculo;

public abstract class Vehiculo implements vel_max{
    // Atributos de la clase
    private String modelo;
    private String marca;
    public int anio;
    private int velocidad;

    public Vehiculo(String modelo, int anio, String marca) {
        this.modelo = modelo;
        this.anio = anio;
        this.marca = marca;
        this.velocidad = 0;
    }
    
    // metodos getter, que son para mostrar ("return")
    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getVelocidad() {
        return velocidad;
    }
    
    // metodos setter, que son para modificar, con un paramatro de entrada
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    // metodos de la INTEFACE vel_max, 
    @Override
    public void acelerar() {
        velocidad = velocidad + 10;
    }
    
    @Override
    public void desacelerar() {
        velocidad = velocidad - 10;
    }
    
    @Override
    public void frenar() {
        this.velocidad = 0;
    }
    
    // metodo abstracta 
    public abstract int ocupantes();

    @Override
    public String toString() {
        return " modelo = " + modelo + ", marca = " + marca + ", anio = " + anio ;
    }
    
    
}
