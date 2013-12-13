/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import static Arrays.EjercicioDos.DIMENSION;
import java.util.Random;
import java.util.Scanner;

/**

 * @author Mer
 */
//Diseñar el algoritmo correspondiente a un programa, que:
//a- crea un vector de 20 elementos de tipo entero y nombre tabla
//b- carga el vector con valores aleatorios
//c- muestra en pantalla todos aquellos elementos mayores de 30 junto con la posición
//   que ocupan en el vector. En caso de no existir ninguno se mostrará el siguiente
//   mensaje  "NO HAY NUMEROS MAYORES DE 30"
public class EjercicioTres {
    public static int DIMENSION = 20;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] tabla = new int[DIMENSION];
        Random aleatorio = new Random();
        //System.out.println("Escribe un número del 1 al 15");
        //int n = 0;
        int i = 0;
        for ( i = 0; i < tabla.length; i++) {
             tabla[i] = aleatorio.nextInt(100);            
            if (tabla[i] < 30)
                   System.out.println(tabla[i]);  
            else {System.out.println("No hay números mayores de 30");               
            }    
        }
    }
    
}
