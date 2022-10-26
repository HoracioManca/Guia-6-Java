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
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int i;
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int [] Vector = new int [n];
        for (i=0;i<n;i++){
            Vector[i] = (int)(Math.random()*50+1);
            System.out.println("vector " + Vector[i]);
        
    }
        System.out.println("Ingrese un numero a buscar");
        int num = leer.nextInt();
        
        for (i=0;i<n;i++){
            if (Vector[i]==num){
            System.out.println("el numero se encuentra en la posicion " + i);
            }
    
}
    }
}

        
        

