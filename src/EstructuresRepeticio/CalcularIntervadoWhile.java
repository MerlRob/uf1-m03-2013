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
public class CalcularIntervadoWhile {
    public static void main (String [] args){
       Scanner teclado = new Scanner(System.in);
       int n1, n2;
       int suma = 0;
       System.out.println("escribre dos núm");
       n1 = teclado.nextInt();
       n2 = teclado.nextInt();
          
    
    while (n1 <= n2){

        suma += n1;
        n1++;
        } System.out.println("la suma es " + suma);
    }
    
}
