/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Dell
 */
public class Propietario {
    private String nombre;
    private String cedula;
    private int edad;
    private String profesion;
    
    public Propietario() {
    }

    public Propietario(String nombre, String cedula, int edad, String profesion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion(){
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
}
