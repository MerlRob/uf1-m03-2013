package EstructuresRepeticio;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mer
 */
public class NumerosParesEntreDiez {
    public static void main (String [] args){
     Scanner teclado = new Scanner (System.in);
     
     for (int i = 0; i>= 11; i = i++) {
         if (i%2 == 0){
         System.out.println(i);}
         
     }
    }
}
