/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementario1;

/**
 *
 * @author BBarros
 */
public class Solista extends Artista {

    private String instrumento;
    private int cantidadTemasProducidos;

    public Solista(String instrumento, int cantidadTemasProducidos, String nombre) {
        super(nombre);
        setInstrumento(instrumento);
        setCantidadTemasProducidos(cantidadTemasProducidos);
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getCantidadTemasProducidos() {
        return cantidadTemasProducidos;
    }

    public void setCantidadTemasProducidos(int cantidadTemasProducidos) {
        this.cantidadTemasProducidos = cantidadTemasProducidos;
    }

    @Override
    public String toString() {
        return "Solista{" + super.toString() + " instrumento=" + getInstrumento() + ", cantidadTemasProducidos=" + getCantidadTemasProducidos() + '}';
    }

}
