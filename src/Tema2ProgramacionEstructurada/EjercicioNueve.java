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
public class EjercicioNueve {
    public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
         int mes;
         int año;
         System.out.println("Escribe un número del 1 al 12");
         mes = teclado.nextInt();
         System.out.println("Escribe un  año");
         año = teclado.nextInt();
            if (( mes == 1) || (mes == 3)|| (mes == 5) || (mes == 7) || (mes == 8)|| (mes == 10) || (mes == 12))
         {mes = 31;
         }
               else if (( mes == 4) || (mes == 6)|| (mes == 9) || (mes == 11))
         {mes = 30;
         } 
            
         else if (mes == 2)
             if (((año % 4) == 0) != ((año % 100) == 0) != ((año % 400) == 0))
         {
             mes = 29;
             
         }
                            
            else  {mes = 28;}
         
            System.out.println(mes);
         
    }
    
    }
 
