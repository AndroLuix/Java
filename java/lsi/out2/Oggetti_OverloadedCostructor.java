/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out2;

/**
 *
 * @author lui12
 */
public class Oggetti_OverloadedCostructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Cosa sono gli Overloaded Costructor
         * Creare class pizza
         * creare multipli costruttori
         * 
         */
        
        //Cosa sono gli Overloaded Constructor
        /**
         *  sono metodi con lo stesso nome che peroò hanno una assigniatura diversa
         * 
        */
        
        //creiamo una classe di nome pizza
        
        //appena creata la classe Pizza, mettiamo l'oggetto che viene automaticamente stampato a video:
        
        Pizza focaccia = new Pizza("5 cereali");
        Pizza marinara = new Pizza("farina bianca","salsa");
        Pizza margherita = new Pizza("farina bianca","pomodoro","mozzarella");
        Pizza pizza_prosciutto = new Pizza("Bianca","pomodoro","mozzarella","prosciutto"); 
        Pizza pizza_extra = new Pizza ("farina bianca", "salsa zucchina", "provola","rucola","prosciutto crudo");
        
        
        //prova che ho fatto io:
       System.out.println(focaccia.salsa);//esce null, perché in pizza2 non c'è la salsa come costruttore
       System.out.println(margherita.formaggio);//esce mozzarella, perchè nell'oggetto abbiamo inserito come costruttore la stringa mozzarella
        
        
    }
    
}
