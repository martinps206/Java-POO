/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementario2;

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
        Electoral e = new Electoral(5, 203);

        Referendum r = new Referendum(203);

        System.out.println("ELECTORAL");
        System.out.println("--------------------");

        System.out.print("Ingrese su dni: ");
        int dni = Lector.leerInt();

        while (dni != 0) {
            System.out.print("Ingrese el número de lista a votar: ");
            int n = Lector.leerInt();

            if (e.validarNumeroDeLista(n)) {
                e.votarPorLista(n);
            } else {
                e.votarEnBlanco();
            }
            System.out.print("Ingrese su dni: ");
            dni = Lector.leerInt();
        }

        System.out.println("El ganador es la lista " + e.calcularGanador());
        System.out.println("El porcentaje de votos del ganador es: " + e.calcularPorcentajeGanador());

        System.out.println("REFERENDUM");
        System.out.println("--------------------");
        
        System.out.print("Ingrese un número positivo para votar a favor, negativo para votar en contra o cero para votar en blanco: ");
        int m = Lector.leerInt();

        if (m < 0) {
            r.votarEnContra();
        } else if (m > 0) {
            r.votarAFavor();
        } else {
            r.votarEnBlanco();
        }

        System.out.println("El ganador es la lista " + r.calcularGanador());
        System.out.println("El porcentaje de votos del ganador es: " + r.calcularPorcentajeGanador());
    }
}
