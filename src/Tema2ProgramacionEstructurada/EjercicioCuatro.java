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
public class EjercicioCuatro {
    public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
                  
         String letra;
         letra = teclado.next();         
         
                  if  (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){  
                    letra = letra + " es una vocal";                 
                     }
                  else {
                    letra = letra + " no es una vocal";
                    }
                  System.out.println(letra);
               
        }  
   
} 