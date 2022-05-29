package parcialTeatro;

public class Obras {

    private String nombreObra;
    private String director;
    private Actor[] actor = new Actor[100];
    private int dlActor;
    
    public Obras(String nombre, String director) {
        this.nombreObra = nombre;
        this.director = director;
        this.dlActor = 0;
    }
    
    public String getNombreTeatro() {
        return nombreObra;
    }
    
    public void setNombreTeatro(String nombre) {
        this.nombreObra = nombre;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    public int getDlActor() {
        return dlActor;
    }
    
    public void setDlActor(int dlActor) {
        this.dlActor = dlActor;
    }
    
    public void agregarActor(Actor a) {
        if (dlActor < 100) {
            actor[dlActor] = a;
            dlActor++;
        }
        
    }
    
    public String nombreDeLaObra(String nomApe){
        int i = 0;
        while (actor[i].getNombreApellido() == nomApe && i < dlActor) {            
            i++;
        }
        if (actor[i].getNombreApellido() == nomApe) {
            return nombreObra;
        }else{
            return "No se encuentra en la obra...";
        }
    }
    
    public String edadMaximaActor(){
        int max = 0;
        String nomMax = " ";
        for (int i = 0; i < dlActor; i++) {
            if (actor[i].getEdad()>max) {
                max = actor[i].getEdad();
                nomMax = actor[i].getNombreApellido();
            }
        }
        return nomMax;
    } 
    
    
}
