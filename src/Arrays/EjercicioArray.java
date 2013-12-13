/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Mer
 */
public class EjercicioArray {

    public static void main(String[] args) {
        int[][] a = new int[5][10];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; i++) {
                a[i][j] = teclado.nextInt();
            }
        }
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; i++) {
               suma += a[i][j];
            }
        }System.out.println(suma);
        System.out.println(a[0]);
    }
}
