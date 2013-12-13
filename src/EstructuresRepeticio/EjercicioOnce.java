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
public class EjercicioOnce {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe cuantos números pares quiere contar");
        int n = teclado.nextInt();
        int suma = 0;
        //for (int i = 0; i <= 2 * n; i++) {
        //  if (i % 2 == 0) {
        //    System.out.println(i);
        //  suma = suma + i;

        int i = 0;
        //while (i <= n) {
        //  if (i % 2 == 0){
        //System.out.println(i);}
        //suma = suma + i;
        //i++; 
        //}System.out.println(suma);
        do {
            System.out.println(i);
            i = i + 2;
            suma = suma + i;
        } 
        while (i <= n );
        System.out.println(suma);
    } //  
}
