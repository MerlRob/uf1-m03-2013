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
public class ResultadoSuma {
     public static void main(String[] args){    
    Scanner teclado = new Scanner(System.in);
    int factor1;
    int factor2; 
    int Resultado = 3*7;
    
        System.out.println("introduce factor1");        
        
        System.out.println("introduce factor2");        
        
        System.out.println("introduce resultado");        
         factor1 = teclado.nextInt();   
         factor2 = teclado.nextInt();  
        Resultado = teclado.nextInt();
        System.out.println(factor1 * factor2 == Resultado);
     }
     
}
     
