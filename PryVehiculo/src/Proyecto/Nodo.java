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
    private Propietario datoPro;
    private Vehiculo datoVehic;
    private Nodo siguiente;

    public Nodo(Propietario datoPro) {
        this.datoPro = datoPro;
        siguiente=null;
    }
    
    public Nodo(Vehiculo datoVehic) {
        this.datoVehic = datoVehic;
        siguiente=null;
    }

    public Nodo(Propietario datoPro, Nodo siguiente) {
        this.datoPro = datoPro;
        this.siguiente = siguiente;
    }

    public Nodo(Vehiculo datoVehic, Nodo siguiente) {
        this.datoVehic = datoVehic;
        this.siguiente = siguiente;
    }

    public Propietario getDatoPro() {
        return datoPro;
    }

    public void setDatoPro(Propietario datoPro) {
        this.datoPro = datoPro;
    }

    public Vehiculo getDatoVehic() {
        return datoVehic;
    }

    public void setDatoVehic(Vehiculo datoVehic) {
        this.datoVehic = datoVehic;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
        
}
