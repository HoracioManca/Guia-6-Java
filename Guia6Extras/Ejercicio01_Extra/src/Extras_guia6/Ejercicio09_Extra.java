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
 * Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente
 * 
 * 
 */
public class Ejercicio09_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num1,num2,cociente;
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        cociente=0;
        while (num1>=num2){
            num1=num1-num2;
            cociente++;
            
            
        }
        System.out.println("RESULTADO POR RESTAS SUCESIVAS");
        System.out.println("El residuo es: "+num1);   
        System.out.println("El cociente es: "+cociente);
    }
    
}
