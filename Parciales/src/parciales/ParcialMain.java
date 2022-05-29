package parciales;

public class ParcialMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teorico t = new Teorico("Norma Garcia", "22/10/2018");
        t.cargarResultadoPregunta(0, true);
        t.cargarResultadoPregunta(1, true);
        t.cargarResultadoPregunta(2, false);
        t.cargarResultadoPregunta(3, true);
        t.cargarResultadoPregunta(4, false);
        
        TeoricoPractico p = new TeoricoPractico("Norma Garcia", "22/10/2018",7);
        p.cargarResultadoPregunta(0, true);
        p.cargarResultadoPregunta(1, true);
        p.cargarResultadoPregunta(2, false);
        p.cargarResultadoPregunta(3, false);
        p.cargarResultadoPregunta(4, false);
        
        System.out.println(t.toString());
        
        System.out.println(p.toString());
    }
    
}
