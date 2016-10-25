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
public class Nodo {
    private Materia datoMat;
    private Nodo siguiente;

    public Nodo(Materia datoMat) {
        this.datoMat = datoMat;
        this.siguiente=null;
    }

    public Nodo(Materia datoMat, Docente datoDoc, Estudiante datoEst, Nodo siguiente) {
        this.datoMat = datoMat;
        this.siguiente = siguiente;
    }

    public Materia getDatoMat() {
        return datoMat;
    }

    public void setDatoMat(Materia datoMat) {
        this.datoMat = datoMat;
    }
     public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }  
        
}
