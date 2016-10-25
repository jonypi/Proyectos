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
        System.out.println("1. Busqueda por Cedula de docente");
        System.out.println("2. Busqueda por Edad de estudiante");
        System.out.println("3. Busqueda por Nombre de materia");
        System.out.println("4. Busqueda por Nombre se estudiante");
        System.out.println("5. Regresar al Menu");

        int opcion = leerEntero("Seleccione una opcion");
        return opcion;

    }
    
    public static void main(String[] args) {
        Lista coleccion = new Lista();
        //String total = coleccion.leerArchivo("Archivos.txt");
        
        
        int op = 0;
        int op2 = 0;
        do {
            op = menu();
            switch (op) {
                case 1:
                    op2 = submenu();
                    switch (op2) {
                        case 1:
                            Docente d1 = new Docente();
                            Estudiante s1 = new Estudiante();
                            Materia m1 = new Materia();
                            
                            m1.setNombreMateria(leerString("Ingrese el nombre de la materia"));
                            m1.setHorarioMateria(leerEntero("Ingrese la hora de la materia"));
                            d1.setNombre(leerString("Ingrese le nombre del docente"));
                            d1.setCedula(leerString("Ingrese la cedula del docente"));
                            d1.setTipoMateria(leerString("Ingrese la materia a impartir por el docente"));
                            s1.setNombre(leerString("Ingrese el nombre del estudiante"));
                            s1.setApellido(leerString("Ingrese el apellido del estudiante"));
                            s1.setEdad(leerEntero("Ingrese la edad del estudiante"));
                            coleccion.agregarInicioMateria(m1);
                            coleccion.agregarInicioDocente(d1);
                            coleccion.agregarInicioEstudiante(s1);
                            
                            //coleccion.Archivo();
                           
                            break;
                        case 2:
                            Docente d2 = new Docente();
                            Estudiante s2 = new Estudiante();
                            Materia m2 = new Materia();
                            
                            m2.setNombreMateria(leerString("Ingrese el nombre de la materia"));
                            m2.setHorarioMateria(leerEntero("Ingrese la hora de la materia"));
                            d2.setNombre(leerString("Ingrese le nombre del docente"));
                            d2.setCedula(leerString("Ingrese la cedula del docente"));
                            d2.setTipoMateria(leerString("Ingrese la materia a impartir por el docente"));
                            s2.setNombre(leerString("Ingrese el nombre del estudiante"));
                            s2.setApellido(leerString("Ingrese el apellido del estudiante"));
                            s2.setEdad(leerEntero("Ingrese la edad del estudiante"));
                            coleccion.agregarFinMateria(m2);
                            coleccion.agregarFinDocente(d2);
                            coleccion.agregarFinEstudiante(s2);
                            
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
                            //coleccion.Archivo();
                            break;
                        case 2:
                            coleccion.eliminarFin();
                            //coleccion.Archivo();
                            break;
                        case 3:
                            //coleccion.eliminaValorMateria(leerString("Ingrese el nombre que desea eliminar"));
                            
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
                    coleccion.imprimir3();
                    break;

                case 4:
                    op2 = submenu3();
                    switch (op2) {
                        case 1:
                            coleccion.BuscarPorCedulaDocente();
                            break;
                        case 2:
                            coleccion.BuscarPorEdad();
                            break;
                        case 3:
                            coleccion.BuscarPorMateria();
                            break;
                        case 4:
                            coleccion.BuscarPorNombreEstudiante();
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
        
    
    

