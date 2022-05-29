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
public class Referendum extends Urna {

    /*
    El constructor de las urnas de referéndum recibe un nro. “U” e inicia el número de urna a “U” y todos
sus contadores de votos a 0.
     */
    private int votosAFavor;
    private int votosEnContra;

    public Referendum(int u) {
        super(u, 0);
        setVotosAFavor(0);
        setVotosEnContra(0);
    }

    public int getVotosAFavor() {
        return votosAFavor;
    }

    public void setVotosAFavor(int votosAFavor) {
        this.votosAFavor = votosAFavor;
    }

    public int getVotosEnContra() {
        return votosEnContra;
    }

    public void setVotosEnContra(int votosEnContra) {
        this.votosEnContra = votosEnContra;
    }

    public void votarAFavor() {
        //this.votosAFavor++;
        setVotosAFavor(getVotosAFavor() + 1);
    }

    public void votarEnContra() {
        //this.votosEnContra++;
        setVotosEnContra(getVotosEnContra() + 1);
    }

    public int calcularGanador() {
        if (getVotosAFavor() == getVotosEnContra()) {
            return -1;
        } else if (getVotosAFavor() < getVotosEnContra()) {
            return 0;
        } else {
            return 1;
        }
    }

    // Para las urnas de referéndum debe devolver la suma de votos en blanco, a favor y en contra.
    @Override
    public int calcularTotalVotos() {
        return super.getVotosBlanco() + getVotosAFavor() + getVotosEnContra();
    }

    @Override
    public double calcularPorcentajeGanador() {
        int votosGanador = 0;
        double porc = -1;

        if (calcularGanador() == 0) {
            porc = getVotosEnContra() * 100.0 / calcularTotalVotos();
        } else if (calcularGanador() == 1) {
            porc = getVotosAFavor() * 100.0 / calcularTotalVotos();
        }
        
        return porc;

    }
}
