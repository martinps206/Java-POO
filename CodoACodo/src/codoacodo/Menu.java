package codoacodo;

import java.util.Scanner;

public class Menu {
    private int opcion;
    private Modulos objeto;
    private Scanner in = new Scanner(System.in);
    
    public Menu(){
        objeto = new Modulos();
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
            System.err.println("8.- Ejercicio 9");
            System.err.println("10.- salir");
            
            System.err.println("OP : ");
            opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el perimetro de un cuadrado, para poder hallar el area.");
                    double num = in.nextDouble();
                    System.out.println("El area de dichoo cuadrado es : "+objeto.perimetroCuadrado(num));
                    break;
                case 2:
                    System.out.println("Ingrese dos numeros para realizar una division entera.");
                    int numero1 = in.nextInt();
                    int numero2 = in.nextInt();
                    System.out.println("La division entera es : "+objeto.divisionEntera(numero1, numero2));
                    System.out.println("el resto o residio de la division es : "+objeto.resto(numero1, numero2));
                    break;
                case 3:
                    System.out.println("Ingrese dos numcero para realizar una division.");
                    double num1 = in.nextDouble();
                    double num2 = in.nextDouble();
                    System.out.println("La division es : "+objeto.division(num1, num2));
                    break;
                case 4:
                    System.out.println("Ingrese el diametro de una circulo.");
                    int diametro = in.nextInt();
                    System.out.println("El perimetro del circulo es : "+objeto.perimetro(diametro));
                case 5:
                    System.out.println("Ingrese el radio de una circulo.");
                    int radio = in.nextInt();
                    System.out.println("El perimetro del circulo es : "+objeto.perimetroCirculo(radio));
                    System.out.println("La superficie del circulo es :"+objeto.superficieCirculo(radio));
                case 6:
                    System.out.println("Ingrese los lados de un triangulo cualquiera.");
                    int lado1 = in.nextInt();
                    int lado2 = in.nextInt();
                    int lado3 = in.nextInt();
                    System.out.println("El perimetro del triangulo es : "+objeto.perimetroTriangulo(lado1, lado2, lado3));
                    System.out.println("La superficie del triangulo es : "+objeto.superficieTriangulo(lado1, lado2, lado3));
                case 7:
                    System.err.println("Ingrese la edad");
                    int edad = in.nextInt();
                    System.out.println("Ingrese el sexo");
                    char sexo = in.next().charAt(0);
                    System.out.println(objeto.jubilacion(edad, sexo));
                case 8:
                    System.out.println("Ingrese dos numeros para evaluar su divisibilidad.");
                    int a = in.nextInt();
                    int b = in.nextInt();
                    System.out.println(objeto.divisible(a, b));
                case 9:
                    System.out.println("Ingrese tres lados de un triangulo");
                    int x = in.nextInt();
                    int y = in.nextInt();
                    int z = in.nextInt();
                    System.out.println(objeto.triangulo(x, y, z));
                case 10:
                    System.out.println("Gracias por jugar...");
                    break;
            }

        } while (opcion != 10);
    }
}
