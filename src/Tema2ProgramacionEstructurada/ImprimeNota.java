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
public class ImprimeNota {
    public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
         double nota;
         System.out.println("escribe tu nota");
         nota = teclado.nextDouble();
         if (nota >= 9.0){
             System.out.println("Tu nota es Excelente");
         } else if (nota >= 7.0 && nota < 9.0){
             System.out.println("tu nota es notable");
         }
         
         
    }
    
}
