/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author PERSONAL
 */
public class Materia {
    
    private String nombreMateria;
    private int horarioMateria;

    public Materia() {
    }

    public Materia(String nombreMateria, int horarioMateria) {
        this.nombreMateria = nombreMateria;
        this.horarioMateria = horarioMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getHorarioMateria() {
        return horarioMateria;
    }

    public void setHorarioMateria(int horarioMateria) {
        this.horarioMateria = horarioMateria;
    }

    
    
    
    
}
