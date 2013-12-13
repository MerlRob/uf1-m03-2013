/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema2ProgramacionEstructurada;
import java.util.Scanner;
/**
 *
 * @author Mer
 */
public class OrdenarTresNumeros {
    public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
         int num1;
         int num2;
         int num3;
            System.out.println("Introduce 3 numeros ");
             num1 = teclado.nextInt();
             num2 = teclado.nextInt();
             num3 = teclado.nextInt();
             String ordenados;
         
            if (num1 > num2 && num2 > num3){
            ordenados = num1 + ", " + num2 + ", " + num3;
             }
             else if (num1 > num2 && num3 > num2) {
             ordenados = num1 + ", " + num3 + ", " + num2 + ", ";
             }
            else if (num2 > num1 && num1 > num3){
               ordenados = num2 + ", " + num1 + ", " + num3;
            }
             else if (num2 > num1 && num3 > num1){
            ordenados = num2 + ", " + num3 + ", " + num1;
            }
            else if (num3 >num1 && num1 > num2) {
            ordenados = num3 + ", " + num1 + ", " + num2;
             }
             else {
            ordenados = num3 + ", " + num2 + ", " + num1;
             }
             System.out.println("de mayor a menor" + ordenados );
         
    }
    
}
