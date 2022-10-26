
package Extras_guia6;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 * 
 */
public class Ejercicio11_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner ( System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int cont=0;
       if (num!=0){
            while (num!=0){
            num=num/10;
            cont++;
                    
        }
            System.out.println("el numero ingredo tiene " +cont+ " digitos");
       }else
            System.out.println("el numero es de 1 digito");
       
       
        
    }
    
}
