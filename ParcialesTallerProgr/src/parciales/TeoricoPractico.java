package parciales;

public class TeoricoPractico extends Parcial{
    private int puntaje;
    private boolean[] resultado = new boolean[5];

    public TeoricoPractico(String alumno, String fecha, int puntaje) {
        super(alumno, fecha);
        this.puntaje = puntaje;
        
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public void cargarResultadoPregunta(int num, boolean preg) {
        resultado[num] = preg;
    }

    public boolean verResultadoPregunta(int num) {
        return resultado[num];
    }

    @Override
    public double calcularNotaFinal() {
        double total = 0;
        for (int i = 0; i < 5; i++) {
            if (resultado[i] == true) {
                total = total + 2;
            }
        }
        return  puntaje + total/2;
    }
    
    public boolean estaAprobado(){
        return calcularNotaFinal() > 6;
    }

    @Override
    public String toString() {
        return "El alummno : " + super.getAlumno() + " Nota final : " + calcularNotaFinal() + " - " + estaAprobado();
    }
    
    
}
