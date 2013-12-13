/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1.Ejercicios.variable;
import java.util.Scanner;

/**
 *
 * @author Mer
 */
public class AvaluadorExpresions {
    public static void main(String [] args) {
        int a = 3;
        int b = 8;
        int c = 4;
        int d = 2;
        int resultatPrimer;
        resultatPrimer = 2 - a * b + c;
        int resultatSegon;
        resultatSegon = (2-a) * b + c;
        int resultatTercer;
        resultatTercer = a / 3 - b;
        int resultatQuart;
        resultatQuart = d * 23 - 1 + b; 
        int resultatCinque;
        resultatCinque = a / (33 - b);
        int resultatSise = d * 23 - 1 + b;
        
        
        System.out.println(resultatPrimer < resultatSegon);    
        System.out.println(resultatTercer > resultatQuart);
        System.out.println(resultatCinque == resultatSise);
        
        
    }
}
