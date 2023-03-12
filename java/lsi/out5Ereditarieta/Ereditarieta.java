/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out5Ereditarieta;

/**
 *
 * @author lui12
 */
public class Ereditarieta {

    /**
     * @param args the command line arguments
     * 
     * Java 30 - Ereditarieta/Inheritance
     * 
     * cos'è l'ereditarietà
     * creiamo classi figlie studente e insegnante
     * metodi e attributi aggiuntivi
     * overriding dei metodi (@Override)
     * costuttore classi figlie e super keyword
     */
    /**
         * CAPIRE IL CONCETTO DI EREDITARIETA':
         * noi siamo figli dei nostri genitori, 
         * quindi ereditiamo il cognome di nostro padre 
         * e sopratutto andiamo a ereditare i geni dei nostri genitori
         * quindi, è molto probabile che se qualcuno dei nostri genitori
         * ha gli occhi verdi, noi ereditiamo questa caratteristica
         * andiamo ad ereditare il gruppo sanguigno, la corporatura, etc
         * 
         * la cosa più ostica è capire il concetto di ereditarietà
         * o di Inheritance nel concetto di programmazione
         * 
         */
    public static void main(String[] args) {
        
        //creiamo la classe Studente, Insengante e Persona
        /**
         * Studente Extends Persona
         * Insegnante Extends Persona
         */
        
        //invochiamo l'oggetto della classe persona
        Persona persona1 = new Persona("Luigi","Iadicola");
        persona1.saluta();//persona 1 sta salutando
        
        //invochiamo l'oggetto della classe persona
        Studente studente1 = new Studente("Marco","Rossi");//da notare che ha la classe Studente ha ereditato this.nome e this.cognome dalla classe Persona
          
       
        
        int[] studente1voti = {7,4,6};
        studente1.infoStudente("Stroia","1A", studente1voti );
        
        Insegnante insegnante1 = new Insegnante("Maria","Bonoli");
        
        String[] classiInsegnante1 = {"1A", "2B", "2C"};
        insegnante1.infoInsegnante("Matematica",classiInsegnante1);
         studente1.saluta(); //grazie all'ereditarieta' l'oggetto Studente può salutare, perché l'ha ereditato dalla classe Persona.
        insegnante1.saluta();
        
        
        Persona.NumPersone(); //conta le persone presenti anche nell'ereditarietà (infatti abbiamo invocato l'oggetto della classe Persona, per questo conta 3)
        
        
    }
    
}
