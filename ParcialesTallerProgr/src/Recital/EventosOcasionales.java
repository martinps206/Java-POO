package Recital;

public class EventosOcasionales extends Recitales{
    private String motivo;
    private String contratista;
    private String diaDelEvento;

    public EventosOcasionales(String motivo, String contratista, String diaDelEvento, String nombreBanda, int dlTemas) {
        super(nombreBanda, dlTemas);
        this.motivo = motivo;
        this.contratista = contratista;
        this.diaDelEvento = diaDelEvento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getContratista() {
        return contratista;
    }

    public void setContratista(String contratista) {
        this.contratista = contratista;
    }

    public String getDiaDelEvento() {
        return diaDelEvento;
    }

    public void setDiaDelEvento(String diaDelEvento) {
        this.diaDelEvento = diaDelEvento;
    }

    @Override
    public void actuar() {
        // (a beneficio, show de TV o show privado),
        switch (this.motivo) {
            case "a beneficio":
                System.out.println("Recuerden colaborar con " + contratista);
                break;
            case "show de tv":
                System.out.println("Saludos amigos televidentes");
                break;
            default:
                System.out.println("Un feliz cumpleaños para + " + contratista);
                break;
        }
        for (int i = 0; i < getDfTemas(); i++) {
            System.out.println("cantTemas: " + getDfTemas());
            super.actuar();
        }
    }
    
    @Override
    public boolean finalizado(){
        return getDl() == getDfTemas();
    }
    
    @Override
     public int calcularCosto() {
        switch (this.motivo) {
            case "a beneficio":
                return 0;
            case "show de tv":
                return 50000;
            default:
                return 150000;
        }
    }
}
