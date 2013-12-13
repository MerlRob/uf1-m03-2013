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
public class EndevinarUnNombre {
    public static void main(String[] args ){
         Scanner teclado = new Scanner(System.in);
        int a = 23;
        System.out.println("di un número");
        int b = teclado.nextInt();
           
        if (a == b) {
        System.out.println("acertaste");        
        }
        else {
        System.out.println("fallaste");
        }  
        
    }
      
}
