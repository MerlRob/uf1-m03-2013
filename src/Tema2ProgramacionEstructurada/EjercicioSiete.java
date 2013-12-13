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
public class EjercicioSiete {
     public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
         
         int dia;
         System.out.println("Escribe un número del 1 al 7");
         
         dia = teclado.nextInt();
         
        
         if (dia == 1) 
             
                 System.out.println("el dia es lunes");
                 
         else if (dia == 2) {
                
                 System.out.println("el dia es martes");}
                   
         else if (dia == 3)
         {
             System.out.println("el dia es miercoles");               
         }
         else if (dia == 4){
             System.out.println("el dia es jueves");
         }
         else if (dia == 5){
                 System.out.println("el dia es viernes");}
                   
         else if (dia == 6){
                    System.out.println("el dia es sabado");}
         else if (dia == 7){             
                    System.out.println("el dia es domingo");
          }
         else {
         System.out.println("No hay ese dia de la semana");}
    
    }
}
