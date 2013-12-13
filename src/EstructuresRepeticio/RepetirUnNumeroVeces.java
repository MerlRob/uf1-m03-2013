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
public class RepetirUnNumeroVeces {
     public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
         int numVeces = teclado.nextInt();
         int cuenta = 0;
         System.out.println("----------------------");
         while (cuenta < numVeces) {
         
         
         if (cuenta == 6) {
             System.out.println("===================");
         }
             else
         {System.out.println("----------------------");}
             System.out.println((cuenta + 1) + " esto lo repito");
         cuenta++;
         
         
         }
         }
                         
     }
    
