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
public class CalculRectangle {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int costatGran = 7;
        int costatPetit = 2;
        
        System.out.println("El area del rectangle es = " + costatGran * costatPetit);
        System.out.println("El perimetre del rectangle es = " + ((2 * costatPetit) + (2 * costatGran)));
        
        int area = costatGran * costatPetit;
        System.out.println("El area es " + area);
        int perimetre = 2 * costatGran + 2 * costatPetit;
        System.out.println("El perimetre es = " + perimetre);
        
        int costatprimer;
        int costatsegon;
        
        System.out.println("Escribe el valor de costatprimer");
        costatprimer = teclado.nextInt();
        System.out.println("Escribe el valor de costatsegon");
        costatsegon = teclado.nextInt ();
        
        area = costatprimer * costatsegon;
        System.out.println(area);
        
        int perimetro = costatprimer * 2 + costatsegon * 2;
        System.out.println("El perímetro es = " + perimetro);
        
       
       
     
       
          } 
    
}