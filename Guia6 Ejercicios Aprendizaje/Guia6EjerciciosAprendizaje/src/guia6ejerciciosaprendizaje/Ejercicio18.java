/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejerciciosaprendizaje;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 *
 *
 *
 *
 * @author horac
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][4];
        int[][] trans = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = new Random().nextInt(20);
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]" + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans.length; j++) {
                trans[i][j] = matriz[j][i];
            }
        }
        System.out.println("==============");
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans.length; j++) {
                System.out.print("[" + trans[i][j] + "]" + " ");
            }
            System.out.println("");
        }

    }

}
