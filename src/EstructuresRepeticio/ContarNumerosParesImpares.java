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
public class ContarNumerosParesImpares {    
   public static void main (String [] args){
       Scanner teclado = new Scanner(System.in);
       
       int numero = teclado.nextInt();
       int pares = 0;
       int impares = 0;  
       int sumPares = 0;
       int sumaImpares = 0;
           
       
       while (numero != -1){
           
            if (numero % 2 == 0){
                //pares
                pares++;
                sumPares = sumPares + numero;
              
             }   
            else {       
             //impar}
            impares++;
            sumaImpares = sumaImpares + numero; // sumImpares += num;
           }
            numero = teclado.nextInt();     
       
   }
       System.out.println("Pares: " + pares +"y suman:  "
       +  sumPares);
       System.out.println("Impares: " + impares + "y suman " + sumaImpares);
   }
         
}
    
