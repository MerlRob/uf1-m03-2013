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
public class OrdenarDosNumeros {
    public static void main (String [] args){    
        Scanner teclado = new Scanner(System.in);
        int NUMERO1;
        int NUMERO2;
            System.out.println("Introduce el primer número");
            NUMERO1 = teclado.nextInt();
            System.out.println("Introduce el segundo número");
            NUMERO2 = teclado.nextInt();
            String mensaje;
            if (NUMERO1 > NUMERO2){ 
                mensaje = NUMERO1 + ", " + NUMERO2;
            }
           
            else {
                mensaje = NUMERO2 + ", " + NUMERO1;
            }
            System.out.println(mensaje);
    }
}
