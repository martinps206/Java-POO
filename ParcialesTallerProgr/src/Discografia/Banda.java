package Discografia;

public class Banda {
    private String nombrebanda;
    private String ciudadFormacion;
    private int cantIntegrantes;

    public Banda(String nombrebanda, String ciudadFormacion, int cantIntegrantes) {
        this.nombrebanda = nombrebanda;
        this.ciudadFormacion = ciudadFormacion;
        this.cantIntegrantes = cantIntegrantes;
    }

    public String getNombrebanda() {
        return nombrebanda;
    }

    public void setNombrebanda(String nombrebanda) {
        this.nombrebanda = nombrebanda;
    }

    public String getCiudadFormacion() {
        return ciudadFormacion;
    }

    public void setCiudadFormacion(String ciudadFormacion) {
        this.ciudadFormacion = ciudadFormacion;
    }

    public int getCantIntegrantes() {
        return cantIntegrantes;
    }

    public void setCantIntegrantes(int cantIntegrantes) {
        this.cantIntegrantes = cantIntegrantes;
    }
}