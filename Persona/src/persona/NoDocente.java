package persona;

public class NoDocente extends Persona{
    private String puesto;
    
    public NoDocente(String nombre, String apellidos, String puesto) {
        super(nombre, apellidos);
        this.puesto = puesto;
    }
    
    @Override
    public String toString() {
        return "No docente : " + super.toString() + " puesto de trabajo = " + puesto;
    }
    
    @Override
    public int horasTrabajadas() {
        return 40;
    }
}
