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
public class DescuentoPrecio {
    public static final double DESCUENTO = 0.08;
    public static final double PRECIO_MINIMO = 80;
    public static final double PENALTY = 2;
    public static void main (String [] args){ 
    
        double precio;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el precio");
        precio = teclado.nextInt();
        if (precio <= 80) {
            precio = precio * 0.08;
        }
        System.out.println("El precio es " + (precio - precio* 0.08));
        
    }
    
    
    
}
