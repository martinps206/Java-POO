package Recital;

public abstract class Recitales {

    private String nombreBanda;
    private int dfTemas;
    private String[] temas = new String[dfTemas];
    private int dl;

    public Recitales(String nombreBanda, int dfTemas) {
        this.nombreBanda = nombreBanda;
        this.dfTemas = dfTemas;
        this.dl = 0;
    }

    public int getDl() {
        return dl;
    }

    public void setDl(int dl) {
        this.dl = dl;
    }

    public String[] getTemas() {
        return temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public int getDfTemas() {
        return dfTemas;
    }

    public void setDfTemas(int dfTemas) {
        this.dfTemas = dfTemas;
    }

    public void agregarTema(String tema) {
        if (dfTemas > dl) {
            temas[dl] = tema;
            dl++;
        }
    }

    public void actuar() {
        for (int i = 0; i < dl; i++) {
            System.out.println("y ahora tocaremos..." + temas[dl]);
        }
    }
    
    public abstract boolean finalizado();

    public abstract int calcularCosto();
    
}
