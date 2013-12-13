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
public class EjercicioCinco {
    public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
         double Nota;
         System.out.println("Escribe tu nota");
         Nota = teclado.nextInt();
         String Resultado;
         if ((Nota <= 0)|| (Nota < 5)){
            Resultado = " Suspés " + " la nota es S";
         System.out.println(Resultado);}
         else if ((Nota <= 5)|| (Nota < 6)){
            Resultado = " Aprobat " + " la nota es A";}
         else if ((Nota <= 6.5)|| (Nota < 8.5)){
            Resultado = " Notable " + " la nota es N";}
         else if ((Nota <= 8.5)|| (Nota < 9.5)){
            Resultado = " Excel·lent " + " la nota es E";}
         
         else if ((Nota <= 9.5)|| (Nota <= 6)){
            Resultado = " Matricula " + " la nota es M";}
    } 
   
}
