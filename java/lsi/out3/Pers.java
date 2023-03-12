/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.out3;

/**
 *
 * @author lui12
 */

    public class Pers {
    //creazione costruttore per rendere lo stampino dinamico

    //inseriemnto dei dati:
    //Questi sono gli scope globali:
    String nome;
    String cognome;
    int eta;
    String citta;

    //costruttore creato:
   public Pers(String nome, String cognome, int eta, String citta) {

        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.citta = citta;

        /**
         * il this serve per prendere e istanziare a ogni oggetto creato //senza
         * this non posso variare i dati.
         */
    }
   
   //metodo to string
   
   public String stampa(){
       String stringa =  this.nome+ "\n"
        +this.cognome +"\n"
        +this.eta  +"\n"
        +this.citta;
       
       return stringa;
   }
   //abbiamo creato il metodo saluta
   void saluta(Pers personaDaSalutare){
       System.out.println("Ciao "+personaDaSalutare.nome +" io sono "+this.nome);
       //this.nome = nome di se stesso 
       //In questo caso Luigi vuole salutare Marco.
       //deve uscire "ciao Marco io sono Luigi"
       //vai suò file PassareOggetti: persona1.saluta(persona2)
       
   }

    
}
