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
public class PruebaWhileCuatro {
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("escribe un número");
        int n1 = teclado.nextInt();
        int i = 0;
        while (i < n1){
        i = i + 3;
        System.out.println(i);
        }
        System.out.println("multiplos de 3 " + i);
    }
    
}
