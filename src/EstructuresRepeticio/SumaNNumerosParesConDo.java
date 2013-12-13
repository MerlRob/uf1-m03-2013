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
//1 leer (n)
//2 suma = 0
//3 for (int 1=0; i<=2*n; i++)
//3.1 si es par (i) ==> suma = suma + 1
// imprijmir suma
public class SumaNNumerosParesConDo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int suma = 0;
        int i = 0;

        do { 
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        while (i <= 2 * n); 
        System.out.println(suma);
    }
}
