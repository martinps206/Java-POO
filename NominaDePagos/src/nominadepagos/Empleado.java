package nominadepagos;

import java.io.*;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Empleado {

    private int indice;
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private String telefono;
    private String email;
    private int codigoEmpleado;
    public int fechaIngresoMes;
    public int fechaIngresoAnio;
    public String perfil;

    //Constructor para el archivo de datos del empleado
    public Empleado(String nombre, String apellido, int dni, int edad, String telefono, String email, int codigoEmpleado, int fechaIngresoMes, int fechaIngresoAnio, String perfil) {
        this.indice++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.codigoEmpleado = codigoEmpleado;
        this.fechaIngresoMes = fechaIngresoMes;
        this.fechaIngresoAnio = fechaIngresoAnio;
        this.perfil = perfil;
    }

    public Empleado() {
        indice++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.codigoEmpleado = codigoEmpleado;
        this.fechaIngresoMes = fechaIngresoMes;
        this.fechaIngresoAnio = fechaIngresoAnio;
        this.perfil = perfil;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getFechaIngresoMes() {
        return fechaIngresoMes;
    }

    public void setFechaIngresoMes(int fechaIngresoMes) {
        this.fechaIngresoMes = fechaIngresoMes;
    }

    public int getFechaIngresoAnio() {
        return fechaIngresoAnio;
    }

    public void setFechaIngresoAnio(int fechaIngresoAnio) {
        this.fechaIngresoAnio = fechaIngresoAnio;
    }

    public int aniosTrabajo() {
        // objeto para obtener em y anio actual
        Calendar c1 = Calendar.getInstance();
        int mes = c1.get(Calendar.MONTH) + 1;
        int anio = c1.get(Calendar.YEAR);
        //realizamos los calculos para determinar los años de trabajo en la empresa
        int aniosTrabajo = 0;
        if ((mes - this.fechaIngresoMes) >= 0) {
            aniosTrabajo = anio - this.fechaIngresoAnio;
        } else {
            aniosTrabajo = anio - this.fechaIngresoAnio - 1;
        }
        //El pago por cada año trabajado en la empresa aumentara en un 10% del pago anterior
        return aniosTrabajo;
    }
    
    /**
    public int idContador(){
        int i = 0;
        int v[] = new int[100];
        while(buscarEmpleado()){
        
        }
        int v[i];
        
        return v[i];
    }
    **/
    
    /**
     * write solo tomará una cadena que no debe ser nula y devuelve void append
     * tomará cualquier secuencia de caracteres que pueda ser nula y devolverá
     * el escritor para que pueda encadenarse. write(int) donde int se convierte
     * en un carácter. append(char) debe ser un tipo char. write(char[] chars)
     * toma una matriz de caracteres, no hay un append () equivalente.
    *
     */
    public void generarArchivoEmpleado() {
        try {
            File archivo = new File("C:\\Users\\User\\Downloads\\empleados.txt");

            if (!archivo.exists()) {
                FileWriter w = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(w);
                PrintWriter wr = new PrintWriter(bw);

                wr.append(this.toString() + "\n");
                wr.close();
                bw.close();
            } else {
                FileWriter w = new FileWriter(archivo, true);
                BufferedWriter bw = new BufferedWriter(w);
                PrintWriter wr = new PrintWriter(bw);

                wr.append(this.toString() + "\n");
                wr.close();
                bw.close();
            }

        } catch (Exception e) {
            System.out.println("Mensaje: " + e.getMessage());
        }
    }

    public void eliminarEmpleado(int code) {

    }

    public void modificarEmpleado(int code) {
    }

    @Override
    public String toString() {
        return indice + "\t" + codigoEmpleado + "\t" + nombre + "\t" + apellido + "\t" + dni + "\t" + edad + "\t" + telefono + "\t" + email + "\t" + perfil + "\t" + fechaIngresoMes + "\t" + fechaIngresoAnio;
    }

    public static Empleado buscarEmpleado(int code) {
        // crea el flujo para leer desde el archivo
        File file = new File("C:\\Users\\User\\Downloads\\empleados.txt");
        
        Scanner scanner;
        System.out.println("Hola");
        try {
            //se pasa el flujo al objeto scanners
            scanner = new Scanner(file);
            Empleado e;
            boolean ok = true;
            while (scanner.hasNextLine() && ok ) {
                
                
                // el objeto scanner lee linea a linea desde el archivo
                String linea = scanner.nextLine();

                Scanner delimitar = new Scanner(linea);
                //se usa una expresión regular
                //que valida que antes o despues de una coma (,) exista cualquier cosa
                //parte la cadena recibida cada vez que encuentre una coma				
                delimitar.useDelimiter("\\s*\t\\s*");
                
                e = new Empleado();
                //indice + "\t" + codigoEmpleado + "\t" + nombre + "\t" + apellido + "\t" + dni + "\t" + edad + "\t" + telefono + "\t" + perfil + "\t" + fechaIngresoMes + "\t" + fechaIngresoAnio;
                
                e.setIndice(delimitar.nextInt());
                e.setCodigoEmpleado(delimitar.nextInt());
                e.setNombre(delimitar.next());
                e.setApellido(delimitar.next());
                e.setDni(delimitar.nextInt());
                e.setEdad(delimitar.nextInt());
                e.setTelefono(delimitar.next());
                e.setEmail(delimitar.next());
                e.setPerfil(delimitar.next());
                e.setFechaIngresoMes(delimitar.nextInt());
                e.setFechaIngresoAnio(delimitar.nextInt());
                
                System.out.println("Hola");
                /**
                String nombre = e.getNombre();
                String apellido = e.getApellido();
                int dni = e.getDni();
                int edad = e.getEdad();
                String telefono = e.getTelefono();
                String email = e.getEmail();
                int codigoEmpleado = e.getCodigoEmpleado();
                int fechaIngresoMes = e.getFechaIngresoMes();
                int fechaIngresoAnio = e.getFechaIngresoAnio();
                String perfil = e.getPerfil();
                **/
                //e = new Empleado(nombre, apellido, dni, edad, telefono, email, codigoEmpleado, fechaIngresoMes, fechaIngresoAnio, perfil);
                
                if (e.codigoEmpleado == code){
                    ok = false;
                    return e;
                }
            }
            //se cierra el ojeto scanner
            scanner.close();
        } catch (FileNotFoundException s) {
            s.printStackTrace();
        }
        return null;
    }

}
