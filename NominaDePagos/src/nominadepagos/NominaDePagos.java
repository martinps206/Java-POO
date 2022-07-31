package nominadepagos;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Scanner;

public class NominaDePagos {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);     
        Menu  o = new Menu();        
        o.detalleMenu();
        System.out.println("Ingrese la opcion que desea realizar, si desea SALIR presione 0 : ");
        int op = in.nextInt();      
        while(op != 0){
            o.mostrarMenu(op);
            o.detalleMenu();
            System.out.println("Ingrese la opcion que desea realizar y 0 si desea SALIR : ");
            op = in.nextInt();
            o.mostrarMenu(op);
        }       
    }
}
