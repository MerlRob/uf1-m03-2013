/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1.Ejercicios.variable;
import java.util.Scanner;

/**
 *
 * @author Mer
 */
public class CalculCuadrat {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int costat;
        costat = teclado.nextInt();
        System.out.println("El area del cuadrado es:");
        System.out.println(costat * costat);
          }
}
