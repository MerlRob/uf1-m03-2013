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
public class NumerosImparesMaslasuma {
     public static void main (String [] args){
     Scanner teclado = new Scanner (System.in);
    
    int cantidad = 0;
    int suma = 0;
    
    
     for (int i = 1; i<11; i = i++) {
         if (i%3 == 0){
             cantidad++;
             suma+=i;
         }
         System.out.println("hay " + cantidad +" numeros impares");
     }
     System.out.println("la suma total vale " + suma);    
     }
}
