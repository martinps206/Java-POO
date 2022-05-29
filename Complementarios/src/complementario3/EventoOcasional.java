/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementario3;

/**
 *
 * @author BBarros
 */
public class EventoOcasional extends Recital {

    private String motivo;
    private String contratante;
    private String dia;

    public EventoOcasional(String motivo, String contratante, String dia, String nombre, int cantTemas) {
        super(nombre, cantTemas);
        this.motivo = motivo;
        this.contratante = contratante;
        this.dia = dia;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public void actuar() {
        // (a beneficio, show de TV o show privado),
        switch (this.motivo) {
            case "a beneficio":
                System.out.println("Recuerden colaborar con " + this.contratante);
                break;
            case "show de tv":
                System.out.println("Saludos amigos televidentes");
                break;
            default:
                System.out.println("Un feliz cumpleaños para + " + this.contratante);
                break;
        }
        for (int i = 0; i < getCantTemas(); i++) {
            System.out.println("cantTemas: " + getCantTemas());
            super.actuar();
        }
    }

    @Override
    public boolean finalizado() {
        return getDl() == getCantTemas();
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

    @Override
    public String toString() {
        return "EventoOcasional{" + super.toString() + " motivo=" + motivo + ", contratante=" + contratante + ", dia=" + dia + '}';
    }

}
