/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */
public class OrdiniClienti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pizza pizzeria = new pizza();
        
        nomeCliente("Mario");
        ES16Pratica.farinaPizza("bianca");
        ES16Pratica.ingredienti("panna", "mais");
        
         nomeCliente("Franco");
        ES16Pratica.farinaPizza("Integrale");
        ES16Pratica.ingredienti("salame", "peperoncino", "mozzarella");
        
        
        nomeCliente("Gianni");
        nomePizza("Diavola");
        
          nomeCliente("Fra");
        nomePizza("Margherita");
    }
     static void nomeCliente(String nomeCliente){
        System.out.println("Il cliente "+ nomeCliente+ " ha ordinato:");
        
    }
     
     static void nomePizza(String nomePizza){
         System.out.print("La pizza "+ nomePizza);
         System.out.println();
     }
}
