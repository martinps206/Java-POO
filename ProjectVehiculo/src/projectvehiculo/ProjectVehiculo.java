package projectvehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectVehiculo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> f = new ArrayList();
        
        System.out.println("Ingrese la cantidad de vehiculo para nuestra flota : ");
        System.out.println("-----------------------------------------------------");
        int flota = sc.nextInt();
        
        for (int i = 0; i < flota; i++) {
            System.out.println("Ahora ingresa un numero, 1 si es un auto o 2 si es una moto : (Si escribe un numero diferente saldra del programa) ");
            int v = sc.nextInt();
            if (v == 1){
                System.out.println("Ingrese la cantidad de puertas del auto : ");
                int cantPuertas = sc.nextInt();
                System.out.println("Ingrese el modelo del auto : ");
                String modelo = sc.next();
                System.out.println("Ingrese el año del auto : ");
                int anio = sc.nextInt();
                System.out.println("Ingrese la marca del auto : ");
                String marca = sc.next();
                Auto a = new Auto(cantPuertas, modelo, anio, marca);
                f.add(a);
            }else{
                if (v == 2) {
                    System.out.println("Ingrese la cilindrada de la moto (por casos practicos 'Alta' o 'Baja') : ");
                    String cilindrada = sc.next();
                    System.out.println("Ingrese el modelo de la moto : ");
                    String modelo = sc.next();
                    System.out.println("Ingrese el año de la moto : ");
                    int anio = sc.nextInt();
                    System.out.println("Ingrese la marca de la moto : ");
                    String marca = sc.next();
                    Moto m = new Moto(modelo, anio, marca, cilindrada);
                    f.add(m);
                } else {
                    System.out.println("Acaba de salir del programa...");
                    System.exit(0);
                }
            }
        }
        
        System.out.println("Nuestra flota es : ");
        System.out.println("-------------------");
        for (int i = 0; i < flota; i++) {
            System.out.println(f.get(i).toString());
            System.out.println("La cantidad de ocupantes del vehiculos es : " + f.get(i).ocupantes());
                    
        }
       
        System.out.println("Comencemos a jugar con uno de nuestros vehiculos");
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese el numero de orden del vehiculo que desea utilizar : ");
        int vehJugar  = sc.nextInt();
        System.out.println("Usted eligio : " + f.get(vehJugar-1).toString());
        System.out.println("Puedes acelerar = 1, desacelerar = 2 y frenar = 0, ingrese un numero : ");
        int mov = sc.nextInt();
        
        while (mov != 0) {            
            if (mov == 1) {
                f.get(vehJugar-1).acelerar();
                System.out.println("Usted se enceutra con una velocidad de : " + f.get(vehJugar-1).getVelocidad());
                System.out.println("Puedes acelerar = 1, desacelerar = 2 y frenar = 0, ingrese un numero : ");
                mov = sc.nextInt();
            } else {
                if (mov == 2) {
                    f.get(vehJugar-1).desacelerar();
                    System.out.println("Usted se enceutra con una velocidad de : " + f.get(vehJugar-1).getVelocidad());
                    System.out.println("Puedes acelerar = 1, desacelerar = 2 y frenar = 0, ingrese un numero : ");
                    mov = sc.nextInt();
                } else {
                    f.get(vehJugar).frenar();
                }
            } 
        }
        
        System.out.println("Acaba de frenar y la velocidad es 0");
       
    }
    
}
