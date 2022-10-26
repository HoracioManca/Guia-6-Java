/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejerciciosaprendizaje;

/**
 *
 * @author horac
 * 
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
 * muestre por pantalla en orden descendente.
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      int vector[] = new int[101];
      
        for (int i = 1; i <= 100; i++) {
            vector[i] = i;
            System.out.println(vector[i]);
        }
        for (int i = 100; i > 0; i--) {
            System.out.println(vector[i]);
            
        }
    }
    
}
