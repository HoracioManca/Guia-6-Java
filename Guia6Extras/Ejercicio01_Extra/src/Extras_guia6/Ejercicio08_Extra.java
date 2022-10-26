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
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 * 
 * 
 */
public class Ejercicio08_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int num,cont,par,impar;
        cont=0;
        par=0;
        impar=0;
        System.out.println("Ingres numeros");
        do {
            num=leer.nextInt();
            cont++;
            if (num%5==0) {
                break;
                
            }
            if  (num<0){
                par=par;
            }else if (num%2==0){
                
                par++;
                
            }else if (num<0){
                impar=impar;
            }else
                impar++;
            
        } while (num>0);
        
        System.out.println("cantidad de numeros ingresados: "+cont);
        System.out.println("cantidad numeros pares: "+par);
        System.out.println("cantidad de numero impares: "+impar);
                
        
        
        
    }
    
}
