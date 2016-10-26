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
    private Nodo1 inicio1;
    private Nodo1 fin1;
    private Nodo2 inicio2;
    private Nodo2 fin2;
    
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
        Nodo2 nuevo2=new Nodo2(dato);
        if(inicio2==fin2 && fin2==null){
            inicio2=fin2=nuevo2;
        }else{
            nuevo2.setSiguiente(inicio2);
            inicio2=nuevo2;
        }
    }
    public void agregarFinEstudiante(Estudiante dato) {

        Nodo2 nuevo2 = new Nodo2(dato);
        if (inicio2==fin2 && inicio2==null) {
            inicio2=fin2=nuevo2;
        } else {
            fin2.setSiguiente(nuevo2);
            fin2=nuevo2;
        }
    }
    public void agregarInicioDocente(Docente dato){
        Nodo1 nuevo1=new Nodo1(dato);
        if(inicio1==fin1 && fin1==null){
            inicio1=fin1=nuevo1;
        }else{
            nuevo1.setSiguiente(inicio1);
            inicio1=nuevo1;
        }
    }
    public void agregarFinDocente(Docente dato) {

        Nodo1 nuevo1 = new Nodo1(dato);
        if (inicio1==fin1 && inicio1==null) {
            inicio1=fin1=nuevo1;
        } else {
            fin1.setSiguiente(nuevo1);
            fin1=nuevo1;
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
        
        Nodo2 aux = inicio2;

        while (aux != null) {
            if (aux.getDatoEst().getClass().equals(anio)){
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
        Nodo2 aux = inicio2;

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
    public void BuscarPorCedulaDocente() {
        Scanner br = new Scanner(System.in);
        System.out.println("Ingrese la cedula del docente a buscar");
        String cedula = br.nextLine();
        Nodo1 aux = inicio1;

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
        if (inicio2 != null) {

            if (inicio2 == fin2 && inicio2.getDatoEst().getNombre().compareTo(busqueda) == 0) {
                inicio2 = fin2 = null;
                return true;
            } else if (inicio2.getDatoEst().getNombre().compareTo(busqueda) == 0) {
                inicio2 = inicio2.getSiguiente();
                return true;
            } else {

                Nodo2 anterior = inicio2;
                Nodo2 temporal = inicio2.getSiguiente();

                while (temporal != null && temporal.getDatoEst().getNombre().compareTo(busqueda) != 0) {
                    anterior = anterior.getSiguiente();
                    temporal = temporal.getSiguiente();
                }

                if (temporal != null) {
                    anterior.setSiguiente(temporal.getSiguiente());
                    if (temporal == fin2) {
                        fin2 = anterior;
                    }
                    return true;
                }

                return false;
            }

        }
        return false;

    }
    public boolean eliminaValorMateria(String busqueda) {
        if (inicio != null) {

            if (inicio == fin && inicio.getDatoMat().getNombreMateria().compareTo(busqueda) == 0) {
                inicio = fin = null;
                return true;
            } else if (inicio.getDatoMat().getNombreMateria().compareTo(busqueda) == 0) {
                inicio = inicio.getSiguiente();
                return true;
            } else {

                Nodo anterior = inicio;
                Nodo temporal = inicio.getSiguiente();

                while (temporal != null && temporal.getDatoMat().getNombreMateria().compareTo(busqueda) != 0) {
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
            System.out.println("" + aux.getDatoMat().getNombreMateria());
            System.out.println("" + aux.getDatoMat().getHorarioMateria());
            System.out.println("********");
            aux = aux.getSiguiente();
        }
    }
    
    public void imprimir2() {
        Nodo1 aux = inicio1;
        while (aux != null) {
            System.out.println("********");
            System.out.println("" + aux.getDatoDoc().getNombre());
            System.out.println("" + aux.getDatoDoc().getCedula());
            System.out.println("" + aux.getDatoDoc().getTipoMateria());
            System.out.println("********");
            aux = aux.getSiguiente();
        }
    }
    public void imprimir3() {
        Nodo2 aux = inicio2;
        while (aux != null) {
            System.out.println("********");
            System.out.println("" + aux.getDatoEst().getNombre());
            System.out.println("" + aux.getDatoEst().getApellido());
            System.out.println("" + aux.getDatoEst().getEdad());
            System.out.println("********");
            aux = aux.getSiguiente();
        }
    }
    public void Archivo1() {
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        File archivo;
        archivo = new File("C:\\Users\\PERSONAL\\Desktop\\Proyectos\\PryVehiculo\\src\\Proyecto\\ArchivoMateria.txt");

        try {

            archivo.createNewFile();
            
            w = new FileWriter(archivo, false);
            wr = new PrintWriter(w);
            bw = new BufferedWriter(w);

            Nodo aux = inicio;

            while (aux != null) {

                wr.println(aux.getDatoMat().getNombreMateria()+ ", " + aux.getDatoMat().getHorarioMateria());
                aux = aux.getSiguiente();
            }

            wr.close();
            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void Archivo2() {
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        File archivo;
        archivo = new File("C:\\Users\\PERSONAL\\Desktop\\Proyectos\\PryVehiculo\\src\\Proyecto\\ArchivoDocente.txt");

        try {

            archivo.createNewFile();
            
            w = new FileWriter(archivo, false);
            wr = new PrintWriter(w);
            bw = new BufferedWriter(w);

            Nodo1 aux = inicio1;

            while (aux != null) {

                wr.println(aux.getDatoDoc().getNombre()+ ", " + aux.getDatoDoc().getCedula()+", "+ aux.getDatoDoc().getTipoMateria());
                aux = aux.getSiguiente();
            }

            wr.close();
            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void Archivo3() {
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        File archivo;
        archivo = new File("C:\\Users\\PERSONAL\\Desktop\\Proyectos\\PryVehiculo\\src\\Proyecto\\ArchivoEstudiante.txt");

        try {

            archivo.createNewFile();
            
            w = new FileWriter(archivo, false);
            wr = new PrintWriter(w);
            bw = new BufferedWriter(w);

            Nodo2 aux = inicio2;

            while (aux != null) {

                wr.println(aux.getDatoEst().getNombre()+ ", " + aux.getDatoEst().getApellido()+", "+aux.getDatoEst().getEdad());        
                aux = aux.getSiguiente();
            }

            wr.close();
            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public String leerArchivo1(String path) {

        String total = " ";
        try {
            FileReader fr = new FileReader(new File(path));
            BufferedReader br = new BufferedReader(fr);

            String linea = " ";
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
    public String leerArchivo2(String path) {

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
    public String leerArchivo3(String path) {

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
