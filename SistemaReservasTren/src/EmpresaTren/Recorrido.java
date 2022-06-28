package EmpresaTren;

public class Recorrido {
    private String estacionDestino;
    private String estacionPartida;

    public Recorrido(String estacionDestino, String estacionPartida) {
        this.estacionDestino = estacionDestino;
        this.estacionPartida = estacionPartida;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }

    public void setEstacionDestino(String estacionDestino) {
        this.estacionDestino = estacionDestino;
    }

    public String getEstacionPartida() {
        return estacionPartida;
    }

    public void setEstacionPartida(String estacionPartida) {
        this.estacionPartida = estacionPartida;
    }

    @Override
    public String toString() {
        return "Recorrido : " +
                " estacionDestino = " + estacionDestino  +
                " estacionPartida = " + estacionPartida;
    }
}
