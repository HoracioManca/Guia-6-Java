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
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
    la función equals() en Java.
 * 
 * 
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un palabra o frase");
        String frase = leer.nextLine();
        //frase.toUpperCase();
        
        if (frase.toUpperCase().equals("EUREKA")) { // Aqui la convertimos en Mayuscula para comprar
            System.out.println("Correco la frase ingresada es: " + frase);
            
        }else{
            System.out.println("Incorrecto !!");
        }
        
        
    }
    
}
