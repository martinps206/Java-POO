package BandaMusical;

import java.util.Scanner;

public class MainBandaMusical {
	
	
	static void numeroPrimo(int primo) {
		int cont = 0;
    	for (int i = 1; i <= primo; i++) {
    		if (primo % i == 0) {
    			cont++;
    		}
    	}
    	if (cont > 2) {
    		System.out.println("El numero no es primo");
    	}else {
    		System.out.println("El numero es primo");
    	}
	}
	
	static int numeroMayor() {
		Scanner in = new Scanner(System.in);
		int cont = 0;
    	int i = 0;
    	int [] arreglo = new int[3];
    	int max = arreglo[0];
    	while(cont < 3) {
    		System.out.println("ingrese un numero");
    		arreglo[i] = in.nextInt();
    		cont++;
    		i++;
    	}
    	for (int j = 0; j<3; j++) {
    		if(arreglo[j] > max) {
        		max = arreglo[j];
        	}
    	}
    	return max;
	}
	
    public static void main(String[] args) {
    	int numero = 10;
    	System.out.println(numero);
        /*Scanner in = new Scanner(System.in);
        Banda objeto = new Banda("Gritesco", "Lima", "Rock");
        Disco d1 = new Disco("Play", 2015);
        Disco d2 = new Disco("Cosmos", 2017);
        Cancion c1 = new Cancion("Dia Plastico", 180);
        Cancion c2 = new Cancion("Wirito", 150);
        Cancion c3 = new Cancion("Atahualpa", 100);
        Cancion c4 = new Cancion("Perro", 200);
        Cancion c5 = new Cancion("Lucas", 210);
        Cancion c6 = new Cancion("Revelion", 120);
        Cancion c7 = new Cancion("Profugos", 180);
        Cancion c8 = new Cancion("Carcel", 110);
        objeto.agregarDisco(d1);
        objeto.agregarDisco(d2);
        d1.agregarCancion(c1);
        d1.agregarCancion(c2);
        d1.agregarCancion(c3);
        d2.agregarCancion(c4);
        d2.agregarCancion(c5);
        d2.agregarCancion(c6);
        d2.agregarCancion(c7);
        d2.agregarCancion(c8);
        
        System.out.println(objeto.cantidadDiscoViejo());
        System.out.println(objeto.duracionCancion("Cosmos", "Profugos"));
        System.out.println(objeto.temaLargo());
        */
    	
    	/*
    	System.out.println("Ingrese un numero : ");
    	int primo = in.nextInt();
    	numeroPrimo(primo);*/
    	
    	
    	System.out.println(numeroMayor());
    	
    	
    }
    
}
