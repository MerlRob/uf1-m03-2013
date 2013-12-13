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
public class EjercicioDoceFor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int suma = 0;
        for (suma = 0; suma < n; suma++) {
            if (0 < n) {
            }
            System.out.println(suma);
        }
        System.out.println(suma + n);
    }
}
