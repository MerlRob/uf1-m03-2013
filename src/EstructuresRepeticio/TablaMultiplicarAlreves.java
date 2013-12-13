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
public class TablaMultiplicarAlreves {
    
    public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
         int tabla = teclado.nextInt();
                 
         for (int i = 10; i > -i; i--){
             
             System.out.println(tabla + "x" + i + "=" + (tabla * i));
             //bucle tipo contador
         
         }
    }
}
