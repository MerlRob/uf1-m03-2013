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
public class EjercicioTrece {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = 0;
        int n = 16;
        while (n % 2 == 0) {
            x = x + n;
            n = n / 2;
            System.out.println(n);
            System.out.println(x);
        }

    }
}
