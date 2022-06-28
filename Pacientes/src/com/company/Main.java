package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("======= Paciente 1 ======");

        Date fechaInternacionP1 = new Date(121, Calendar.JUNE, 10); //tener en cuenta que inicialmente empieza en 1900
        Date fechaAltaP1 = new Date();
        Paciente paciente1 = new Paciente("Juan", "Perez", "1001", fechaInternacionP1);
        paciente1.darAlta(fechaAltaP1);

        System.out.println("fecha alta : " + paciente1.getFechaAlta());
        System.out.println("fecha internacion : " + paciente1.getFechaInternacion());
        System.out.println(paciente1.toString());


        System.out.println("======= Paciente 2 ======");

        Date fechaAltaP2 = new Date(122, Calendar.OCTOBER, 30);
        Date fechaInternacionP2 = new Date(123, Calendar.JUNE, 10);
        Paciente paciente2 = new Paciente("Juan", "Perez", "1002", fechaInternacionP2);
        paciente2.darAlta(fechaAltaP2);
        System.out.println("fecha alta : " + paciente2.getFechaAlta());
        System.out.println("fecha internacion : " + paciente2.getFechaInternacion());
        System.out.println(paciente2.toString());

        System.out.println("======= Paciente 3 ======");

        Date fechaAltaP3 = new Date(120, Calendar.MAY, 1);
        Date fechaInternacionP3 = new Date(121, Calendar.JUNE, 10); // No cumple condicion del constructor
        Paciente paciente3 = new Paciente("Juan", "Perez", "1003", fechaInternacionP3);
        paciente3.darAlta(fechaAltaP3);
        System.out.println("fecha alta : " + paciente3.getFechaAlta());
        System.out.println("fecha internacion : " + paciente3.getFechaInternacion());
        System.out.println(paciente3.toString());

    }
}
