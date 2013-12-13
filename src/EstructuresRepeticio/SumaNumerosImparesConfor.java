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
public class SumaNumerosImparesConfor {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int suma = 0;



        for (int i = 0; i <= 2*n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                suma = suma + i;
            } 
        }System.out.println(suma);
        

    }
}
    
