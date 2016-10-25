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
public class Docente {
    
    private String nombre;
    private String cedula;
    private String tipoMateria;

    public Docente() {
    }


    public Docente(String nombre, String cedula, String tipoMateria) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.tipoMateria = tipoMateria;
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

    public String getTipoMateria() {
        return tipoMateria;
    }

    public void setTipoMateria(String tipoMateria) {
        this.tipoMateria = tipoMateria;
    }
    

    
    
    
}
