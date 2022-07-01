package Banco;

public class Banco {
    private String nombre;
    private String direccion;
    private Ventanilla ventanilla;

    public Banco(){
        ventanilla = new Ventanilla();
    }

    public void atender(Persona persona){
        System.out.println(persona.getNombre() + " Ingresa a la fila");
        ventanilla.atender(persona);
    }

    public void suspendeVentanilla(){
        ventanilla.suspendete();
    }

    public void cerraVentanilla(){
        ventanilla.cerrate();
    }

    public void abriVentanilla(){
        ventanilla.abrite();
    }

    public  String getNombre(){
        return nombre;
    }
}
