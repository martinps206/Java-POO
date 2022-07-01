package Banco;

public class Cerrada implements EstadoVentanilla{
    @Override
    public void atender(Persona persona) {
        System.out.println("ventanilla cerrada!");
    }
}
