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
public class EjemplosArrays {
    // public class MinMaxMediaArray {
    //public static int TAMANY = 10;

    //public static void main(String[] args) {
    //  Scanner teclado = new Scanner(System.in);
    //int[] datos = new int[TAMANY];
    //int data = teclado.nextInt();
    //int i = 0;
    //while (data != -1) {
    //  datos[i] = data;
    //i++;
    // data = teclado.nextInt();
    //}
    //int suma = datos[0];
    //int min = datos[0];
    //int max = datos[0];
    //for (int j = 1; j < i; j++) {
    //  suma += datos[j];
    //if (datos[j] < min) {
    //  min = datos[j];
    // } else if (datos[j] > max) {
    //   max = datos[j];
    //}
    //}
    //int media = suma / i;
    //System.out.println("El mínimo es " + min);
    //System.out.println("El máximo es " + max);
    //System.out.println("La media es " + media);
    //}
    //public class Array2Dimensiones
//{
    //public static void main(String[] args) {
    //  int[][] tablero = new int[2][2];
    //Scanner teclado = new Scanner(System.in);
    //for (int i = 0; i < 2; i++) {
    //  for (int j = 0; j < 2; j++) {
    //    tablero[i][j] = teclado.nextInt();
    //}
    //}
    //for (int i = 0; i < 2; i++) {
    //  for (int j = 0; j < 2; j++) {
    //    if (i == 0) {
    //      System.out.print(tablero[i][j] + " ");
    //}
    //}
    //}
    //int suma = 0;
    //for (int i = 0; i < 2; i++) {
    //  for (int j = 0; j < 2; j++) {
    //    suma = suma + tablero[i][j];
    //}
    //}
    //public class Barquitos {
    public static int DIMENSION = 10;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int[][] board = new int[DIMENSION][DIMENSION];
        int n;
        int aciertos = 0;
        int fila, columna;
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                n = aleatorio.nextInt(100);
                if (n < 30) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < DIMENSION; i++) {
            System.out.println("Introduce la fila ...");
            fila = teclado.nextInt();
            System.out.println("Introduce la columna ...");
            columna = teclado.nextInt();
            if (board[fila][columna] == 1) {
                aciertos++;
            }
        }
        System.out.println("\nHas tenido " + aciertos + " aciertos:\n");
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
