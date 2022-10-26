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
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas
 * 
 * 
 */
public class Ejercicio01_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantida de minutos a calcular");
        int minutos= leer.nextInt();
        double dias, horas,min;
        dias= minutos/60/24;
        horas = (minutos/60)-(dias*24);
        min=minutos -( (dias*24*60)+(horas*60));
        System.out.println(+minutos+ " minutos = a " +dias+ " dias, " +horas + " horas y "+min+ " minutos");
        
        
    }
    
}
