/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;


public class Nodo1 {
    private Docente datoDoc;
    private Nodo siguiente;

    public Nodo1(Docente datoDoc) {
        this.datoDoc = datoDoc;
        siguiente=null;
    }

    public Nodo1(Docente datoDoc, Nodo siguiente) {
        this.datoDoc = datoDoc;
        this.siguiente = siguiente;
    }

    public Docente getDatoDoc() {
        return datoDoc;
    }

    public void setDatoDoc(Docente datoDoc) {
        this.datoDoc = datoDoc;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
