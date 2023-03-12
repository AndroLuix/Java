/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.EserciziPratici;

/**
 *
 * @author lui12
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /**
       * Creare metodo per oggetti di automobili: marca, colore, prezzo
       * Creare ArrayList di classi/oggetti di queste automobili
       * 
       * 
       */
     
      Automobile auto = new Automobile("Fiat","rossa",14_000);
       Automobile auto2 = new Automobile("Mercedes","grigio",14_000);
        Automobile auto3 = new Automobile("Audi","bianca",14_000);
         
        Automobile[] lista={auto,auto2,auto3};
        
       // System.out.println(lista[0]); (funz)
       for (int i = 0; i < lista.length ; i++ ){
           System.out.println(lista[i]);
       }
        
      
    }
    
}
