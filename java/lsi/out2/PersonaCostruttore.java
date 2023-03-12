/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.out2;

/**
 *
 * @author lui12
 */
public class PersonaCostruttore {
    //creazione costruttore per rendere lo stampino dinamico

    //inseriemnto dei dati:
    //Questi sono gli scope globali:
    String nome;
    String cognome;
    int eta;
    String citta;

    //costruttore creato:
   public PersonaCostruttore(String nome, String cognome, int eta, String citta) {

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
    @Override
   public String toString(){
       String stringa =  this.nome+ "\n"
        +this.cognome +"\n"
        +this.eta  +"\n"
        +this.citta;
       
       return stringa;
   }

    //LO SCOPE DELLE VARIABILI
    void saluta() {
        //questo è uno scope locale: (ossia esiste solo all'interno del metodo PersonaCostruttore
        int prova = 5;
        //invece lo scope globale è dove sono i dati
        /**
         * dati: String nome; String cognome; int eta; String citta;
         */

        System.out.println("ciao sono " + this.nome); //ho accesso alla variabile nome perché è uno scope globale
    }

    void funzioneCognome() {
        System.out.println("Il mio cognome è " + this.cognome);
    }

    void addizione(int x, int y) {
        int risultato = x + y;
        System.out.println("Il risultato è " + risultato);
    }

    //uno scope locale (ossia creato all'intenro di un metodo) non può essere richiamato in un metodo locale
    //esempio che ci senga come errore
    /* void esempio(){
        System.out.println("Il risultato è "+risultato);
    }
     */
    
    
    //per fare in modo che due metodi comunichino bisogna utilizzare il comando "this."
    void moltiplicazione(int x, int y) {
        int risultato = x * y;
        System.out.println("La moltiplicazione è" + risultato);
        this.esempio(risultato);
        this.esempio2(risultato);
    }
    void esempio(int prova){
        System.out.println("Il risultato da esempio è "+prova);
        /**
         * abbiamo cambiato il nome di scope da risultato in prova
         * l'abbiamo richiamato nelle parentesi specificando la tipologia "int prova"
         * potevamo benissimo chiamarlo "risultato" anzichè "prova"
         * ma abbiamo fatto così per comprendere che si può chiamarlo come si vuole
         */
        
        
    }
    //per capirci meglio
     void esempio2(int risultato){
         System.out.println("Il risultato da esempio2 è "+risultato
         );
    }
     
    void salutare(){
        System.out.println("Ciao "+ nome);
    }
}
