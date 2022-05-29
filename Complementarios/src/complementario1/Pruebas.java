/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementario1;

import PaqueteLectura.Lector;

/**
 *
 * @author BBarros
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realice un programa principal que instancie una discográfica con datos leídos de teclado.
        Luego, agregar solistas a la discográfica hasta leer uno con cantidad de temas producidos 0.
        Asimismo, agregar bandas a la discográfica hasta leer una con cantidad de integrantes 0.
        Para finalizar, compruebe el correcto funcionamiento de los métodos definidos en c).
         */
        //(String nombre, String ciudad, String nombreDueno, int dfSolistas, int dfBandas)
        System.out.print("Ingrese el nombre de la discográfica: ");
        String nombreDisco = Lector.leerString();

        System.out.print("Ingrese el nombre de la ciudad: ");
        String ciudadDisco = Lector.leerString();

        System.out.print("Ingrese el nombre del dueño: ");
        String duenoDisco = Lector.leerString();

        System.out.print("Ingrese la cantidad de solistas a representar: ");
        int cantidadSolistas = Lector.leerInt();

        while (cantidadSolistas < 0) {
            System.out.println("Ingrese un valor válido.");
            System.out.print("Ingrese la cantidad de solistas a representar: ");
            cantidadSolistas = Lector.leerInt();
        }

        while (cantidadSolistas > 50) {
            System.out.println("No puede representar a más de 50 solistas.");
            System.out.print("Ingrese la cantidad de solistas a representar: ");
            cantidadSolistas = Lector.leerInt();
        }

        System.out.print("Ingrese la cantidad de bandas a representar: ");
        int cantidadBandas = Lector.leerInt();

        while (cantidadBandas < 0) {
            System.out.println("Ingrese un valor válido.");
            System.out.print("Ingrese la cantidad de solistas a representar: ");
            cantidadBandas = Lector.leerInt();
        }

        while (cantidadBandas > 50) {
            System.out.println("No puede representar a más de 50 solistas.");
            System.out.print("Ingrese la cantidad de banda a representar: ");
            cantidadBandas = Lector.leerInt();
        }

        Discografica d = new Discografica(nombreDisco, ciudadDisco, duenoDisco, cantidadSolistas, cantidadBandas);
        
        System.out.println();
        
        int temasProducidos = -1;

        System.out.println("SOLISTAS");
        System.out.println("--------------------");

        while (temasProducidos != 0) {
            // El problema acá es que pido dos datos innecesariamente
            System.out.print("Ingrese el nombre: ");
            String nombre = Lector.leerString();

            System.out.print("Ingrese el instrumento: ");
            String instrumento = Lector.leerString();

            System.out.print("Ingrese la cantidad de temas producidos: ");
            temasProducidos = Lector.leerInt();

            while (temasProducidos < 0) {
                System.out.println("Ingrese un valor válido.");
                System.out.print("Ingrese la cantidad de temas producidos: ");
                temasProducidos = Lector.leerInt();
            }

            if (temasProducidos != 0) {
                Solista s = new Solista(instrumento, temasProducidos, nombre);
                d.agregarSolista(s);
                System.out.println();
            }

        }
        
        System.out.println();
        
        for (int i = 0; i < cantidadSolistas; i++) {
            System.out.println(d.getSolistas(i));
            System.out.println();
        }

        int cantidadIntegrantes = -1;
        
        System.out.println();
        
        System.out.println("BANDAS");
        System.out.println("--------------------");
        while (cantidadIntegrantes != 0) {
            // El problema acá es que pido dos datos innecesariamente
            System.out.print("Ingrese el nombre: ");
            String nombre = Lector.leerString();

            System.out.print("Ingrese la ciudad de formación: ");
            String ciudadFormacion = Lector.leerString();

            System.out.print("Ingrese la cantidad de integrantes: ");
            cantidadIntegrantes = Lector.leerInt();

            while (cantidadIntegrantes < 0) {
                System.out.println("Ingrese un valor válido.");
                System.out.print("Ingrese la cantidad de integrantes: ");
                cantidadIntegrantes = Lector.leerInt();
            }

            if (cantidadIntegrantes != 0) {
                Banda b = new Banda(ciudadFormacion, cantidadIntegrantes, nombre);
                d.agregarBanda(b);
                System.out.println();
            }
        }

        for (int i = 0; i < cantidadBandas; i++) {
            System.out.println(d.getBandas(i));
            System.out.println();
        }

        // i. La cantidad de bandas representadas por una discográfica
        System.out.println("Cantidad de bandas representadas: " + d.cantidadBandasRepresentadas());

        // ii. Dado un instrumento, la cantidad de artistas solistas que tocan dicho instrumento
        System.out.print("Ingrese un instrumento para saber cuántos artistas lo tocan: ");
        String instrumento = Lector.leerString();
        System.out.println("Hay " + d.instrumentosSolistas(instrumento) + " solistas que tocan el instrumento " + instrumento);

        // iii. El nombre de la banda con más integrantes
        System.out.println("La banda con más integrantes es " + d.bandaMasIntegrantes());

        // iv. La cantidad de bandas formadas en la misma ciudad que la discográfica
        System.out.println("Cantidad de bandas formadas en la misma ciudad que la discográfica: " + d.bandasMismaCiudad());

        System.out.println();

    }

}
