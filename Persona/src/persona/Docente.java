package persona;

public class Docente extends Persona{
    private int cantidadDeMaterias;
    
    public Docente(String nombre, String apellidos, int cantidadDeMaterias) {
        super(nombre, apellidos);
        this.cantidadDeMaterias = cantidadDeMaterias;
    }
    
    @Override
    public int horasTrabajadas() {
        return 40;
    }
    
    @Override
    public String toString() {
        return "Docente : " + super.toString() + " cantidad de materias a dictar = " + cantidadDeMaterias;
    }
}
