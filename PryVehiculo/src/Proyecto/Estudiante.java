/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author PERSONAL
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String n_matricula;

    public Estudiante(String nombre, String apellido, int edad, String n_matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.n_matricula = n_matricula;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getN_matricula() {
        return n_matricula;
    }

    public void setN_matricula(String n_matricula) {
        this.n_matricula = n_matricula;
    }
    

    
}
