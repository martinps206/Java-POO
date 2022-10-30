package Recital;

public class Giras extends Recitales{
    private String nombreGira;
    private int dfFecha;
    private Fechas []fechas = new Fechas[dfFecha];
    private int dlFecha; 

    public Giras(String nombreGira, int dfFecha, String nombreBanda, int dlTemas) {
        super(nombreBanda, dlTemas);
        this.nombreGira = nombreGira;
        this.dfFecha = dfFecha;
        this.dlFecha = 0;
    }

    public int getDlFecha() {
        return dlFecha;
    }

    public void setDlFecha(int dlFecha) {
        this.dlFecha = dlFecha;
    }

    public String getNombreGira() {
        return nombreGira;
    }

    public void setNombreGira(String nombreGira) {
        this.nombreGira = nombreGira;
    }

    public int getDfFecha() {
        return dfFecha;
    }

    public void setDfFecha(int dfFecha) {
        this.dfFecha = dfFecha;
    }
    
    public void agregarFecha(String ciudad, String dia){
        if (dfFecha>dlFecha) {
            fechas[dlFecha] = new Fechas(ciudad, dia);
            dlFecha++;
        }
    }
    
    @Override
    public void actuar(){
        for (int i = 0; i < getDl(); i++) {
            System.out.println("Buenas noches " + fechas[i].getCiudad());
            super.actuar();
        }
        dlFecha++;
    }
    
    @Override
    public boolean finalizado() {
        return this.dlFecha == this.dfFecha;
    }

    @Override
    public int calcularCosto() {
        return this.dfFecha * 30000;
    }
}
