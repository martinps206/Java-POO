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
public abstract class Urna {

    private int numero;
    private int votosBlanco;

    public Urna(int numero, int votosBlanco) {
        setNumero(numero);
        setVotosBlanco(votosBlanco);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVotosBlanco() {
        return votosBlanco;
    }

    public void setVotosBlanco(int votosBlanco) {
        this.votosBlanco = votosBlanco;
    }

    public void votarEnBlanco() {
        // Cuál de los dos maneras prefieren que usemos?
        this.votosBlanco++;
        // setVotosBlanco(getVotosBlanco() + 1);
    }
    public abstract int calcularTotalVotos();
    
    public abstract double calcularPorcentajeGanador();
}
