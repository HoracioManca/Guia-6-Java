/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejerciciosaprendizaje;

import java.util.Scanner;

/**
 *
 * @author horac
 * Crear un programa que dado un numero determine si es par o impar
 * 
 * 
 * 
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese un numero");
        int numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero ingresao es PAR");
            
            
        }else {
            System.out.println("El numero es IMPAR");
        }
            
    }
    
}
