package persona;


public class Alumno extends Persona{
    private String legajo;
    
    public Alumno(String nombre, String apellidos, String legajo) {
        super(nombre, apellidos);
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Alumno : " + super.toString() + " legajo = " + legajo;
    }

    @Override
    public int horasTrabajadas() {
        return 30;
    }
    
    
}
