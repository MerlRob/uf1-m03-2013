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
//Diseñar el algoritmo correspondiente a un programa, que:
//a- crea una tabla unidimensional de 15 elementos de tipo entero y nombre "vector"
//b- carga la tabla con valores aleatorios
//c- calcula la suma de los "N" primeros elementos de la tabla
//d- muestra el resultado obtenido, asi como el contenido de la tabla en pantalla
public class EjercicioDos {
    public static int DIMENSION = 15;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[DIMENSION];
        Random aleatorio = new Random();
        System.out.println("Escribe un número del 1 al 15");
        int n = teclado.nextInt();
        int suma = 0;
        for (int i = 0; i < DIMENSION; i++) {
            vector[i] = aleatorio.nextInt(100);
            if (i < n) {
                suma = suma + vector[i];    
            }
            System.out.println("la tabla es " + vector[i]);
        }System.out.println("la suma es " + suma);
    }
}
