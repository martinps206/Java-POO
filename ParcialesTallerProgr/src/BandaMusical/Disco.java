package BandaMusical;

public class Disco {
    private String nobreDisco;
    private int fechaSalida;
    private Cancion []cancion = new Cancion[25];
    private int dlCancion;

    public int getDlCancion() {
        return dlCancion;
    }

    public void setDlCancion(int dlCancion) {
        this.dlCancion = dlCancion;
    }

    public Disco(String nobreDisco, int fechaSalida) {
        this.nobreDisco = nobreDisco;
        this.fechaSalida = fechaSalida;
        this.dlCancion = 0;
    }

    public String getNobreDisco() {
        return nobreDisco;
    }

    public void setNobreDisco(String nobreDisco) {
        this.nobreDisco = nobreDisco;
    }

    public int getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(int fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    public void agregarCancion(Cancion c){
        if (dlCancion<25) {
            cancion[dlCancion]=c;
            dlCancion++;
        }
    }
    
    public int duracionCancion(String nomCancion){
        int i = 0;
        int duracion = 0;
        while (!(cancion[i].getNombreCancion().equals(nomCancion)) && i<dlCancion) {            
            i++;
        }

        return cancion[i].getDuracion();
    }
    
    public String maximoTema(){
        int max = 0;
        String nomMax = "";
        for (int i = 0; i < dlCancion; i++) {
            if (cancion[i].getDuracion()>max) {
                max = cancion[i].getDuracion();
                nomMax = cancion[i].getNombreCancion();
            }
        }
        return nomMax;
    }
}
