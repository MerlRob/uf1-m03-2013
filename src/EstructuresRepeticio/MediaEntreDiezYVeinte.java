/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuresRepeticio;

import java.util.Scanner;

/**
 *
 * @author Mer
 */
public class MediaEntreDiezYVeinte {
     public static void main (String [] args){
     Scanner teclado = new Scanner (System.in);
    
    int cantidad = 0;
    int suma = 0;
    
    
    
     for (int i = 10; i<= 20; i++) {
         {
             cantidad++;
             suma = suma + i;
             
         }
        
     } System.out.println(suma/cantidad);
     }
    
}
