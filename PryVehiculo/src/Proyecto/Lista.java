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
    public void agregarInicioMateria(Materia dato){
        Nodo nuevo=new Nodo(dato);
        if(inicio==fin && fin==null){
            inicio=fin=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
    }
    public void agregarFinMateria(Materia dato) {

        Nodo nuevo = new Nodo(dato);
        if (inicio==fin && inicio==null) {
            inicio=fin=nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    public void agregarInicioEstudiante(Estudiante dato){
        Nodo nuevo1=new Nodo(dato);
        if(inicio==fin && fin==null){
            inicio=fin=nuevo1;
        }else{
            nuevo1.setSiguiente(inicio);
            inicio=nuevo1;
        }
    }
    public void agregarFinEstudiante(Estudiante dato) {

        Nodo nuevo1 = new Nodo(dato);
        if (inicio==fin && inicio==null) {
            inicio=fin=nuevo1;
        } else {
            fin.setSiguiente(nuevo1);
            fin=nuevo1;
        }
    }
    public void agregarInicioDocente(Docente dato){
        Nodo nuevo2=new Nodo(dato);
        if(inicio==fin && fin==null){
            inicio=fin=nuevo2;
        }else{
            nuevo2.setSiguiente(inicio);
            inicio=nuevo2;
        }
    }
    public void agregarFinDocente(Docente dato) {

        Nodo nuevo2 = new Nodo(dato);
        if (inicio==fin && inicio==null) {
            inicio=fin=nuevo2;
        } else {
            fin.setSiguiente(nuevo2);
            fin=nuevo2;
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
    
    public void BuscarPorEdad() {
        Scanner br = new Scanner(System.in);
        System.out.println("Ingrese la edad del Estudiante");
        int anio = br.nextInt();
        Integer.parseInt(null) a=anio;
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getDatoEst().getEdad().(a)){
                System.out.println("********");
                System.out.println("" + aux.getDatoEst().getNombre());
                System.out.println("" + aux.getDatoEst().getApellido());
                System.out.println("" + aux.getDatoEst().getEdad());
                System.out.println("********");
            }
            aux = aux.getSiguiente();

        }

    }
    public void BuscarPorMateria() {
        Scanner br = new Scanner(System.in);
        System.out.println("Ingrese la materia a buscar");
        String modelo = br.nextLine();
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getDatoMat().getNombreMateria().equals(modelo)) {
                System.out.println("********");
                System.out.println("" + aux.getDatoMat().getNombreMateria());
                System.out.println("" + aux.getDatoMat().getHorarioMateria());
                System.out.println("********");
            }
            aux = aux.getSiguiente();

        }

    }
    public void BuscarPorNombreEstudiante() {
        Scanner br = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante a buscar");
        String nombre = br.nextLine();
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getDatoEst().getNombre().equals(nombre)) {
                System.out.println("********");
                System.out.println("" + aux.getDatoEst().getNombre());
                System.out.println("" + aux.getDatoEst().getApellido());
                System.out.println("" + aux.getDatoEst().getEdad());
                System.out.println("********");
            }
            aux = aux.getSiguiente();

        }

    }
    public void BuscarPorCedula() {
        Scanner br = new Scanner(System.in);
        System.out.println("Ingrese la cedula a buscar");
        String cedula = br.nextLine();
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getDatoDoc().getCedula().equals(cedula)) {
                System.out.println("********");
                System.out.println("" + aux.getDatoDoc().getNombre());
                System.out.println("" + aux.getDatoDoc().getCedula());
                System.out.println("" + aux.getDatoDoc().getTipoMateria());
                System.out.println("********");
            }
            aux = aux.getSiguiente();

        }

    }
    public boolean eliminaValorEstudiante(String busqueda) {
        if (inicio != null) {

            if (inicio == fin && inicio.getDatoEst().getNombre().compareTo(busqueda) == 0) {
                inicio = fin = null;
                return true;
            } else if (inicio.getDatoEst().getNombre().compareTo(busqueda) == 0) {
                inicio = inicio.getSiguiente();
                return true;
            } else {

                Nodo anterior = inicio;
                Nodo temporal = inicio.getSiguiente();

                while (temporal != null && temporal.getDatoEst().getNombre().compareTo(busqueda) != 0) {
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
    public boolean eliminaValorDocente(String busqueda) {
        if (inicio != null) {

            if (inicio == fin && inicio.getDatoDoc().getCedula().compareTo(busqueda) == 0) {
                inicio = fin = null;
                return true;
            } else if (inicio.getDatoDoc().getCedula().compareTo(busqueda) == 0) {
                inicio = inicio.getSiguiente();
                return true;
            } else {

                Nodo anterior = inicio;
                Nodo temporal = inicio.getSiguiente();

                while (temporal != null && temporal.getDatoDoc().getCedula().compareTo(busqueda) != 0) {
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
