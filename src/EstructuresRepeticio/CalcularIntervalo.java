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
public class CalcularIntervalo {
    public static void main (String [] args){
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("escribe un numero");
       int n1 = teclado.nextInt();
       System.out.println("escribe otro numero mayor");
       int n2 = teclado.nextInt ();
       int suma = 0;  
                  //o así int n1, n2;
       
       for ( suma = n2; n2 > n1; n1++){
           suma = suma + n1;
           //for (int cnt = n1; cnt < n2 + 1; cnt++) {suma = suma + cnt;}
           //se pone n2 + 1 para que no se te quede en el número anterior
           //esto sería igual a poner cnt <= n2
       }
       System.out.println(suma);
       
                       }
}
    
       
       
       
