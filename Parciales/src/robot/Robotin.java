package robot;

public class Robotin {
    private String nombre;
    private int energia;

    public Robotin(){
        this.nombre =  "Truquitos";
        this.energia= 100;
    }
    
    public Robotin(String nombre, int vida) {
        this.nombre = nombre;
        this.energia = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return energia;
    }

    public void setVida(int vida) {
        this.energia = vida;
    }
    
    public void cargar(){
        energia+= 10;
    }
    
    public void golpear(){
        energia -= 10;
    }
    
    public void reparar(){
        energia = 100;
    }
    
    public void estado(){
        String estado;
        if (estaVivo() && energia>100) {
            estado = "Esta sobrecargado";
        } else {
            if (estaVivo() && energia<=100) {
                estado = "Esta vivo";
            } else {
                energia = 0;
                estado = "Esta muerto";
            }
        }
        System.out.println(nombre+" - "+estado+" - con "+energia+"%");
    }
    
    public boolean estaVivo(){
        return energia > 0;
    }
}
