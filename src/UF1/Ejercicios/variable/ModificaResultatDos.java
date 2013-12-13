/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1.Ejercicios.variable;

/**
 *
 * @author Mer
 */
public class ModificaResultatDos {
    
    public static void main(String[] args){
        double m = 23;
        double n = 12;
        double resultat = 0;
        resultat = m + n;
          
          System.out.println(resultat);  
          //feu les modificacions a partir d'aqui
          resultat = resultat - 10;
          resultat = resultat * m;
          System.out.println(resultat);
          resultat = resultat * m;
          System.out.println(resultat / m);
          resultat = resultat / n;
          System.out.println(resultat + 20);  
          resultat = m + n;
          
          System.out.println((((resultat - 10) * m) / n) + 20);
        
    }
    
}
