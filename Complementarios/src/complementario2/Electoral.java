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
public class Electoral extends Urna {

    private Lista[] listas;
    private int cantidadListasExistentes;

    public Electoral(int l, int u) {
        super(u, 0);
        setCantidadListasExistentes(l);
        this.listas = new Lista[l];
        inicializarListas();
    }

    public int getCantidadListasExistentes() {
        return cantidadListasExistentes;
    }

    public void setCantidadListasExistentes(int cantidadListasExistentes) {
        this.cantidadListasExistentes = cantidadListasExistentes;
    }

    public void inicializarListas() {
        for (int i = 0; i < cantidadListasExistentes; i++) {
            Lista l = new Lista(i);
            listas[i] = l;
        }
    }

    public boolean validarNumeroDeLista(int n) {
        for (int i = 0; i < cantidadListasExistentes; i++) {
            if (listas[i].getNumeroLista() == n) {
                return true;
            }
        }
        return false;
    }

    public void votarPorLista(int i) {
        boolean encontrado = false;
        for (int j = 0; j < cantidadListasExistentes && !encontrado; j++) {
            if (listas[j].getNumeroLista() == i) {
                listas[j].setCantidadVotos(listas[j].getCantidadVotos() + 1);
                encontrado = true;
            }
        }
    }

    public int devolverVotosPorLista(int i) {
        if (validarNumeroDeLista(i)) {
            for (int j = 0; j < cantidadListasExistentes; j++) {
                if (listas[j].getNumeroLista() == i) {
                    return listas[j].getCantidadVotos();
                }
            }
        }
        return -1;
    }

    public Lista calcularGanador() {
        Lista l = null;
        int votosGanador = 0;
        for (int i = 0; i < cantidadListasExistentes; i++) {
            if (listas[i] != null && votosGanador <= devolverVotosPorLista(listas[i].getNumeroLista())) {
                votosGanador = listas[i].getCantidadVotos();
                l = listas[i];
            }
        }
        return l;
    }

    // debe devolver la suma de votos en blanco y votos a favor de cada lista.
    @Override
    public int calcularTotalVotos() {
        int cantidadTotalVotos = 0;

        for (int i = 0; i < cantidadListasExistentes; i++) {
            if (listas[i] != null) {
                cantidadTotalVotos += listas[i].getCantidadVotos();
            }
        }
        return cantidadTotalVotos;
    }

    @Override
    public double calcularPorcentajeGanador() {
        int votosGanador = calcularGanador().getCantidadVotos();
        return votosGanador * 100.0 / calcularTotalVotos();
    }
}
