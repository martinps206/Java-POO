package parciales;

public class Teorico extends Parcial{
    private final boolean[] resultado = new boolean[5];

    public Teorico(String alumno, String fecha) {
        super(alumno, fecha);
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
            if (resultado[i]==true) {
                total = total +2;
            }
        }
        return total;
    }
    
    public boolean estaAprobado(){
        return calcularNotaFinal() > 4;
    }
    
    @Override
    public String toString() {
        return "El alummno : " + super.getAlumno() + " Nota final : " + calcularNotaFinal() + " - " + estaAprobado();
    }
}
