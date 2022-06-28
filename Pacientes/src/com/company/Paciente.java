package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;

    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws Exception {

        Date hoy = new Date();
        if (fechaInternacion.before(hoy)) {  //fechaInternacion < hoy
            this.nombre = nombre;
            this.apellido = apellido;
            this.historiaClinica = historiaClinica;
            fechaAlta = null;
            this.fechaInternacion = fechaInternacion;
        } else {
            throw new Exception("La fecha de internacion no puede ser menor a la fecha actual");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public void setFechaInternacion(Date fechaInternacion) {
        this.fechaInternacion = fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws Exception {

        if (fechaAlta.after(fechaInternacion)) {  // fechaAlta  > fechaInternacion
            setFechaAlta(fechaAlta);
        }else {
            throw new Exception("La fecha de Alta no puede ser menor a la fecha de Internacion");
        }
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre = '" + nombre + '\'' +
                ", apellido ='" + apellido + '\'' +
                ", historiaClinica = '" + historiaClinica + '\'' +
                ", fechaInternacion = " + fechaInternacion +
                '}';
    }
}
