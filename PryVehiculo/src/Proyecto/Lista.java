/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cisco
 */
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    
    public Lista(){
        
    }
    public void agregarInicioVehiculo(Vehiculo dato){
        Nodo nuevo=new Nodo(dato);
        if(inicio==fin && fin==null){
            inicio=fin=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
    }
    public void agregarFinVehiculo(Vehiculo dato) {

        Nodo nuevo = new Nodo(dato);
        if (inicio==fin && inicio==null) {
            inicio=fin=nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    public void agregarInicioPropietario(Propietario dato1){
        Nodo nuevo1=new Nodo(dato1);
        if(inicio==fin && fin==null){
            inicio=fin=nuevo1;
        }else{
            nuevo1.setSiguiente(inicio);
            inicio=nuevo1;
        }
    }
    public void agregarFinPropietario(Propietario dato1) {

        Nodo nuevo1 = new Nodo(dato1);
        if (inicio==fin && inicio==null) {
            inicio=fin=nuevo1;
        } else {
            fin.setSiguiente(nuevo1);
            fin=nuevo1;
        }
    }

    public void eliminarInicio(){
        if (inicio!=fin){
            Nodo aux =inicio;
            inicio=inicio.getSiguiente();
            aux=null;
        }else{
            inicio=null;
            fin=null;
        }
    }
    public void eliminarFin(){
        Nodo aux=inicio;
        if(inicio==fin){
            inicio=fin=null;
        }while (aux.getSiguiente()!=fin){
            aux=aux.getSiguiente();
        }
        aux.setSiguiente(null);
    }
    
    public void BuscarPorAnio() {
        Scanner br = new Scanner(System.in);
        System.out.println("Ingrese el marca a buscar");
        int anio = br.nextInt();
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getDatoVehic().getMarca().equals(anio)) {
                System.out.println("********");
                System.out.println("" + aux.getDatoVehic().getMarca());
                System.out.println("" + aux.getDatoVehic().getModelo());
                System.out.println("" + aux.getDatoVehic().getColor());
                System.out.println("" + aux.getDatoVehic().getAnio());
                System.out.println("" + aux.getDatoVehic().getTipo());
                System.out.println("********");
            }
            aux = aux.getSiguiente();

        }

    }
    public void BuscarPorModelo() {
        Scanner br = new Scanner(System.in);
        System.out.println("Ingrese el marca a buscar");
        String modelo = br.nextLine();
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getDatoVehic().getModelo().equals(modelo)) {
                System.out.println("********");
                System.out.println("" + aux.getDatoVehic().getMarca());
                System.out.println("" + aux.getDatoVehic().getModelo());
                System.out.println("" + aux.getDatoVehic().getColor());
                System.out.println("" + aux.getDatoVehic().getAnio());
                System.out.println("" + aux.getDatoVehic().getTipo());
                System.out.println("********");
            }
            aux = aux.getSiguiente();

        }

    }
    public void BuscarPorNombre() {
        Scanner br = new Scanner(System.in);
        System.out.println("Ingrese el marca a buscar");
        String nombre = br.nextLine();
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getDatoPro().getNombre().equals(nombre)) {
                System.out.println("********");
                System.out.println("" + aux.getDatoPro().getNombre());
                System.out.println("" + aux.getDatoPro().getCedula());
                System.out.println("" + aux.getDatoPro().getProfesion());
                System.out.println("" + aux.getDatoPro().getEdad());
                System.out.println("********");
            }
            aux = aux.getSiguiente();

        }

    }
    public void BuscarPorCedula() {
        Scanner br = new Scanner(System.in);
        System.out.println("Ingrese el marca a buscar");
        String cedula = br.nextLine();
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getDatoPro().getCedula().equals(cedula)) {
                System.out.println("********");
                System.out.println("" + aux.getDatoPro().getNombre());
                System.out.println("" + aux.getDatoPro().getCedula());
                System.out.println("" + aux.getDatoPro().getProfesion());
                System.out.println("" + aux.getDatoPro().getEdad());
                System.out.println("********");
            }
            aux = aux.getSiguiente();

        }

    }
    public boolean eliminaValorPropietario(String busqueda) {
        if (inicio != null) {

            if (inicio == fin && inicio.getDatoPro().getNombre().compareTo(busqueda) == 0) {
                inicio = fin = null;
                return true;
            } else if (inicio.getDatoPro().getNombre().compareTo(busqueda) == 0) {
                inicio = inicio.getSiguiente();
                return true;
            } else {

                Nodo anterior = inicio;
                Nodo temporal = inicio.getSiguiente();

                while (temporal != null && temporal.getDatoPro().getNombre().compareTo(busqueda) != 0) {
                    anterior = anterior.getSiguiente();
                    temporal = temporal.getSiguiente();
                }

                if (temporal != null) {
                    anterior.setSiguiente(temporal.getSiguiente());
                    if (temporal == fin) {
                        fin = anterior;
                    }
                    return true;
                }

                return false;
            }

        }
        return false;

    }
    public boolean eliminaValorVehiculo(String busqueda) {
        if (inicio != null) {

            if (inicio == fin && inicio.getDatoVehic().getMarca().compareTo(busqueda) == 0) {
                inicio = fin = null;
                return true;
            } else if (inicio.getDatoVehic().getMarca().compareTo(busqueda) == 0) {
                inicio = inicio.getSiguiente();
                return true;
            } else {

                Nodo anterior = inicio;
                Nodo temporal = inicio.getSiguiente();

                while (temporal != null && temporal.getDatoVehic().getMarca().compareTo(busqueda) != 0) {
                    anterior = anterior.getSiguiente();
                    temporal = temporal.getSiguiente();
                }

                if (temporal != null) {
                    anterior.setSiguiente(temporal.getSiguiente());
                    if (temporal == fin) {
                        fin = anterior;
                    }
                    return true;
                }

                return false;
            }

        }
        return false;

    }
    public void imprimir() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println("********");
            System.out.println("" + aux.getDatoVehic().getMarca());
            System.out.println("" + aux.getDatoVehic().getModelo());
            System.out.println("" + aux.getDatoVehic().getColor());
            System.out.println("" + aux.getDatoVehic().getTipo());
            System.out.println("" + aux.getDatoVehic().getAnio());
            System.out.println("********");
            aux = aux.getSiguiente();
        }
    }
    
    public void imprimir2() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println("********");
            System.out.println("" + aux.getDatoPro().getNombre());
            System.out.println("" + aux.getDatoPro().getCedula());
            System.out.println("" + aux.getDatoPro().getProfesion());
            System.out.println("" + aux.getDatoPro().getEdad());
            System.out.println("********");
            aux = aux.getSiguiente();
        }
    }
    public void Archivo() {
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        File archivo;
        archivo = new File("Archivos.txt");

        try {

            archivo.createNewFile();
            
            w = new FileWriter(archivo, false);
            wr = new PrintWriter(w);
            bw = new BufferedWriter(w);

            Nodo aux = inicio;

            while (aux != null) {

                wr.println(aux.getDatoVehic().getMarca() + ", " + aux.getDatoVehic().getModelo() + ", " +
                aux.getDatoVehic().getColor() + ", " + aux.getDatoVehic().getTipo()+", "+aux.getDatoVehic().getAnio());
                aux = aux.getSiguiente();
            }

            wr.close();
            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public String leerArchivo(String path) {

        String total = "";
        try {
            FileReader fr = new FileReader(new File(path));
            BufferedReader br = new BufferedReader(fr);

            String linea = "";
            while ((linea = br.readLine()) != null) {
                total = total + linea + "\n";

            }

        } catch (FileNotFoundException e) {

            System.out.println("Problemas de archivo: " + e.getMessage());
        } catch (IOException e) {

            System.out.println("Problemas en la lectura del archivo: " + e.getMessage());
        }

        return total;

    }
    
}
