package Recital;

import java.util.Scanner;

public class NewMainRecital {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el motivo");
        String motivo = in.next();
        System.out.println("Ingrese el contratista");
        String contratista = in.next();
        System.out.println("Ingrese el dia del evento");
        String diaDelEvento = in.next();
        System.out.println("Ingrese el nobre de la Banda");
        String nombreBanda = in.next();
        System.out.println("Ingrese cantidad de temas");
        int dfTemas = in.nextInt();
        EventosOcasionales objeto1 = new EventosOcasionales(motivo, contratista, diaDelEvento, nombreBanda, dfTemas);
        System.out.println(objeto1.calcularCosto());
    }
    
}
