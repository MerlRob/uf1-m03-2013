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
public class PruebaWhileTres {
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("escribe un número para sumar multiplos de 3");
        int n1 = teclado.nextInt();
        int i = 1;
        while (i <= n1){
            
            if (i%3 == 0){
            System.out.println(i);}
            i++;
                     
        }
        System.out.println(i);
    
    }
    
}
