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
public class PruebaWhileDos {
     public static void main (String [] args){
       Scanner teclado = new Scanner(System.in);
       System.out.println("escribe que tabla quieres ");
       int tabla = teclado.nextInt();
       int cnt = 10;
       System.out.println("esta es la tabla del " + tabla);
       while (cnt >= 0){
           int resultado = tabla * cnt;
           
           System.out.println(tabla + "*" + cnt + "=" + resultado);
           cnt--;
        }
     
     
     }
     
    
}
