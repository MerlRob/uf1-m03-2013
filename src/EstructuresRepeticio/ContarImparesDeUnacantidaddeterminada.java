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
public class ContarImparesDeUnacantidaddeterminada {
    public static void main (String [] args){
     Scanner teclado = new Scanner (System.in);
     int cantidad = 0;
     for (int i = 1; i<11; i = i++) {
         if (i%3 == 0){
             cantidad++;
         }
         System.out.println(cantidad);}
         
     }
    
}
