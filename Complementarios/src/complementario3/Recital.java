package complementario3;

public abstract class Recital {

    private String nombre;
    private String[] temas;
    private int cantTemas;
    private int dl;

    public Recital(String nombre, int cantTemas) {
        this.nombre = nombre;
        this.cantTemas = cantTemas;
        this.temas = new String[cantTemas];
        this.dl = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantTemas() {
        return cantTemas;
    }

    public String getTemas(int pos) {
        return temas[pos];
    }

    public int getDl() {
        return dl;
    }

    public void agregarTema(String tema) {
        temas[dl] = tema;
        dl++;
    }

    public void actuar() {
        for (int i = 0; i < this.cantTemas; i++) {
            System.out.println(this.temas[i]);
        }
    }

    public abstract boolean finalizado();

    public abstract int calcularCosto();

    @Override
    public String toString() {
        return "Recital{" + "nombre=" + nombre + ", temas=" + temas + '}';
    }

}
