package Unidad5;

import java.util.Scanner;

public class Menu {
    private int opcion;
    private Unidad5.Modulos objeto;
    private Scanner in = new Scanner(System.in);
    
    public Menu(){
        objeto = new Unidad5.Modulos();
    }
    
    public void desplegar() {
        do {
            System.err.println("1.- Ejercicio 1");
            System.err.println("2.- Ejercicio 2");
            System.err.println("3.- Ejercicio 3");
            System.err.println("4.- Ejercicio 4");
            System.err.println("5.- Ejercicio 5");
            System.err.println("6.- Ejercicio 6");
            System.err.println("7.- Ejercicio 7");
            System.err.println("8.- Ejercicio 8");
            System.err.println("9.- Ejercicio 9");
            System.err.println("10.- Ejercicio 10");
            System.err.println("11.- salir");
            
            System.err.println("OP : ");
            opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println(objeto.hola());
                    break;
                case 2:
                    System.out.println("Ingrese dos numeros");
                    System.out.println(objeto.sumarRestar(in.nextDouble(), in.nextDouble()));
                    break;
                case 3:
                    System.out.println("Ingrese un numero y verifique si es par");
                    System.out.println(objeto.esPar(in.nextInt()));
                    break;
                case 4:
                    System.out.println("Ingrese un numero y verifique si es impar");
                    System.out.println(objeto.esPar(in.nextInt()));
                    break;
                case 5:
                    System.out.println("Ingrese un numero y retornaremos la cantidad de divisores");
                    System.out.println(objeto.cantidadDeDivisores(in.nextInt()));
                    break;
                case 6:
                    System.out.println("Ingrese tres numero y retornaremos el mayor");
                    System.out.println(objeto.mayorDetres(in.nextDouble(), in.nextDouble(), in.nextDouble()));
                    break;
                case 7:
                    System.out.println("Ingrese un numero y un simbolo, para retornar una cadena");
                    System.out.println(objeto.imprimirSimbolo(in.nextInt(), in.next()));
                    break;
                case 8:
                    System.out.println("Un numero al azar entre 1 y 10");
                    System.out.println(objeto.azar());
                    break;
                case 9:
                    System.out.println("Ingrese un caracter y le informaremos si es una vocal");
                    System.out.println(objeto.esVocal(in.next()));
                    break;
                case 10:
                    System.out.println("Ingrese un numero entre 1 y 12 y retornaremo el mes en que pertenece");
                    System.out.println(objeto.obtenerMesEnTexto(in.nextInt()));
                    break;   
            }
            } while (opcion != 11);
    }
}
