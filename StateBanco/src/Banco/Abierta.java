package Banco;

public class Abierta implements EstadoVentanilla{
    @Override
    public void atender(Persona persona) {
        System.out.println("Atiendo a : " + persona.getNombre());
    }
}
