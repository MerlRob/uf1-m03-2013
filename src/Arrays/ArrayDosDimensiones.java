/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Mer
 */
public class ArrayDosDimensiones {

    public static void main(String[] args) {
        int[][] tablero = new int[8][8];
        //como se asignan valores
        tablero[0][0] = 4;
        //necesitara dos bucles para recorrer las filas y las columnas
        //para un array de una dimensión con un for ya podíamos recorrerlo
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = 0;//con esto tenemos la i y la j
            }
        }
    }
}
