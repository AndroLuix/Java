/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out3;

import lsi.out2.PersonaCostruttore;

/**
 *
 * @author lui12
 */
public class Array_diOggetti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Array di oggetti
         * 
         * creare array di tipo oggetto vuoto
         * creare oggetti
         * assegnare oggetti come eleementi array
         * accedere agli elementi
         * creare array con elementi già presenti
         */
        
        //come facevamo gli ArrayList?
       // int[] numeri = new int[3]; //array vuoto
        //oppure
        //int[] prova = {1,2,3}; //array con contenuti
        
        //creazione di un Array di oggetti (vuoto)
        PersonaCostruttore[] persone = new PersonaCostruttore[3];
        //creazione degli oggetti (che verranno inseriti nell'array)
        PersonaCostruttore persona1 = new PersonaCostruttore("Luigi","Iadicola", 25, "Napoli");
        PersonaCostruttore persona2 = new PersonaCostruttore("Marco","Rossi", 22, "Bergamo"); 
        PersonaCostruttore persona3 = new PersonaCostruttore("Rosaria", "Esposito", 22, "Napoli");
        
        //inserimento dei valori nell'array
        
        persone[0]=persona1;
        persone[1]=persona2;
        persone[2]=persona3;
        
        
        
        //visualizzazione a video dell'indice 2
        System.out.println(persone[1]);//grazie al toString inserito nella classe PersonaCostruttore possiamo ricevere l'intera lista di dati
    
        //A video tutti gli elementi dell'array
        for(int i = 0; i < persone.length ; i++){
            System.out.println(persone[i]);
        }
        System.out.println();
        
        //CREAZIONE DELL'ARRAY CON OGGETTI:
        System.out.println("ArrayList con oggetti in ciclo for");
        PersonaCostruttore[] utenti= {persona1,persona2,persona3};
         for (int i = 0; i<utenti.length; i++){
             System.out.println(utenti[i]);
         }
        
        
        
    }
    
}
