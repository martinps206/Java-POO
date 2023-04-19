package Universidad;

public class Alumnos {
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String legajo;
    private int materiaAprobadas;
    private Materia[] materias;

    public Alumnos(String nombre, String apellido, String dni, String email, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.legajo = legajo;
        this.materiaAprobadas = 0;
        this.materias = new Materia[32];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getMateriaAprobadas() {
        return materiaAprobadas;
    }

    public void setMateriaAprobadas(int materiaAprobadas) {
        this.materiaAprobadas = materiaAprobadas;
    }

    public void agregarmateria(Materia m){

    }

    public void examenFinal(String materia, int nota){
        if(nota > 4){
            Materia m = new Materia(materia, nota);
            materias[getMateriaAprobadas()] = m;
            setMateriaAprobadas(getMateriaAprobadas() + 1);
        }
    }

    public double calcularPromedioGeneral(){
        int sumaNota = 0;
        System.out.println("materias aprobadas : " + getMateriaAprobadas());
        for (int i = 0; i < this.materiaAprobadas; i++){
            System.out.println("sumaNota : " + sumaNota + " nota : " + materias[i].getNota());
            sumaNota = sumaNota + materias[i].getNota();
        }
        return sumaNota/this.materiaAprobadas;
    }
}
