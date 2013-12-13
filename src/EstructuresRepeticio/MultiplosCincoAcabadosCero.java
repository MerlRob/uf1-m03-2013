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
public class MultiplosCincoAcabadosCero {
     public static void main (String [] args){
     Scanner teclado = new Scanner (System.in);
    
    int cantidad = 0;
    
    
    
     for (int i = 100; i<= 500; i = i+5) {
         if (i%10 == 0){
             cantidad++;
             System.out.println(i);
         }
        
     } System.out.println("hay " + cantidad );
         
     }
    
}
