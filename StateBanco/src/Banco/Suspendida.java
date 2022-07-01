package Banco;

public class Suspendida implements EstadoVentanilla{
    @Override
    public void atender(Persona persona) {
        if (persona.getEdad() > 65){
            System.out.println("Atiendo a : " + persona.getNombre());

        }else{
            System.out.println("Espere 5 minutos por favor...");
        }
    }
}
