package BandaMusical;

public class Banda {
    private String nombreBanda;
    private String ciudadOrigen;
    private String estiloMusucal;
    private Disco []disco = new Disco[20];
    private int dlDisco;

    public Banda(String nombreBanda, String ciudadOrigen, String estiloMusucal) {
        this.nombreBanda = nombreBanda;
        this.ciudadOrigen = ciudadOrigen;
        this.estiloMusucal = estiloMusucal;
        this.dlDisco = 0;
    }

    public int getDlDisco() {  // cantidad de discos de una banda
        return dlDisco;
    }

    public void setDlDisco(int dlDisco) {
        this.dlDisco = dlDisco;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getEstiloMusucal() {
        return estiloMusucal;
    }

    public void setEstiloMusucal(String estiloMusucal) {
        this.estiloMusucal = estiloMusucal;
    }
    
    public void agregarDisco(Disco d){
        if (dlDisco<20) {
            disco[dlDisco] = d;
            dlDisco++;
        }
    }
    
    public int duracionCancion(String nomDisco, String nomCancion){
        int i = 0;
        while (!(disco[i].getNobreDisco().equals(nomDisco)) && i<dlDisco) {            
             i++;
        }
        return disco[i].duracionCancion(nomCancion);
    }
    
    public String temaLargo(){
        int i = 0;
        String x = "";
        while (i<dlDisco) {
            x = disco[i].maximoTema();
            i++;
        }
        return x;
    }
    
    public int cantidadDiscoViejo(){
        int min = 2019;
        int minDuracion = 0;
        for (int i = 0; i < dlDisco; i++) {
            if (disco[i].getFechaSalida()< min) {
                min = disco[i].getFechaSalida();
                minDuracion = disco[i].getDlCancion();
            }
        }
        return minDuracion;
    }
}
