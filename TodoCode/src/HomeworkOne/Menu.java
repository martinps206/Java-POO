package HomeworkOne;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Matrices m = new Matrices();

        m.menu();
        System.out.println("Ingrese la opcion que desea realizar :");
        int option = in.nextInt();
        while (option != 0) {
            switch (option) {
                case 1:
                    m.incisoVector();
                    break;
                case 2:
                    m.imprimirIncisoA();
                    break;
                case 3:
                    m.imprimirIncisoB();
                    break;
                case 4:
                    m.imprimirIncisoC();
                    break;
                default:
                    System.out.println("Opcion no valida...");
            }
            m.menu();
            System.out.println("Ingrese la opcion que desea realizar :");
            option = in.nextInt();

        }

    }

}
