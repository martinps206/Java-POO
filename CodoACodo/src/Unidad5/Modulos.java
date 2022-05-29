package Unidad5;

import java.util.Scanner;

public class Modulos {

    private Scanner in = new Scanner(System.in);

    public String hola() {
        return "Hola mundo...";
    }

    public double sumarRestar(double num1, double num2) {
        double res = 0;
        System.out.println("Ingrese la opercaion que desea drealizar Sumar  s o Restar  r");
        String op = in.next();
        if (op.equals("s")) {
            res = num1 + num1;
        } else {
            if (op.equals("r")) {
                res = num1 - num2;
            } else {
                System.out.println("El operador es incorrecto");
            }
        }
        return res;
    }

    public boolean esPar(int num) {
        return num % 2 == 0;
    }

    public boolean esImpar(int num) {
        return num % 2 != 0;
    }

    public double cubo(double numero) {
        return numero * numero * numero;
    }

    public int cantidadDeDivisores(int numero) {
        int cant = 0;
        for (int i = 0; i < numero; i++) {
            if (numero % i == 0) {
                cant = cant + 1;
            }
        }
        return cant;
    }

    public double mayorDetres(double num1, double num2, double num3) {
        double max;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else {
            if (num2 >= num3) {
                max = num2;
            } else {
                max = num3;
            }
        }
        return max;
    }

    public String imprimirSimbolo(int numero, String car) {
        for (int i = 0; i < numero; i++) {
            System.out.print(car);
        }
        return " ";
    }

    public int azar() {
        return (int) (10 * Math.random() + 1);
    }

    public boolean esVocal(String x) {
        return (x.equalsIgnoreCase("a") || x.equalsIgnoreCase("e") || x.equalsIgnoreCase("i") || x.equalsIgnoreCase("o") || x.equalsIgnoreCase("u"));
    }

    public String obtenerMesEnTexto(int numero) {
        String mes = "No se encuentraen el rango";
        switch (numero) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
        }
        return mes;
    }
}
