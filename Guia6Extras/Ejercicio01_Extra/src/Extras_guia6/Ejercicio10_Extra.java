
package Extras_guia6;

import java.util.Scanner;

/**
 *
 * @author horac
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 * 
 * 
 */
public class Ejercicio10_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
       boolean bandera= false;
       int num1, num2,resultado;
       num1 = (int) (Math.random()*10);
       num2 = (int) (Math.random()*10);
               
        System.out.println(num1);
        System.out.println(num2);
        do {
            System.out.println("Ingrese respuesta");
            resultado= leer.nextInt();
            if (resultado == (num1*num2)){
               System.out.println("Felcicidades!! su respuesta es CORRECTA");
                bandera = true;
                break;
          
            }else
                System.out.println("Respuesta INCORRECTA");
            
                bandera =false;
            
            
        } while (bandera==false);
        
        
        
    }
    
}
