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
public class VeinteDos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //int n = 0;
        //int divisio = 0;
        //System.out.print("escribe un número positivo");
        //n = teclado.nextInt();
        //for (int i = n; i != 0; i = i-2)
          //  divisio = divisio + 1;  
        //System.out.println(n + ", " + divisio);
        //i no esta definida como variable
        
        int n = 0;
        int divisio = 0;
        System.out.print("escribe un número positivo");
        
        n = teclado.nextInt();
        for (int i = n; i > 0; i = i-2)
             divisio = divisio + 1;  
        System.out.println(n + ", " + divisio);
        //i no está definida como variable
            
}
}
