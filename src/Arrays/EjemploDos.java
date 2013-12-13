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
public class EjemploDos {

    public static void main(String[] args) {
        int[][] a = new int[5][10];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; i++) {
                a[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {//no se porqué falla
            for (int j = 0; j < 2; j++) {
                if (i == 0) {
                    System.out.println(a[i][j]);
                }
            }
        }

        int suma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; i++) {
                suma += a[i][j];
            }
            System.out.println(suma);
        }
    }
}