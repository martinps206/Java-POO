package Discografia;

public class Solista {
    private String nombreSolista;
    private String instrumento;
    private int cantTemas;

    public Solista(String nombreSolista, String instrumento, int cantTemas) {
        this.nombreSolista = nombreSolista;
        this.instrumento = instrumento;
        this.cantTemas = cantTemas;
    }

    public String getNombreSolista() {
        return nombreSolista;
    }

    public void setNombreSolista(String nombreSolista) {
        this.nombreSolista = nombreSolista;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getCantTemas() {
        return cantTemas;
    }

    public void setCantTemas(int cantTemas) {
        this.cantTemas = cantTemas;
    }
    
}