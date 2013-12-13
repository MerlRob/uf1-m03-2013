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
public class EjercicioTres {
     public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
         int Primero;
         int Segundo;
         int Tercero;
         System.out.println("escribe el número Primero");
         Primero = teclado.nextInt();
         System.out.println("escribe el número Segundo");
         Segundo = teclado.nextInt();
         System.out.println("escribe el número Tercero");
         Tercero = teclado.nextInt();
         String maximo;
         
         
         
         if (Primero > Segundo && Primero > Tercero && Segundo > Tercero)  {
         maximo = Primero + " es el máximo " + Tercero + " es el mínimo";} 
         
         else if (Primero > Segundo && Primero > Tercero && Tercero > Segundo) {
         maximo = Primero + " es el máximo " + Segundo + " es el mínimo";}  
                  
         else if (Segundo > Primero && Segundo > Tercero && Primero > Tercero) {
         maximo = Segundo + " es el máximo" + Tercero + " es el mínimo";
         }
         
         else if (Segundo > Primero && Segundo > Tercero && Tercero > Primero) {
         maximo = Segundo + " es el máximo " + Primero + " es el mínimo";
         }
         
         else if (Tercero > Primero && Tercero > Segundo && Primero > Segundo) {
         maximo = Tercero + " es el máximo " + Segundo + " es el mínimo";
         }
             
         else {
             maximo = Tercero + " es el máximo " + Primero + " es el mínimo";}
         System.out.println(maximo);
         
     }
    
}
