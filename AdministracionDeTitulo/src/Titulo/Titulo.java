package Titulo;

public abstract class Titulo {
    private int cantidadDeMaterias;
    private String fechaDeInicio;
    private String fechaDeFinalizacion;
    private boolean selladoMinisterio;
    private boolean selladoInstituto;
    private Persona persona;

    public Titulo(int cantidadDeMaterias, String fechaDeInicio, String fechaDeFinalizacion, boolean selladoMinisterio, boolean selladoInstituto, Persona persona) {
        this.cantidadDeMaterias = cantidadDeMaterias;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFinalizacion = fechaDeFinalizacion;
        this.selladoMinisterio = selladoMinisterio;
        this.selladoInstituto = selladoInstituto;
        this.persona = persona;
    }

    public int getCantidadDeMaterias() {
        return cantidadDeMaterias;
    }

    public void setCantidadDeMaterias(int cantidadDeMaterias) {
        this.cantidadDeMaterias = cantidadDeMaterias;
    }

    public String getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(String fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public String getFechaDeFinalizacion() {
        return fechaDeFinalizacion;
    }

    public void setFechaDeFinalizacion(String fechaDeFinalizacion) {
        this.fechaDeFinalizacion = fechaDeFinalizacion;
    }

    public boolean getSelladoMinisterio() {
        return selladoMinisterio;
    }

    public void setSelladoMinisterio(boolean selladoMinisterio) {
        this.selladoMinisterio = selladoMinisterio;
    }

    public boolean getSelladoInstituto() {
        return selladoInstituto;
    }

    public void setSelladoInstituto(boolean selladoInstituto) {
        this.selladoInstituto = selladoInstituto;
    }

    public abstract boolean ejercer();
}
