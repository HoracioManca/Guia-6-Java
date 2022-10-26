/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras_guia6;

import java.util.Scanner;

/**
 *
 * @author horac
 * 
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general
 */
public class Ejercicio06_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        double altura, promedio, promedio1;
        int cont,cont2;
        double suma1,suma2;
        cont = 0;
       
        suma1=0;
        suma2=0;
                
         
        for (int i = 0; i < n; i++) {
                System.out.println("Ingrese altura para la persona N° "+i);
                altura = leer.nextDouble();
                
                suma1=suma1 +altura;
                      
                if (altura<1.6) {
                    cont++;
                    suma2=suma2+altura;
                
            }else 
                  cont=cont;
                
                
                
            
        }
        promedio = suma1 /n;
        promedio1 = suma2/cont;
        System.out.println("promedio de estauras < a 1.6 mts: " +promedio1);
        System.out.println("Pormedio general de estaturas: "+promedio);
        
    }
    
}
