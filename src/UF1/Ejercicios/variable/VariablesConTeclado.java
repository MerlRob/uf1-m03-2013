/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1.Ejercicios.variable;
import java.util.Scanner;

/**
 *
 * @author Mer
 */
public class VariablesConTeclado { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int operando1;
        int operando2 = 5;
          
          System.out.println("introduce el operando 1: ");          
          
          operando1 = teclado.nextInt();           
          
          System.out.println("El resultado es: " + (operando1 * operando2));              
      }
    
}
