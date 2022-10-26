/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejerciciosaprendizaje;

/**
 *
 * @author horac
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][]matriz={{2,7,6},{9,5,1},{4,3,8}};
        int[] vector={0,0,0,0,0,0,0,0};
        boolean log=true;
        int c=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i=0;i<3;i++){
            c++;
            for (int j=0;j<3;j++){
                vector[c]=vector[c]+matriz[i][j];
                vector[c+3]=vector[c+3]+matriz[j][i];
            }
        }
for (int i=0;i<3;i++){
            vector[6]=vector[6]+matriz[i][i];
            vector[7]=vector[7]+matriz[i][2-i];
        }
        int k=0;
        do {
            
            if (vector[k]!=vector[k+1]){
                log=false;
            }        
            k++;
            
        }while (k<7&&log==true);
        if (log=true){
            System.out.println("La matriz es Magica");
        }else
            System.out.println("La matriz no es Magica");

        
    }
    
}
