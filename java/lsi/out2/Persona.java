/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.out2;

/**
 *
 * @author lui12
 */
public class Persona {
    //classe creata per il file oggetti
   
    //inserimento dei dati
    String nome = "Luigi";
    String cognome = "Iadicola";
    int eta = 25;
    String citta = "Napoli";
    
    //differenza tra funzione e metodo:
    /**
     * il metodo è la funzione di una classe.
     * 
     * una funzione scritta all'infuori del main (sempre nello stesso file)
     * è definita semplicemente funzione.
     * 
     * una funzione scritta all'interno di un file esterno all'interno di una classe
     * viene definito metodo.
     * 
     * ora infatti stiamo creando un metodo
     */
    
    //CREAZIONE METODO SALUTA:
   
    void saluta(){
        System.out.println("ciao sono "+nome);
    }
    
    void cammina(){
        System.out.println(nome+" sta camminando");
    }
   
    
    
}
