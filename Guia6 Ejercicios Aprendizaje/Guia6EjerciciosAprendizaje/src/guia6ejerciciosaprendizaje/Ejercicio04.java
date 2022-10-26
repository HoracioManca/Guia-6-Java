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
 * 
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
   Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingres los grados centígrados a convertir");
        int C = leer.nextInt();
        int F = 32 +(9* C /5);
        System.out.println(+ C + " grados C = " + F + " grados F");
        
    }
    
}
