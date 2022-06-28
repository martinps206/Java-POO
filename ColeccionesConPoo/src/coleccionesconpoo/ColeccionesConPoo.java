/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleccionesconpoo;

import java.util.ArrayList;
import java.util.Iterator;

public class ColeccionesConPoo {

    public static void main(String[] args) {
        ArrayList< String> lista = new ArrayList<String>();
        lista.add("Luis");
        lista.add("Olga");
        lista.add("Miguel");
        lista.add("Antonio");
        lista.add("Pedro");

        // Iteradores
        System.out.println("==========Iterator============");
        Iterator< String> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Iterator< String> itt = lista.iterator();
        while (itt.hasNext()) {
            String nombre = itt.next();
            if (nombre.equals("Pedro")) {
                itt.remove();
            }
        }

        // ForEach
        System.out.println("==========ForEach============");
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }
}
