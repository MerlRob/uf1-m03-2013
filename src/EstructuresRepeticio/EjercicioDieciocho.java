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
public class EjercicioDieciocho {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//escriure un programa que llegeixi un nombre n més gran que 0
        //y escrigui la serie 2(1), 2(2) .... 2(n)
        int n = teclado.nextInt();// número  que se lee
        int i = 1;//contador
        int potencia = 1;
        for (i = 1; i <= n; i++) {
            potencia = 2 * potencia;
            System.out.println(potencia);
        }

    }
}
