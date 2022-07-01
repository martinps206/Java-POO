package Banco;

public class Ventanilla {
    private String cajero;
    private EstadoVentanilla estado;

    public Ventanilla(){
        estado = new Abierta();
    }

    public void suspendete(){
        estado = new Suspendida();
    }

    public void cerrate(){
        estado = new Cerrada();
    }

    public void abrite(){
        estado = new Abierta();
    }

    public void atender(Persona persona){
        estado.atender(persona);
    }
    public String getCajero(){
        return cajero;
    }

}
