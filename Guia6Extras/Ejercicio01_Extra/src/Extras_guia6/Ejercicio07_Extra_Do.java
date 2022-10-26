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
 */
public class Ejercicio07_Extra_Do {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que dese igresar");
        int cant= leer.nextInt();
        int cont=0;
        int num,suma,max,min;
        max=0;
        min=0;
        suma=0;
        do {
            
            System.out.println("Ingrese numero");
            num=leer.nextInt();
            
            cont++;
            suma=suma+num;
           if (num>=max) {
              max=num;
              
          }else
              max=max;
          if (num<=min || min ==0) {
              min=num;
              
          }else
              min=min;
                    
            
        } while (cont<cant);
        
        System.out.println("Maximo = " +max);
        System.out.println("Minimo = "+min);
        System.out.println("Promedio = "+suma/cont);
        
    }
    
}
