/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejerciciosaprendizaje;

import java.util.Scanner;

/**
 *
 * @author horac Escriba un programa que pida una frase o palabra y valide si la
 * primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se
 * deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
 * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
 * Substring y equals() de Java.
 *
 *
 *
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = leer.nextLine();
        palabra = palabra.substring(0, 1);

        if (palabra.toUpperCase().equals("A")) {
            System.out.println("CORRECTO!!, la primera letra es una " + palabra);

        } else {
            System.out.println("INCORRECTO, la primbre letra es una " + palabra);
        }

    }

}
