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
public class PruebaWhile {
    public static void main (String [] args){
       Scanner teclado = new Scanner(System.in);
       System.out.println("escribe un número del 1 al 20");
              int num = teclado.nextInt();
              int i = 0;
              while (i < num){
                  i++;
                  if (i == 7){
                  System.out.println("=");}
                  else {
                  System.out.print("-");}
              
              
              }             
       
    }
    
}
