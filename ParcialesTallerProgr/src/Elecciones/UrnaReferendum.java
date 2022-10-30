package Elecciones;

public class UrnaReferendum extends Urna{
    private int votosFavor;
    private int votosContra;

    public UrnaReferendum(int numeroUrna) {
        super(numeroUrna);
        this.votosFavor = 0;
        this.votosContra = 0;
    }

    public int getVotosFavor() {
        return votosFavor;
    }

    public void setVotosFavor(int votosFavor) {
        this.votosFavor = votosFavor;
    }

    public int getVotosContra() {
        return votosContra;
    }

    public void setVotosContra(int votosContra) {
        this.votosContra = votosContra;
    }
    
    public void votosEnContra(){
        votosContra++;
    }
    
    public void votarAFavor(){
        votosFavor++;
    }
    
    public int calcularGanador(){
        int ganador = -1;
        if (votosContra>votosFavor) {
            ganador = 0;
        } else {
            ganador = 1;
        }
        return ganador;
    }
    
    public int calcularTotalVotos(){
        return votosContra+votosFavor+getContadorBlanco();
    }
}
