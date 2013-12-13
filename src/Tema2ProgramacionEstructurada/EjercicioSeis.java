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
public class EjercicioSeis {
    public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
         
         int dia;
         System.out.println("Escribe un número del 1 al 7");
         dia = teclado.nextInt();
         switch (dia) {
             case 1:
                 dia = 1;
                 System.out.println("el dia es lunes");
                 break;
                 case 2:
                 dia = 2;
                 System.out.println("el dia es martes");
                     break;
                 case 3:
                 dia = 3;
                 System.out.println("el dia es miercoles");
                     break;
                 case 4:
                    dia = 4;
                    System.out.println("el dia es jueves");
                     break;
                 case 5:
                    dia = 5;
                    System.out.println("el dia es viernes");
                     break;
                 case 6:
                     dia = 6;
                     System.out.println ("el dia es sabado");
                     break;
                 case 7:
                     dia = 7;
                     System.out.println("el dia es domingo");
                     break;
                 default:
                     System.out.println("no hay más días de la semana");
                     
         
         }
         
         
         
         
    }
    
}
