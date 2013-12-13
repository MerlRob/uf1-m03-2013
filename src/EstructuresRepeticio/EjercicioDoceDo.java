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
//escriure un programa que llegueixi un nombre n más gran que 0
//y calculi la suma 1 + 2 + ... + n
public class EjercicioDoceDo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int suma = 0;
        do {
            if (0 < n) {
                suma = suma + 1;
            }
            System.out.println(suma);
        } while (suma < n);
        System.out.println(suma + n);
    }
}
