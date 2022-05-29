package parcialTeatro;

public class Teatro{
    private String nombreTeatro;
    private String direccion;
    private String duenio;
    private Obras []obra = new Obras[5];
    private int dl;

    public Teatro(String nombre, String direccion, String duenio) {
        this.nombreTeatro = nombre;
        this.direccion = direccion;
        this.duenio = duenio;
        this.dl = 0;
    }

    public String getNombreTeatro() {
        return nombreTeatro;
    }

    public void setNombreTeatro(String nombreTeatro) {
        this.nombreTeatro = nombreTeatro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public int getDl() {
        return dl;
    }

    public void setDl(int dl) {
        this.dl = dl;
    }
    
    public void agregarObra(Obras o){
        if (dl < 5) {
            obra[dl] = o;
        dl++;
        }   
    }
    
    public String nombreDirector(String nomObra){
        int i = 0;
        while (!(obra[i].getNombreTeatro().equals(nomObra)) && i<dl) {            
            i++;
        }
        if (obra[i].getNombreTeatro().equals(nomObra)) {
            return obra[i].getDirector();
        }
        return "No se encuentra dicha obra...";
                
    }
    
    public String obraMinimoActores(){
        int min = 101;
        String nomMin = " ";
        for (int i = 0; i < dl; i++) {
            if (obra[i].getDlActor() < min) {
                min = obra[i].getDlActor();
                nomMin = obra[i].getNombreTeatro();
            }
        }
        return nomMin;
    }
    
    public String nombreDeLaObra(String nombreActor){
        int i = 0;
        while (i < dl && !(nombreActor.equals(obra[i].nombreDeLaObra(nombreActor)))) {            
            i++;
        }    
        return obra[i].nombreDeLaObra(nombreActor);
    }
    
    public String edadMaximaActor(){
        int i = 0;
        while (i < dl) {            
            obra[i].edadMaximaActor();
            i++;
        }
        return obra[i].edadMaximaActor();
    }
}
