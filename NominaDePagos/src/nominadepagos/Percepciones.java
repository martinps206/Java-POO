package nominadepagos;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Calendar;

public class Percepciones {
    private Empleado e;
    private int horasExtras;
    private int faltas;
    private int horasTrabajo = 6; //son las horas que se trabajan diariamente

    public Percepciones(int horasExtras, int faltas) {
        this.horasExtras = horasExtras;
        this.faltas = faltas;
    }
    
        
    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    public double pagoDePerfil(String perfil){
        double pago;
        if(perfil.equals("junior")){
            pago = 35000;
        }else{
            if(perfil.equals("semisenior")){
                pago = 50000;
            }else{
                if(perfil.equals("senior")){
                    pago = 95000;
                }else{
                    System.out.println("El perfil no esta evaluado...");
                    pago = 0;
                }
            }
        }
        return pago;
    }

    public double pagoAniosTrabajo(){
        double pago = 0;
        for (int i = 0; i < e.aniosTrabajo(); i++){
            pago = 1.1 * pagoDePerfil(e.perfil);
        }
        return pago;
    }
    
    
    //pago total, tomando en cuenta los descuentos, extras por años de trabajo y horas extras
    public double generarTotal() {
        double auxHorasExtras = 0;
        // el pago por las primeras 20 horas extras sera el doble de cada hora de trabajo
        while(auxHorasExtras >= 0){
            if (this.horasExtras > 0 && this.horasExtras < 21) {
            auxHorasExtras = 2 * (pagoDePerfil(e.perfil) / 30) / horasTrabajo; 
            // las siguientes horas seran el triple de cada hora extra    
            } else {
            auxHorasExtras = 40 * ((pagoDePerfil(e.perfil) / 30) / horasTrabajo) + (3 * (horasTrabajo - 20) * (pagoDePerfil(e.perfil) / 30) / horasTrabajo); 
            }
        }
        return this.pagoDePerfil(e.perfil) + auxHorasExtras + this.pagoAniosTrabajo() - this.generarDescuento();
    }

    public double generarDescuento() {
        double descSueldo = 0.18 * pagoDePerfil(e.perfil); //Supongamos que es un impuesto a la ganancia del 18%
        double descFalta = 2 * faltas * (pagoDePerfil(e.perfil) / 30); //descontamos dos dias por cada falta 
        return descSueldo + descFalta;
    }

    public void leerArchivoEmpleado() {
        // Fichero del que queremos leer
        File fichero = new File("C:\\Users\\User\\Downloads\\empleados.txt");
        Scanner s = null;

        try {
            // Leemos el contenido del fichero
            System.out.println("... Leemos el contenido del fichero ...");
            s = new Scanner(fichero);
            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine(); 	// Guardamos la linea en un String
                System.out.println(linea);      // Imprimimos la linea
            }

        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
    }
    
    
    
    public void agregarAchivoPercepciones(){
    
    }
    
    public Percepciones buscarPercepcion(int code){
        Percepciones p = null;
    
        return p;
    }
    
    public void eliminarPercepcion(int code){
    
    }
    
    public void modificarPercepcion(int code){
    
    }
    
}
