package CatedraMatematica;

public class Comision {
    private String aula;
    private String Nombredocente;
    private String ApellidoDocente;
    private Alumno alumno[];
    private int dim = 0;

    public Comision(String aula, String Nombredocente, String ApellidoDocente) {
        this.aula = aula;
        this.Nombredocente = Nombredocente;
        this.ApellidoDocente = ApellidoDocente;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getNombredocente() {
        return Nombredocente;
    }

    public void setNombredocente(String Nombredocente) {
        this.Nombredocente = Nombredocente;
    }

    public String getApellidoDocente() {
        return ApellidoDocente;
    }

    public void setApellidoDocente(String ApellidoDocente) {
        this.ApellidoDocente = ApellidoDocente;
    }
    
    public void agregarAlumno(Alumno a){
        alumno[dim] = a; 
        dim++;
    }
    
    public void detalleComision(){
        
    }
}
