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
public class EjercicioOcho {
    public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
         int nota;
     
         
         System.out.println("Escribe tu nota");
         nota = teclado.nextInt();
         char acta;
            
         switch (nota){
             case 0:
                 nota = 0;
                 acta = 'S';
                 break;
             case 1:
                 nota = 1;
                 acta = 'S';
                 break;
             case 2:
                 nota = 2;
                 acta = 'S';
                 break;
             case 3:
                 nota = 3;
                 acta = 'S';
                 break;
             case 4:
                 nota = 4;
                 acta = 'S';
                 break;
             case 5:
                 nota = 5;
                 acta = 'A';
                 break;
             case 6:
                 nota = 6;
                 acta = 'A';
                 break;
             case 7:
                 nota = 7;
                 acta = 'N';
                 break;
             case 8:
                 nota = 8;
                 acta = 'N';
                 break;
             case 9:
                 nota = 9;
                 acta = 'E';
                 break;
             case 10: 
                 nota = 10;
                 acta = 'M';
                 break;
             default: 
                 acta = '0';
               System.out.println("la nota no es correcta"); 
                  }
    System.out.println("La nota del acta es " + acta);     
         
           
    }
    
}
