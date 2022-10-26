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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cadena;
        int correcto = 0;
        int incorrecto = 0;
        boolean FDE = false;
         System.out.println("ingrese una cadena 5 caracteres, que mpiece con X y termine con O");
            cadena = leer.nextLine();
        
        while (!cadena.equals("&&&&&")){
           cadena = cadena.toUpperCase();
            if (cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O") && cadena.length() == 5) {
                correcto = correcto + 1;
                // FDE= false;
                //break;
            } else  {
                incorrecto = incorrecto + 1;
                //FDE = false;
                //break;
            
            }
            System.out.println("ingrese otra cadena");
            cadena = leer.nextLine(); 
        } 
        System.out.println("Correctos: " + correcto);
        System.out.println("Incorrectos: " + incorrecto);
    }

}
