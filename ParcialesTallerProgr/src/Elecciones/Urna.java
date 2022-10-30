package Elecciones;

public abstract class Urna {
    private int numeroUrna;
    private int contadorBlanco;

    public Urna(int numeroUrna) {
        this.numeroUrna = numeroUrna;
        this.contadorBlanco = 0;
    }

    public int getNumeroUrna() {
        return numeroUrna;
    }

    public void setNumeroUrna(int numeroUrna) {
        this.numeroUrna = numeroUrna;
    }

    public int getContadorBlanco() {
        return contadorBlanco;
    }

    public void setContadorBlanco(int contadorBlanco) {
        this.contadorBlanco = contadorBlanco;
    }
    
    public void votarEnBlanco(){
        contadorBlanco++;
    }
    
    public abstract int calcularGanador();
    public abstract int calcularTotalVotos();
    
}
