package Discografia;

public class Discografia {
    private String nombreDiscografia;
    private String ciudadResidencia;
    private String duenio;
    private Solista []solista = new Solista[50];
    private Banda []banda = new Banda[50];
    private int dlSolista;
    private int dlBanda;

    public int getDlSolista() {
        return dlSolista;
    }

    public void setDlSolista(int dlSolista) {
        this.dlSolista = dlSolista;
    }

    public int getDlBanda() { //cantidad de bandas representadas por una discografia
        return dlBanda;
    }

    public void setDlBanda(int dlBanda) {
        this.dlBanda = dlBanda;
    }

    public Discografia(String nombreDiscografia, String ciudadResidencia, String duenio) {
        this.nombreDiscografia = nombreDiscografia;
        this.ciudadResidencia = ciudadResidencia;
        this.duenio = duenio;
    }

    public String getNombreDiscografia() {
        return nombreDiscografia;
    }

    public void setNombreDiscografia(String nombreDiscografia) {
        this.nombreDiscografia = nombreDiscografia;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    public void agregarSolista(Solista s){
        if (dlSolista<50) {
            solista[dlSolista] = s;
            dlSolista++;
        }
    }
    
    public void agregarBanda(Banda b){
        if (dlBanda<50) {
            banda[dlBanda] = b;
            dlBanda++;
        }
    }
    
    public int cantArtistasInstrumento(String instrumento){
        int cant = 0;
        for (int i = 0; i < dlSolista; i++) {
            if (instrumento.equals(solista[i].getInstrumento())) {
                cant++;
            }
        }
        return cant;
    }
    
    public String bandaMasIntegrantes(){
        int max = 0;
        String nombreMax = "";
        for (int i = 0; i < dlBanda; i++) {
            if (max < banda[i].getCantIntegrantes()){
                max = banda[i].getCantIntegrantes();
                nombreMax = banda[i].getNombrebanda();
            }
        }
        return nombreMax;
    }
    
    public int cantBandasMismaCiudadDiscografica(){
        int cant = 0;
        for (int i = 0; i < dlBanda; i++) {
            if (ciudadResidencia.equals(banda[i].getCiudadFormacion())) {
                cant++;
            }
        }
        return cant;
    }
}
