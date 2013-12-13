/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Mer
 */
public class PruebasArray {

    //public static final int NUM_VALORS = 10;
    //public static final int marca_final = -1;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // int[] ArrayA = {10, 20, 30, 40, 50};
        // ArrayA[3] = 60;
        // int index = teclado.nextInt();
        //if (index < ArrayA.length) {
        //   System.out.println("la posició " + index + " val " + ArrayA[index]);
        // } else {
        //   System.out.println("aquest array no te tantes posicions");
        //}
        // int[] ArrayA = {10, 20, 30, 40, 50};
        //ArrayA[3] = 60;
        //int index = 0;
        //while (index < 5) {
        //  if (index < ArrayA.length) {
        //    System.out.println("la posició " + index + " val " + ArrayA[index]);
        //}
        //index++;
        //}
        //System.out.println("escriu " + NUM_VALORS + " enters. Es pot fer en diferents líneas.");
        //int nvalorsllegits = 0;
        //while (nvalorsllegits < NUM_VALORS) {
        //  if (teclado.hasNextInt()) {
        //    int valor = teclado.nextInt();
        //  System.out.println("Valor " + nvalorsllegits + "llegit: " + valor);
        //nvalorsllegits++;                
        //} else {
        //teclado.next();
        // }
        //}teclado.nextLine();
        //System.out.println("ja s'han llegit " + NUM_VALORS + " valors.");
        //System.out.println("Escriu diferents valors enters.");
        //System.out.println("Després del darrer valor escriu un " + marca_final);
        //boolean marcatrobada = false;
        //while (!marcatrobada) {
        //  if (teclado.hasNextInt()) {
        //    int valor = teclado.nextInt();
        //  if (valor == marca_final) {
        //    marcatrobada = true;
        //} else {
        //  System.out.println("Valor llegit " + valor);
        //}
        //} else {
        // teclado.next();
        // }
        //}
        //teclado.nextLine();
        //System.out.println("Ja s'han llegit tots els valors.");
        int nvalors = 0;
        while (nvalors <= 0) {
            System.out.println("Quantes notes vols introduir? ");
            if (teclado.hasNextInt()) {
                nvalors = teclado.nextInt();
            } else {//si no es enter es llegeix i s'ignora
                teclado.next();
            }
            teclado.nextLine();
            System.out.println("Es llegiran " + nvalors + " valors reals.");
            System.out.println("En pots escriure diversos en una sola línia, separats per espais.");
        }
        float[] arrayNotes = new float[nvalors];
        int index = 0;
        while (index < arrayNotes.length) {
            if(teclado.hasNextInt()){
            float nota = teclado.nextFloat();
            if((nota == 0) && (nota <= 10)){
                arrayNotes[index] = nota;
            index++;
            }
            }//si no és vàlida s'ignora i no es coloca a l'array
            else {
            teclado.next();
            }
            teclado.nextLine();
            System.out.println("La seqüencia llegida es:");
            for(int i = 0; i <arrayNotes.length; i++){
            System.out.println(arrayNotes[i]);}
        }
    }
}