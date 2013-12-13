/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Mer
 */
public class JuegoBarcosConArray {
    public static int DIMENSION = 10;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int[][] board = new int[DIMENSION][DIMENSION];//cambio el rango array por una constante
        // public static int DIMENSION y variando DIMENSION se varía todo el programa 

        int n;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                n = aleatorio.nextInt(100);
                if (n < 30) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }

            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 0; i++) {
                System.out.println(board[i][j] + " ");
            }
        }
    }
}
