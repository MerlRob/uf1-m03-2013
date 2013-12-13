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
public class EjercicioDoceWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int suma = 1;

        while (n > 0 && suma < n) {
            System.out.println(suma);
            suma = suma + 1;
        }
        System.out.println(suma + n);
        //int n = teclado.nextInt();
        //int suma = 0;
        //do {
        //  if (0 < n) {
        //    suma = suma + 1;
        // }
        //System.out.println(suma);
        //} while (suma < n);
        //System.out.println(suma + n);

        //for (suma = 0; suma < n; suma++) {
        //  if (0 < n) {
        //}
        //System.out.println(suma);
        //}
        //System.out.println(suma + n);
        //}
    }
}
