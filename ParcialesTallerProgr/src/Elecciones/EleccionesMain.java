package Elecciones;

import java.util.Scanner;

public class EleccionesMain {

    public static void main(String[] args) {
        UrnaElectoral objeto1 = new UrnaElectoral(2013, 5);
        UrnaReferendum objeto2 = new UrnaReferendum(2013);
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese DNI");
        int dni = in.nextInt();
        while (dni != 0) {
            System.out.println("Ingrese el nuemero de lista");
            int numElectoral = in.nextInt();
            if (objeto1.validarNuemeroDeLista(numElectoral)){
                objeto1.votarPorLista(numElectoral);
            }else{
                objeto1.votarEnBlanco();
            }
            
            System.out.println("Ingrese el voto para el Referendum");
            int numReferendum = in.nextInt();
            if (numReferendum>0) {
                objeto2.votarAFavor();
            } else {
                if (numReferendum<0) {
                    objeto2.votosEnContra();
                } else {
                    objeto2.votarEnBlanco();
                }
            }
            System.out.println("Ingrese DNI");
            dni = in.nextInt();
        }
        
        System.out.println(objeto1.calcularGanador());
        System.out.println(objeto2.calcularGanador());
        
        System.out.println(objeto1.devolverVotosPorLista(objeto1.calcularGanador())*100/objeto1.calcularTotalVotos());
        if (objeto2.calcularGanador()==1) {
            System.out.println(objeto2.getVotosFavor()*100/objeto2.calcularTotalVotos());
        } else {
            if (objeto2.calcularGanador()==0) {
                System.out.println(objeto2.getVotosContra()*100/objeto2.calcularTotalVotos());
            } else {
                System.out.println("Empate...");
            }
        }
        
    }
    
}
