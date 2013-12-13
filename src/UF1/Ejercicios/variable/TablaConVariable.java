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
public class TablaConVariable {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int tabla = 5;
        
        System.out.println("la tabla del");
        tabla = teclado.nextInt();
        
        System.out.println(tabla + " x 0 = " + (tabla*0));
        System.out.println(tabla + " x 1 = " + (tabla*1));
                               
      }
    
}
