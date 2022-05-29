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
public class Banda extends Artista {

    private String ciudadFormacion;
    private int cantidadIntegrantes;

    public Banda(String ciudadFormacion, int cantidadIntegrantes, String nombre) {
        super(nombre);
        setCiudadFormacion(ciudadFormacion);
        setCantidadIntegrantes(cantidadIntegrantes);
    }

    public String getCiudadFormacion() {
        return ciudadFormacion;
    }

    public void setCiudadFormacion(String ciudadFormacion) {
        this.ciudadFormacion = ciudadFormacion;
    }

    public int getCantidadIntegrantes() {
        return cantidadIntegrantes;
    }

    public void setCantidadIntegrantes(int cantidadIntegrantes) {
        this.cantidadIntegrantes = cantidadIntegrantes;
    }

    @Override
    public String toString() {
        return "Banda{" + super.toString() + " ciudadFormación=" + getCiudadFormacion() + ", cantidadIntegrantes=" + getCantidadIntegrantes() + '}';
    }

}
