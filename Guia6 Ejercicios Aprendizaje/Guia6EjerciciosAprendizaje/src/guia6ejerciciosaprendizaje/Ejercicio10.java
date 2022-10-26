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
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 *
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int limite;
        System.out.println("Ingrese el valor para el limite");
        limite = leer.nextInt();
        System.out.println("Ingrese numeros");
        int num;
        do {
            num = leer.nextInt();
        } while (num <= limite);
        System.out.println("El numero ingresaso es superior a: " + limite);

    }

}
