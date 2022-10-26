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
public class Ejercicio05_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("OBRA SOCIAL");
        System.out.println("ingrese una opción para determinar le descuento");
        String opcion= leer.next();
        opcion = opcion.toUpperCase();
        System.out.println("Ingrese el valor del tratamiento");
        int valor = leer.nextInt();
               
        
        switch (opcion){
            case "A":
                System.out.println("Valor bruto: $ " + valor);
                System.out.println("descuento 50% socio lase A: $ " + valor/2);
                System.out.println("Imprte a pagar: $ " +valor/2);
                break;
            case "B":
                System.out.println("Valor bruto: $ " + valor);
                System.out.println("descuento 35% socio lase B: $ " + valor *.35);
                System.out.println("Imprte a pagar: $" + (valor - valor*.35)); 
                break;
                
            case "C":
                System.out.println("Valor bruto: $ " + valor);
                System.out.println("descuento 0% socio lase C: $ " + valor *.0);
                System.out.println("Imprte a pagar: $" + (valor - valor*.0)); 
                break;
                
                
                
            
        }
        
    }
    
}
