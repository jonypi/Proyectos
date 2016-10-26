/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;


public class Nodo2 {
    private Estudiante datoEst;
    private Nodo2 siguiente;

    public Nodo2(Estudiante datoEst) {
        this.datoEst = datoEst;
        siguiente=null;
    }

    public Nodo2(Estudiante datoEst, Nodo2 siguiente) {
        this.datoEst = datoEst;
        this.siguiente = siguiente;
    }
    
    public Estudiante getDatoEst() {
        return datoEst;
    }

    public void setDatoEst(Estudiante datoEst) {
        this.datoEst = datoEst;
    }

    public Nodo2 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo2 siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
}
