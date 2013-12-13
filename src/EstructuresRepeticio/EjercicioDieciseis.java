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
public class EjercicioDieciseis {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe un número mayor que 0");
        int n = 0;// contador        
        int x = teclado.nextInt();//primera x que se lee
        int max = x;
        int min = x;
        int suma = 0;     

       
        while (x > 0) {
            if (x > max) {
                max = x;
            } else if (x < max) {
                min = x;                
            }
            suma = suma + x;
            x = teclado.nextInt();
            n++;
            
          
        }System.out.println(max);
        System.out.println(min);
        System.out.println(suma/n);
          //media: suma de todos los números entre n(cantidad de num. leidos)

    }
}
