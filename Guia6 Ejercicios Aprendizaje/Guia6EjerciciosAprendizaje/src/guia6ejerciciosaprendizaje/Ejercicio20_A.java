/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejerciciosaprendizaje;

import java.util.Scanner;

/**
 *
 * @author horac Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por
 * números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales
 * son idénticas. Crear un programa que permita introducir un cuadrado por
 * teclado y determine si este cuadrado es mágico o no. El programa deberá
 * comprobar que los números introducidos son correctos, es decir, están entre
 * el 1 y el 9.
 *
 *
 */
public class Ejercicio20_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño de la matriz");
        n = leer.nextInt();
        int sumaF, sumaC, sumaDP, sumaDS;
        sumaF=0;
        sumaC=0;
        int matriz[][] = new int[n][n]; // declaracion de la matriz
        System.out.println("Ingrese los valores de la Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = leer.nextInt();

            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println(" ");
        }

        System.out.println("===================");
        for (int i = 0; i < n; i++) {
            sumaF = 0;
            for (int j = 0; j < n; j++) {
                sumaF = sumaF + matriz[i][j];

            }
            System.out.println("suma fila " + (i + 1) + " = " + sumaF);
        }

        for (int j = 0; j < n; j++) {
            sumaC = 0;
            for (int i = 0; i < n; i++) {
                sumaC = sumaC + matriz[i][j];

            }
            System.out.println("suma columna " + (j + 1) + " = " + sumaC);

        }
        sumaDP = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumaDP = sumaDP + matriz[i][j];
                }

            }

        }
        System.out.println("suma DP = " + sumaDP);
        sumaDS = 0;
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            sumaDS = sumaDS + matriz[i][j - i];

        }
        System.out.println("suma DS = " + sumaDS);

        if (sumaF == sumaC && sumaC == sumaDP && sumaDP ==sumaDS){
                
            System.out.println("La Matriz es MAGICA");

        } else {
            System.out.println("La Matriz NO es magica");
        }
                

    }

    

}
