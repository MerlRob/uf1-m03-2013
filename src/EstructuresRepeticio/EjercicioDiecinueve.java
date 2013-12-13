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
public class EjercicioDiecinueve {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe un número mayor que 0");
        int n = teclado.nextInt();
        int div = 0;
        // do {
        for (div = 0; n % 2 == 0; div++) {
            n = n / 2;
        }
        System.out.println(div);
    }
}
