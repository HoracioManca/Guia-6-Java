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
public class Ejercicio21_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int matrizM [][] = new int [10][10];
        int matrizP [][] = new int [3][3];
        int num;
        
        //Cargar matriz grande con num aleatorios
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random()*9+1);
            }    
        }
        //Mostrar matriz grande:
        System.out.println("Matriz grande cargada:");
        System.out.println("----------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" ["+matrizM[i][j]+"] ");
            }    
            System.out.println("");
        }
        //Cargar matriz chica
        System.out.println("-----------------------");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                do {                    
                    System.out.println("Ingrese núm de matriz a buscar 1-9");
                    num = leer.nextInt();
                } while (num < 1 || num >9);
                matrizP[i][j]=num;
            }    
        }
        comparar(matrizM, matrizP);
        
    }
    
    public static void comparar(int[][] matrizM, int [][] matrizP) {
        //Poner -2 porque el primer elemento a comparar es el 36
        //y de ahí necesitamos 2 lugares más entonces de la matriz grande
        //sólo podemos hasta 8, así quedan dos lugares más para comparar
        int posi=0, posj=0;
        boolean bandera=false;
        for (int i = 0; i <10-2; i++) {
            for (int j = 0; j <10-2; j++) {
               if (matrizM[i][j] == matrizP [0][0]){
                   posi=i;
                   posj=j;
                   bandera=verificar(posi, posj, matrizM, matrizP);
               }
                if (bandera) {
                    break;
                }
            }
            if (bandera) {
                break;
            }
        }
        if (bandera) {
            System.out.println("La matriz chica fue encontrada");
            System.out.printf("En posición:[%d][%d]",posi,posj);
        }else{
            System.out.println("La matriz no fue encontrada");
        }
    }
    
    public static boolean verificar(int posi, int posj, int [][]matrizM, int[][]matrizP) {
        int m=0, n=0, contador=0;
        for (int i = posi; i <posi+3; i++) {
            for (int j = posj; j <posj+3; j++) {
               if (matrizM[i][j] == matrizP [m][n]){
                  contador+=1;
               }
               n++;
            }
            m++;
            n=0;
        }
        return contador==9;
    }
    
}
