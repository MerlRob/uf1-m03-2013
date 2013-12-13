/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1.Ejercicios.variable;

/**
 *
 * @author Mer
 */
public class ModificaResultat {
    public static void main(String[] args){
        int m = 2;
        int n = 3;
        int resultat = 0;
        resultat = m + n;
          
          System.out.println(resultat);  
          //feu les modificacions a partir d'aqui
          resultat = resultat - 10;
          resultat = resultat * m;
          System.out.println(resultat);
          resultat = m + n;
          System.out.println((((resultat - 10) * m) / m) + 20);
        
    }
    
}
