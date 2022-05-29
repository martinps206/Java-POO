package robot;

import java.util.Scanner;

public class Menu {

    private int opcion;
    private Robotin robot;
    private Scanner in = new Scanner(System.in);

    public Menu() {
        robot = new Robotin();
    }

    public void desplegar() {
        do {
            robot.estado();
            System.err.println("1.- cargar");
            System.err.println("2.- golpear");
            System.err.println("3.- reparar");
            System.err.println("4.- salir");
            System.err.println("OP : ");
            opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    robot.cargar();
                    break;
                case 2:
                    robot.golpear();
                    break;
                case 3:
                    robot.reparar();
                    break;
                case 4:
                    System.out.println("Gracias por jugar...");
                    break;
            }

        } while (opcion != 4);
    }

}
