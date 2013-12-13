/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema2ProgramacionEstructurada;
import java.util.Scanner;
/**
 *
 * @author Mer
 */
public class EjercicioDos {
    public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
         int nA;
         int nB;
         System.out.println("escribe un número");
         nA = teclado.nextInt();
         System.out.println("escribe otro numero");
         nB = teclado.nextInt ();
        
            
            int Modulo;
             Modulo = nB % nA;
                         
             if (Modulo == 0){
                 
                 System.out.println(nB + " y " + nA + " son divisibles");   
        }
         
         else {
        System.out.println("No son divisibles");}
        
         
    }
    
}
