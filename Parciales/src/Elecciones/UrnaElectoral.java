package Elecciones;

public class UrnaElectoral extends Urna{
    private int cantListas;
    private int []contador = new int[cantListas];

    public UrnaElectoral(int cantListas, int numeroUrna) {
        super(numeroUrna);
        this.cantListas = cantListas;
        for (int i = 0; i < cantListas; i++) {
            this.contador[i]=0;
        }
    }

    public int getCantListas() {
        return cantListas;
    }

    public void setCantListas(int cantListas) {
        this.cantListas = cantListas;
    }

    public boolean validarNuemeroDeLista(int numero){
        return numero<cantListas && numero>=0;
    }
    
    public void votarPorLista(int numero){
        contador[numero]++;
    }
    
    public int devolverVotosPorLista(int numero){
        return contador[numero];
    }
    
    public int calcularGanador(){
        int maxVotos = 0;
        int max = 0;
        for (int i = 0; i < cantListas; i++) {
            if (max<contador[i]) {
                maxVotos = contador[i];
                max = i;
            }
        }
        return max;
    }


    public int calcularTotalVotos() {
        int total = 0;
        for (int i = 0; i < cantListas; i++) {
            total = total + contador[i];
        }
        return total + getContadorBlanco();
    }
    
    
}
