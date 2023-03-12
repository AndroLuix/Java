/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out2;

/**
 *
 * @author lui12
 */
public class Oggetti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Introduzione Oobject Oriented Programming
         * 
         * Cos'è la programmazione ad oggetti
         * classi, metodi e attributi
         * classe con file esterno
         * cosa sono gli oggetti e le istance di classe
         * usare attributi e metodi
         */
        
        //io sulla mia scrivania ho un po di cose: mouse, pc, desktopt
        /**
         * il pc si puo' accendere, ricaricare e fare codice
         * il mouse ha il laser e i bottoni
         * la tastiera ha dei tastie e dei comandi
         * il desktopt ha uno schermo e pulsanti
         * etc etc
         * 
         * //ora verrà creata una classe nominata "Persona"
        
        */
        
        //dopo aver creato la classe Persona dobbiamo creare un oggetto, nonchè istanza della classe
        
        Persona persona1 = new Persona(); //instance: creazione dell'oggetto
        
        System.out.println(persona1.nome); //mandare a schermo un dato
        
        //come richiamare i metodi di unaltra classe 
        persona1.saluta();
        persona1.cammina();
        
        // creazione a stampino:
        Persona persona2 = new Persona();
         persona2.saluta();
        persona2.cammina();
        System.out.println(persona1.nome); //mandare a schermo un dato
        System.out.println(persona2.nome); // un altro luigi, ma non è lo stesso luigi
        
        //CLASSI con METODI COSTRUTTORI
        
        PersonaCostruttore personaLuigi = new PersonaCostruttore("Luigi","Iadicola",25,"Napoli"); //non ho potuto richiamarlo persona1 perchè è già presente come variabile
        PersonaCostruttore personaMax = new PersonaCostruttore("Max","Esposito",26,"Napoli");
        
        //STAMPAGGIO A VIDEO DELL'OGGETTO:
        System.out.println(personaLuigi.cognome);
        System.out.println(personaMax.cognome);
        
        //UTILIZZO DELLE SCOPE LOCALIE (CHE SI TROVANO NELLA CLASSE PersonaCostruttore:
        
        personaLuigi.saluta();        //variabile creata grazie a uno scope locale all'interno del metodo saluta
        
        //unaltro esempio di scope locale: 
        personaLuigi.addizione(5, 5); //uscirà a video "il risultato è 10"
        
        personaLuigi.moltiplicazione(5, 5);
        personaLuigi.esempio2(5);
        personaLuigi.esempio(2);
        
    
    }  
}
