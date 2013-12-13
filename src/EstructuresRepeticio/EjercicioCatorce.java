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
public class EjercicioCatorce {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int a = 0;
        for (int i = 1; i <= 20; i = i + 2) {
            a = 0;
            do {
                System.out.println("a es " + a + "e y es " + i);
                a = a + 1;
            } while (a < 10);
        }
//diez veces
    }
}
