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
    public static void main(String[] args) {
        
    }
    
}
