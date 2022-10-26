/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejerciciosaprendizaje;

import java.util.Scanner;

/**
 *
 * @author horac Realizar un programa que pida dos números enteros positivos por
 * teclado y muestre por pantalla el siguiente menú: MENU 1. Sumar 2. Restar 3.
 * Multiplicar 4. Dividir 5. Salir Elija opción:
 *
 *
 *
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingres 2 numeros enteros positivos");
        int num1, num2;
        String letra;

        num1 = leer.nextInt();
        num2 = leer.nextInt();
        boolean salir = false;
        while (salir == false) {
            System.out.println("MENU");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("1: Multiplicar");
            System.out.println("1: Dividir");
            System.out.println("5: Salir");
            System.out.println("Elija una Oción");

            int opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Suma = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resta = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplicación = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("División = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir del programa? S/N");
                    letra = leer.next();
                    letra.toUpperCase();
                    if (letra.equals("s")) {
                        salir = true;
                        break;
                    }
            }
        }
        System.out.println("Saliendo del Programa");
    }
}
