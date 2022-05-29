package Teatro;

public class Funciones {
    private String titulo;
    private String fecha;
    private String hora;
    private Espectadores [][] espectadores = new Espectadores[10][20];
    private int [] ocup = new int[20];
    private int dl;

    public Funciones(String titulo, String fecha, String hora) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.dl = 0;
        for (int i = 0; i < 20; i++) {
            this.ocup[i]=0;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                this.espectadores[i][j] = null;
            }
        }
    }

    public int getDl() {
        return dl;
    }

    public void setDl(int dl) {
        this.dl = dl;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public boolean validarFila(int num){
        return num < 20 && num > -1;
    }
    
    public boolean hayButacaLibreEnFila(int num){
        boolean act = false;
        if (validarFila(num)) {
            act = ocup[num]<20;
        }
        return act;
    }
    
    public int agregarEspectadorAFila(int num, Espectadores e){
        if (validarFila(num) && hayButacaLibreEnFila(num)) {
            espectadores[num][ocup[num]] = e;
            ocup[num]++;
            dl++;
        }else{
            System.out.println("No es una fila valida");
        }
        return ocup[num];
    }
    
    public int calcularButacasLibres(){
        int total = 0;
        for (int i = 0; i < 20; i++) {
            total = total + (19-ocup[i]);
        }
        return total;
    }
    
    public int calcularEdadPromEspectadores(){
        int x = 0;
        int y = 0;
        int total = 0;
        while (y < 10) {         
            while (x < 20 || espectadores[x][y]!=null) {
                total = total + espectadores[x][y].getEdad();
                x++;
            }
            y++;
            x = 0;
        }
        return total/dl;
    }
    
    public boolean estaRegistradoEspectador(int dni){
        boolean x = false;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if (espectadores[i][j].getDni() == dni) {
                    x = true;
                }
            }
        }
        return x;
    }
}