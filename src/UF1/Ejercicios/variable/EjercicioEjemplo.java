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
public class EjercicioEjemplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int result;
          
          System.out.println("introduce los dos operandos y el resultado");  
          num1 = teclado.nextInt();
          num2 = teclado.nextInt();
          result = teclado.nextInt ();       
          
                   
          System.out.println(num1 + num2 == result);       
          
      }
    
}
