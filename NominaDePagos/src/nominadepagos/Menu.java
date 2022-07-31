package nominadepagos;
import nominadepagos.Empleado.*;
import java.util.Scanner;


public class Menu {

    Scanner in = new Scanner(System.in);
    public Empleado e;
    public Percepciones p;

    public void detalleMenu() {
        System.out.println("1.	Agregar empleado al archivo empleado.txt");
        System.out.println("2.	Eliminar empleado del archivo empleado.txt");
        System.out.println("3.	Modificar dato de un empleado del archivo empleado.txt ingresado por código de empleado.");
        System.out.println("4.	Buscar un empleado por código en el archivo de empleado.txt");
        System.out.println("5.	Agregar el pago de un empleado por su servicio a la nómina de pagos.");
        System.out.println("6.	Buscar un empleado en el archivo de nóminas de pago");
        System.out.println("7.	Eliminar el pago de un empleado en el archivo de nóminas de pago");
        System.out.println("8.	Editar el pago de un empleado en la nómina de pago");
    }

    public Percepciones ingresarPercepciones() {
        System.out.println("Ingrese horas extras.");
        int extras = in.nextInt();
        System.out.println("Ingrese las inasistencias.");
        int faltas = in.nextInt();
        Percepciones p = new Percepciones(extras, faltas);
        return p;
    }

    public Empleado ingresarDatos() {

        System.out.println("DATOS DEL EMPLEADO");
        System.out.println("------------------");
        System.out.println("Ingrese el nombre del empleado : ");
        String nombre = in.next();
        System.out.println("Ingrese el apellido del empleado : ");
        String apellido = in.next();
        System.out.println("Ingrese el DNI del empleado : ");
        int dni = in.nextInt();
        System.out.println("Ingrese la edad del empleado : ");
        int edad = in.nextInt();
        System.out.println("Ingrese el telefono del empleado : ");
        String telefono = in.next();
        System.out.println("Ingrese el email del empleado : ");
        String email = in.next();
        System.out.println("Ingrese el codigo del empleado : ");
        int codigoEmpleado = in.nextInt();
        System.out.println("Ingrese el mes de ingreso del empleado : ");
        int fechaIngresoMes = in.nextInt();
        System.out.println("Ingrese el año de ingreso del empleado : ");
        int fechaIngresoAnio = in.nextInt();
        System.out.println("Ingrese el perfil del empleado : ");
        String perfil = in.next();
        //Empleado(String nombre, String apellido, int dni, int edad, String telefono, int codigoEmpleado, int fechaIngresoMes, int fechaIngresoAnio, String perfil)
        Empleado e = new Empleado(nombre, apellido, dni, edad, telefono, email, codigoEmpleado, fechaIngresoMes, fechaIngresoAnio, perfil);

        return e;
    }

    public void mostrarMenu(int option) {

        switch (option) {
            case 1:
                e = ingresarDatos();
                e.generarArchivoEmpleado(); // crear archivo empleado o agregar empleado
                break;
            case 2:
                System.out.println("Ingrese el codigo del empleado que desea elimnar del archivo.");
                e.eliminarEmpleado(in.nextInt()); // eliminar empleado
                break;
            case 3:
                System.out.println("Ingrese el codigo del empleado que desea modificar del archivo.");
                e.modificarEmpleado(in.nextInt()); // modificar dato de un empleado
                break;
            case 4:
                System.out.println("Ingrese el codigo del empleado que desa informacion.");
                Empleado.buscarEmpleado(in.nextInt());
                break;
            case 5:
                p = ingresarPercepciones();
                p.agregarAchivoPercepciones();
                break;
            case 6:
                System.out.println("Ingrese el codigo del empleado que desa informacion.");
                p.buscarPercepcion(in.nextInt());
                break;
            case 7:
                System.out.println("Ingrese el codigo del empleado que desea elimnar del archivo.");
                p.eliminarPercepcion(in.nextInt());
                break;
            case 8:
                System.out.println("Ingrese el codigo del empleado que desea modificar del archivo.");
                p.modificarPercepcion(in.nextInt()); // modificar dato de un empleado
                break;
            default:
                System.out.println("Opcion incorecta....");
        }

    }
}
