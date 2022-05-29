package Rinfo;

public abstract class Robot {
    private String nombre;
    private int nroAvenida;
    private int nroCalle;
    private int orientacion;
    private int cantFloresbolsa;
    private int numeroPasos;

    public Robot(String nombre, int cantFloresbolsa) {
        this.nombre = nombre;
        this.nroAvenida = 0;
        this.nroCalle = 0;
        this.orientacion = 0;
        this.cantFloresbolsa = cantFloresbolsa;
        this.numeroPasos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroAvenida() {
        return nroAvenida;
    }

    public void setNroAvenida(int nroAvenida) {
        this.nroAvenida = nroAvenida;
    }

    public int getNroCalle() {
        return nroCalle;
    }

    public void setNroCalle(int nroCalle) {
        this.nroCalle = nroCalle;
    }

    public int getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(int orientacion) {
        this.orientacion = orientacion;
    }

    public int getCantFloresbolsa() {
        return cantFloresbolsa;
    }

    public void setCantFloresbolsa(int cantFloresbolsa) {
        this.cantFloresbolsa = cantFloresbolsa;
    }

    public int getNumeroPasos() {
        return numeroPasos;
    }

    public void setNumeroPasos(int numeroPasos) {
        this.numeroPasos = numeroPasos;
    }
    
    public void mover(int paso){
        
    }
    
    public void giraADerecha(){
        orientacion = orientacion + 90;
    }
    
    public void sacarFlorDeLaBolsa(){
        cantFloresbolsa--;
    }
    
    public boolean hayFlorEnLaBolsa(){
        boolean flor;
        if (cantFloresbolsa>0) {
            flor = true;
        } else {
            flor = false;
        }
        return flor;
    }
    
    public abstract void depositarFlor();
    public abstract double calcularEnergiaConsumida();

    public String mostrar() {
        return "Robot{" + "nombre=" + nombre + ", nroAvenida=" + nroAvenida + ", nroCalle=" + nroCalle + ", orientacion=" + orientacion + ", cantFloresbolsa=" + cantFloresbolsa + ", numeroPasos=" + numeroPasos + ", cantidad de Energia consumida="+calcularEnergiaConsumida()+'}';
    }
    
    
}
