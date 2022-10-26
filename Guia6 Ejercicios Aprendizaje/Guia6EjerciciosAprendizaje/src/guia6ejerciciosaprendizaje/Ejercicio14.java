/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejerciciosaprendizaje;

import java.util.Scanner;

/**
 *
 * @author horac Crea una aplicación que a través de una función nos convierta
 * una cantidad de euros introducida por teclado a otra moneda, estas pueden ser
 * a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de
 * euros y la moneda a converir que será una cadena, este no devolverá ningún
 * valor y mostrará un mensaje indicando el cambio (void). El cambio de divisas
 * es: 0.86 libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 *
 *
 *
 *
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double euro;

        System.out.println("Ingrese la cantidad de euros");
        euro = leer.nextDouble();
        boolean bandera = true;
        do {
            System.out.println("Ingrese el tipo de moneda a convertir");
            System.out.println("libra ");
            System.out.println("dolar ");
            System.out.println("Yen ");
            String moneda = leer.next();
            moneda = moneda.toUpperCase();
            if (moneda.equals("LIBRA") || moneda.equals("DOLAR") || moneda.equals("YEN")) {
                bandera = true;
           
            } else {
                 System.out.print("Incorrecto");
                bandera=false;
            }
                cambio(euro, moneda);
            //moneda=moneda.toUpperCase();utilicé IgnoreCase
            
        } while (bandera != true);

        System.out.println("");
           
    }

    public static void cambio(double euro, String moneda) {
        if (moneda.equalsIgnoreCase("Libra")) {
            System.out.println(+euro + " euros = " + euro * 0.86 + " libras");
        } else if (moneda.equalsIgnoreCase("Dolar")) {
            System.out.println(+euro + " euros = " + euro * 1.28611 + " dolares");

        } else if (moneda.equalsIgnoreCase("Yen")) {
            System.out.println(+euro + " euros = " + euro * 129.852 + " yenes");
        }

    }

}
