package parciales;

public abstract class Parcial {
    private String alumno;
    private String fecha;

    public Parcial(String alumno, String fecha) {
        this.alumno = alumno;
        this.fecha = fecha;
    }
    
    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public abstract void cargarResultadoPregunta(int num, boolean preg);
    
    public abstract boolean verResultadoPregunta(int num);
    
    public abstract double calcularNotaFinal();
    
    public abstract boolean estaAprobado();
}
