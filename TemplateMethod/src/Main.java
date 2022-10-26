import NegocioComidas.NegocioComidas;
import Network.Network;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Network.Twitter;
import Network.Facebook;

import NegocioComidas.NegocioComidas;
import NegocioComidas.MenuInfantil;
import NegocioComidas.MenuVegetariano;


public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Martin Paliza");
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);


         */

        MenuInfantil menuInfantil = new MenuInfantil(1500.00, 3);
        System.out.println(menuInfantil.calculoPrecioVenta());
        MenuVegetariano menuVegetariano = new MenuVegetariano(2000.00, 3, 2);
        System.out.println(menuVegetariano.calculoPrecioVenta());



    }
}