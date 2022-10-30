package Teatro;

import java.util.Scanner;

public class TeatroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funciones f = new Funciones("Cazafantasmas", "22-10-2018", "20:00");

        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese Dni : ");
        int dni = in.nextInt();

        while (dni != 0 && f.calcularButacasLibres() != 380) {
            System.out.println("Ingrese el nuemro de fila : ");
            int fila = in.nextInt();
            System.out.println("Ingrese Nombre : ");
            String nombre = in.next();
            System.out.println("Ingrese edad : ");
            int edad = in.nextInt();

            Espectadores e = new Espectadores(nombre, dni, edad);
            f.agregarEspectadorAFila(fila, e);

            System.out.println("Ingrese Dni : ");
            dni = in.nextInt();
        }
        System.out.println("La cantidad de butacas libres son");
        System.out.println(f.calcularButacasLibres());
        System.out.println(f.calcularEdadPromEspectadores());
    }

}
