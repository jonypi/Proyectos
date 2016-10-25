/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;


public class Nodo2 {
    private Estudiante datoEst;
    private Nodo siguiente;

    public Nodo2(Estudiante datoEst) {
        this.datoEst = datoEst;
    }

    public Nodo2(Estudiante datoEst, Nodo siguiente) {
        this.datoEst = datoEst;
        this.siguiente = siguiente;
    }

    public Estudiante getDatoEst() {
        return datoEst;
    }

    public void setDatoEst(Estudiante datoEst) {
        this.datoEst = datoEst;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
