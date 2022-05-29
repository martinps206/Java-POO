package complementario3;

public class Gira extends Recital {

    private String nombreGira;
    private Fecha[] fechas;
    private int cantFechas;
    private int dl;
    private int recitalesTocados;

    public Gira(String nombreGira, int cantFechas, String nombre, int cantTemas) {
        super(nombre, cantTemas);
        this.nombreGira = nombreGira;
        this.fechas = new Fecha[cantFechas];
        this.cantFechas = cantFechas;
        this.dl = 0;
        this.recitalesTocados = 0;
    }

    public String getNombreGira() {
        return nombreGira;
    }

    public void setNombreGira(String nombreGira) {
        this.nombreGira = nombreGira;
    }

    public Fecha getFechas(int pos) {
        return fechas[pos];
    }

    @Override
    public int getDl() {
        return dl;
    }

    public void agregarFecha(String ciudad, String dia) {
        fechas[dl] = new Fecha(ciudad, dia);
        dl++;
    }

    @Override
    public void actuar() {
        System.out.println("getDl(): " + getDl());
        for (int i = 0; i < getDl(); i++) {
            System.out.println("Buenas noches " + fechas[i].getCiudad());
            super.actuar();
            this.recitalesTocados++;
            if (finalizado()) {
                System.out.println("Gira finalizada");
            }
        }
    }

    @Override
    public boolean finalizado() {
        return this.recitalesTocados == this.cantFechas;
    }

    @Override
    public int calcularCosto() {
        return this.cantFechas * 30000;
    }
}
