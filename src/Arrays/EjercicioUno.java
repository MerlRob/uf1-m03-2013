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
//para utilizar operaciones matematicas se utiiza la libreria Math ...
//algoritmo que cree una tabla unidimensional de 10 numeros y se llame números
//carga la tabla con valores positivos y negativos
//muestra en pantalla cada numero de la tabla con su cuadrado y su cubo
public class EjercicioUno {

    public static int dimension = 10;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 1};
        double cuadrado = 1;
        for (int i = 0; i < 10; i++) {
            cuadrado = numeros[i];
            cuadrado = Math.pow(cuadrado, 2);
            System.out.println("el cuadrado es " + cuadrado);
        }
        for (int j = 0; j < 10; j++) {
            double triple = 1;
            triple = numeros[j];
            triple = Math.pow(triple, 3);
            System.out.println("el triple es " + triple);
        }
    }
}
// double m = Math.pow(2, 3);           

