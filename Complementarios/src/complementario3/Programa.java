/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementario3;

import PaqueteLectura.Lector;

/**
 *
 * @author BBarros
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int cantTemas = 5;

        EventoOcasional eo = new EventoOcasional("show de tv", "bruno", "14/04/2019", "AC/DC", cantTemas);

        for (int i = 0; i < cantTemas; i++) {
            System.out.print("Ingrese el nombre del tema: ");
            String nombreTema = Lector.leerString();
            
            eo.agregarTema(nombreTema);
            
            System.out.println();
        }

        System.out.println("El evento costó " + eo.calcularCosto());
        eo.actuar();
         */
        //(String nombreGira, int cantFechas, String nombre, int cantTemas)
        int cantFechas = 2;
        int cantTemas2 = 3;

        Gira gir = new Gira("Gira 2020", cantFechas, "The Rolling Stones", cantTemas2);

        for (int i = 0; i < cantTemas2; i++) {
            System.out.print("Ingrese el nombre del tema: ");
            String nombreTema = Lector.leerString();

            gir.agregarTema(nombreTema);

            System.out.println();

        }

        for (int i = 0; i < cantFechas; i++) {
            System.out.print("Ingrese el nombre de la ciudad: ");
            String ciudad = Lector.leerString();

            System.out.print("Ingrese la fecha: ");
            String fecha = Lector.leerString();

            gir.agregarFecha(ciudad, fecha);

            System.out.println();
        }

        /*
A continuación instancie una gira, leyendo desde el teclado el nombre de la gira, la banda, el
listado de temas y el listado de ciudades con sus correspondientes días. Luego imprima el costo
de la gira e invoque al mensaje actuar de la misma hasta finalizar la gira.
         */
        System.out.println("El evento costó " + gir.calcularCosto());
        gir.actuar();
    }

}
