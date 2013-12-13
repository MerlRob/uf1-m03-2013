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
public class EjercicioQuince {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int x = 12;
        int j = 5;
        int k = 0;
        if (0 == x % 4) {
            for (j = 0; j < 10; j = j + 4) {
                k = k + j;
            }
            System.out.println(j);
        System.out.println(k);
        System.out.println(x);
        } else {
            for (j = 0; j < 10; j = j + 2) {
                k = k + j;
            }System.out.println(j);
        System.out.println(k);
        System.out.println(x);
        }

    }
}
