package CatedraMatematica;

import java.util.Scanner;

public class Catedra {

    Scanner in = new Scanner(System.in);
    private Alumno a;
    private Comision s1;
    private Comision s2;
    private int cantAlumno = 0;

    public void agregarAlumno(Alumno a) {
 
        if (a.firstName.charAt(0) < 'N') {
            s1.agregarAlumno(a);
            cantAlumno++;
        } else {
            s2.agregarAlumno(a);
            cantAlumno++;
        }
    }

    public void detalle() {
        System.out.println("1. Agregar Alumno a la catedra.");
        System.out.println("2. Agregar Alumno a un turno.");
        System.out.println("3. Cantidad de alumno en la catedra, y por comision.");
    }

    public Alumno cargarAlumno() {
        System.out.println("Ingresar nombre del alumno");
        String nombre = in.next();
        System.out.println("Ingresar apellido del alumno");
        String apellido = in.next();
        System.out.println("Ingresar DNI del alumno");
        int dni = in.nextInt();
        a = new Alumno(nombre, apellido, dni);
        return a;
    }

    public void operaciones() {
        detalle();
        System.out.println("Ingrese la operacion que desea realizar");
        int option = in.nextInt();
        switch (option) {
            case 1:
                agregarAlumno(cargarAlumno());
                break;
            case 2:
                System.out.println("Ingresar la comision");
                String comision = in.next();
                if(comision.equals("s1")){
                    s1.agregarAlumno(cargarAlumno());
                }else{
                    s2.agregarAlumno(cargarAlumno());
                }
            break;
            case 3:
                
            break;
            
        }
    }
     
}