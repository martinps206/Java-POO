package HomeworkOne;

import java.util.Scanner;

public class Matrices {

    Scanner in = new Scanner(System.in);
    private int enteros[][];
    private double notas[][];
    private String cad[][];
    private int tempA[];
    private int tempB[];
    private String ciudad[];

    public int[][] incisoA() {
        enteros = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                enteros[i][j] = 5;
            }
        }
        return enteros;
    }

    public void imprimirIncisoA() {
        int v[][] = incisoA();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(v[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public String[][] incisoB() {
        cad = new String[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Ingrese una raza de perro.");
                cad[i][j] = in.next();
            }
        }
        return cad;
    }

    public void imprimirIncisoB() {
        String v[][] = incisoB();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(v[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public double[][] incisoC() {
        notas = new double[4][4];
        for (int i = 0; i < 4; i++) {
            double prom = 0;
            System.out.println("\tAlumno " + (i + 1));
            System.out.println("\t---------");
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la nota " + (j + 1));
                notas[i][j] = in.nextDouble();
                prom = prom + notas[i][j];
            }
            notas[i][3] = prom / 3;
        }
        return notas;
    }

    public void imprimirIncisoC() {
        double v[][] = incisoC();
        System.out.println("Alumnos\t\tNota1\tNota2\tNota3\tPromedio");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.print("Alumno " + (i + 1) + " \t");
            for (int j = 0; j < 4; j++) {
                System.out.print(v[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public void incisoVector() {
        ciudad = new String[5]; // ciudades 
        tempA = new int[5]; // temperaturas maximas
        tempB = new int[5]; // tempereturas minimas
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre de la ciudad "+(i+1));
            ciudad[i] = in.next();
        }
        String ciudadMaximo = "";
        String ciudadMinimo = "";
        int minimo = 999;
        int maximo = 0;
        for (int i = 0; i < 3; i++){
            System.out.println("Ingrese la temperatura maxima de la ciudad "+ciudad[i]);
            tempA[i] = in.nextInt();
            System.out.println("Ingrese la temperatura minima de la ciudad "+ciudad[i]);
            tempB[i] = in.nextInt();
            
            if(tempA[i] > maximo){
                maximo = tempA[i];
                ciudadMaximo = ciudad[i];
            }
            if(tempB[i] < minimo){
                minimo = tempB[i];
                ciudadMinimo = ciudad[i];
            }
        }
        
        System.out.println("La ciudad con la temperatura maxima es "+ ciudadMaximo + " con la temperatura de " + maximo);
        System.out.println("La ciudad con la temperatura minima es "+ ciudadMinimo + " con la temperatura de " + minimo);
    }
    
    public void menu(){
        System.out.println("1. Inciso E) de vectores.");
        System.out.println("2. Inciso A) de matrices.");
        System.out.println("3. Inciso B) de matrices.");
        System.out.println("4. Inciso C) de matrices.");
        System.out.println("0. Salir.");
    }
}
