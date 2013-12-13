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
public class CalcularNumeroCifras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = teclado.nextInt();
        int cifras = 0;
        while (n1 != 0) {
            n1 = n1/10;
            cifras++;
        }
        System.out.println("El numero de cifras es " + cifras);
    }
}
