
package Extras_guia6;

import java.util.Scanner;

/**
 *Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 * 
 */
public class Ejercicio07_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que dese igresar");
        int cant= leer.nextInt();
        int cont=0;
        int num,suma,max,min;
        max=0;
        min=0;
        suma=0;
       
            
      while (cont<cant){
          System.out.println("Ingrese un numero");
          num=leer.nextInt();
          cont++;
          suma=suma+num;
         
          
          if (num>=max) {
              max=num;
              
          }else
              max=max;
          if (num<=min || min ==0) {
              min=num;
              
          }else
              min=min;
      }
      
        System.out.println("Maximo = " +max);
        System.out.println("Minimo = "+min);
        System.out.println("Promedio = "+suma/cont);
        
    }
        
                
                
    }
    
