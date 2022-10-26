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
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
    cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el tamaño del cuadrado");
        num= leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.print("* "); // este es la linea superior
        
        }
        System.out.println();
        for (int i = 0; i < num-2; i++) {
            System.out.print("*");
            for (int j = 0; j < num-2; j++) {
                System.out.print("  ");
                
            }
            System.out.println(" * ");
            
        }
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
       
        
        
    }
    
}
