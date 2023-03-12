/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out7_ModificatoriDiAccessori.pacchetto1;
import lsi.out7_ModificatoriDiAccessori.pacchetto2.*;

/**
 *
 * @author lui12
 * 
 * Java 32 - Modificatori di Accesso
 * 
 * i modificatori di accesso servono per aggiungere un livello di sicurezza aggiuntuvo
 * creare 2 package con due classi
 * 
 *              class    package    subclass    word
 * public       si      si          si          si
 * producted    si      si          si          no
 * default      si      si          no          no
 * private      si      no          no          no
 * 
 * i modificatori di accesso sono le parole chiavi che vediamo
 * spesso davanti a alle classi e metodi
 * 
 * Queste chiavi servono ad aggiungere un livello di sicurezza
 * dentro ad un applicazione.
 * 
 * class: è una classe con all'interno un metodo e dentro una funzione
 * 
 * package: ossia due classi possono essere usare all'interno dello stesso pacchetto.
 * public, producted e default possono comunicare tra loro nello stesso package, tranne le classi private
 * 
 * subclass: altro non sono che le classi figlie di extends:
 * producted e public possono comunicare con classi ereditate. 
 * al contrario non è acconsentito per le classi default e private
 * 
 * word: ci permette di utilizzare metodi al difuori del package:
 * solo public, il resto no.
 * 
 * Creazione classi 
 * ClassC Extends ClassA
 * 
 */
public class ModificatoriDiAccesso {

   
    public static void main(String[] args) {
        //inseriemnto oggetto classB
        ClassB prova = new ClassB();
        
        //richiamo oggetto: non abbiamo accesso alla classe B
         //System.out.println(prova.nome);
         
         //Non lo prende: ClassA prova = new Class();

       
        
        
        
        
    }
    
}
