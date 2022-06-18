package Titulo;

public class Terciario extends Titulo{
    private String validacion;

    public String getValidacion() {
        return validacion;
    }

    public Terciario(int cantidadDeMaterias, String fechaDeInicio, String fechaDeFinalizacion, boolean selladoMinisterio, boolean selladoInstituto, Persona persona, String validacion) {
        super(cantidadDeMaterias, fechaDeInicio, fechaDeFinalizacion, selladoMinisterio, selladoInstituto, persona);
        this.validacion = validacion;
    }

    public void setValidacion(String validacion) {
        this.validacion = validacion;
    }


    @Override
    public boolean ejercer() {
        if(getSelladoInstituto() && getSelladoMinisterio()){
            return true;
        }else{
            return false;
        }
    }

    public boolean validacionNacional(){
        if(this.validacion.equals("NACIONAL")){
            return true;
        }else{
            return false;
        }
    }
}
