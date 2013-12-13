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
public class EjercicioDiecisiete {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();//primer número  que se lee
        

        int i = 0;//contador
        int j = 0;
        
        while (n != 0) {
            if (n > 0) {
              i++;   
            }        
            if (n < 0) {
                
                j++;    
            }            
            n = teclado.nextInt();
        }  
        System.out.println(i); 
        System.out.println(j);
    }
}
