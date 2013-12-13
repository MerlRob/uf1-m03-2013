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
public class AdivinaNumero {
    public static final int NUMERO_SECRETO_1 = 13;
    public static final int NUMERO_SECRETO_2 = 3;
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        
        int NUMERO;
        System.out.println("Escribe un número del 1 al 25");
        NUMERO = teclado.nextInt();
        
        if (NUMERO == NUMERO_SECRETO_1 || NUMERO == NUMERO_SECRETO_2){
        
        }
    }
    
}
