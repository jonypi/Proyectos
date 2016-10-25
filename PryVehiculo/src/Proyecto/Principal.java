/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.Scanner;

/**
 *
 * @author cisco
 */
public class Principal {

    public static int leerEntero(String mensaje) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println(mensaje);
        int dato = ingreso.nextInt();
        return dato;

    }
    public static String leerString(String mensaje) {

        Scanner ingreso = new Scanner(System.in);
        System.out.println(mensaje);
        String dato = ingreso.nextLine();
        return dato;
    }

public static int menu() {

        System.out.println("Menu");
        System.out.println("1. Tipos de ingreso de datos");
        System.out.println("2. Tipos de eliminacion de datos");
        System.out.println("3. Imprimir Lista");
        System.out.println("4. Tipos de busquedas");
        System.out.println("5. Salir ");

        int opcion = leerEntero("Seleccione una opcion");
        return opcion;

    }

    public static int submenu() {

        System.out.println("Tipos de ingreso de datos");
        System.out.println("1. Ingreso al inicio");
        System.out.println("2. Ingreso al final");
        System.out.println("3. Regresar al Menu");

        int opcion = leerEntero("Seleccione una opcion");
        return opcion;

    }
    public static int submenu2() {

        System.out.println("Tipos de eliminacion de datos");
        System.out.println("1. Eliminar al inicio");
        System.out.println("2. Eliminar al final");
        System.out.println("3. Eliminar un dato");
        System.out.println("4. Regresar al Menu");

        int opcion = leerEntero("Seleccione una opcion");
        return opcion;

    }

    public static int submenu3() {

        System.out.println("Tipos de Busquedas");
        System.out.println("1. Busqueda por Anio de automovil");
        System.out.println("2. Busqueda por Modelo de automovil");
        System.out.println("3. Busqueda por Nombre de propietario");
        System.out.println("4. Busqueda por Cedula de propietario");
        System.out.println("5. Regresar al Menu");

        int opcion = leerEntero("Seleccione una opcion");
        return opcion;

    }
    
    public static void main(String[] args) {
        Lista coleccion = new Lista();
        String total = coleccion.leerArchivo("Archivos.txt");
        
        
        int op = 0;
        int op2 = 0;
        do {
            op = menu();
            switch (op) {
                case 1:
                    op2 = submenu();
                    switch (op2) {
                        case 1:
                            Docente v1 = new Docente();
                            Propietario p1=new Propietario();
                            v1.setMarca(leerString("Ingrese la Marca"));
                            v1.setModelo(leerString("Ingrese el Modelo"));
                            v1.setColor(leerString("Ingrese el Color"));
                            v1.setAnio(leerEntero("Ingrese el Anio del modelo"));
                            p1.setNombre(leerString("Ingrese el nombre del propietario"));
                            p1.setCedula(leerString("Ingrese la cedula del propietario"));
                            p1.setProfesion(leerString("Ingrese la profesion del propietario"));
                            p1.setEdad(leerEntero("Ingrese los anios del propietario"));
                            coleccion.agregarInicioVehiculo(v1);
                            coleccion.agregarInicioPropietario(p1);
                            coleccion.Archivo();
                           
                            break;
                        case 2:
                            Docente v2 = new Docente();
                            Propietario p2=new Propietario();
                            v2.setMarca(leerString("Ingrese la Marca"));
                            v2.setModelo(leerString("Ingrese el Modelo"));
                            v2.setColor(leerString("Ingrese el Color"));
                            v2.setAnio(leerEntero("Ingrese el Anio del modelo"));
                            p2.setNombre(leerString("Ingrese el nombre del propietario"));
                            p2.setCedula(leerString("Ingrese la cedula del propietario"));
                            p2.setProfesion(leerString("Ingrese la profesion del propietario"));
                            p2.setEdad(leerEntero("Ingrese los anios del propietario"));
                            coleccion.agregarFinVehiculo(v2);
                            coleccion.agregarFinPropietario(p2);
                            coleccion.Archivo();
                            break;
                        case 3:

                        default:
                            System.out.println("No se escogio ninguna opcion");
                            }
                            break;
                            
                        
                case 2:
                    op2 = submenu2();
                    switch (op2) {
                        case 1:
                            coleccion.eliminarInicio();
                            coleccion.Archivo();
                            break;
                        case 2:
                            coleccion.eliminarFin();
                            coleccion.Archivo();
                            break;
                        case 3:
                            coleccion.eliminaValorPropietario(leerString("Ingrese el nombre que desea eliminar"));
                            
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("No se escogio ninguna opcion");
                            break;
                    }
                    break;

                case 3:

                    coleccion.imprimir();
                    coleccion.imprimir2();
                    break;

                case 4:
                    op2 = submenu3();
                    switch (op2) {
                        case 1:
                            coleccion.BuscarPorModelo();
                            break;
                        case 2:
                            coleccion.BuscarPorAnio();
                            break;
                        case 3:
                            coleccion.BuscarPorNombre();
                            break;
                        case 4:
                            coleccion.BuscarPorCedula();
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("No ha seleccionado ninguna opcion");
                            break;
                    }
                    break;

                case 5:

                    System.out.println("FIN DEL PROGRAMA");

                    break;
                default:

                    System.out.println("NO HA SELECCIONADO NINGUNA OPCION");

                    break;

            }

        } while (op != 5);
    }

    

    
        
}
        
    
    

