/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementario2;

/**
 *
 * @author BBarros
 */
public class Lista {

    private int numeroLista;
    private int cantidadVotos;

    public Lista(int numeroLista) {
        setNumeroLista(numeroLista);
        setCantidadVotos(0);
    }

    public int getNumeroLista() {
        return numeroLista;
    }

    public void setNumeroLista(int numeroLista) {
        this.numeroLista = numeroLista;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public String toString() {
        return "Lista{" + "numeroLista=" + numeroLista + ", cantidadVotos=" + cantidadVotos + '}';
    }

}
