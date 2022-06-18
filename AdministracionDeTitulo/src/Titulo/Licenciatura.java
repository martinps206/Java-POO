package Titulo;

public class Licenciatura extends Titulo implements Comparable{
    private String temaTesis;
    private String fechaEntrega;
    private int cantidadTrabajosInvestigacion;

    public Licenciatura(int cantidadDeMaterias, String fechaDeInicio, String fechaDeFinalizacion, boolean selladoMinisterio, boolean selladoInstituto, Persona persona, String temaTesis, String fechaEntrega, int cantidadTrabajosInvestigacion) {
        super(cantidadDeMaterias, fechaDeInicio, fechaDeFinalizacion, selladoMinisterio, selladoInstituto, persona);
        this.temaTesis = temaTesis;
        this.fechaEntrega = fechaEntrega;
        this.cantidadTrabajosInvestigacion = cantidadTrabajosInvestigacion;
    }

    public String getTemaTesis() {
        return temaTesis;
    }

    public void setTemaTesis(String temaTesis) {
        this.temaTesis = temaTesis;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidadTrabajosInvestigacion() {
        return cantidadTrabajosInvestigacion;
    }

    public void setCantidadTrabajosInvestigacion(int cantidadTrabajosInvestigacion) {
        this.cantidadTrabajosInvestigacion = cantidadTrabajosInvestigacion;
    }

    @Override
    public boolean ejercer() {
        if(getSelladoInstituto() && getSelladoMinisterio()){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public int compareTo(Object o){
        Licenciatura licenciatura = (Licenciatura) o;
        //logica
        if (this.cantidadTrabajosInvestigacion == ((Licenciatura) o).cantidadTrabajosInvestigacion){
            return 0;
        } else if(this.cantidadTrabajosInvestigacion > ((Licenciatura) o).cantidadTrabajosInvestigacion){
            return 1;
        }
        else{
            return 2;
        }
    }

}
