/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out6ClassiAstrtatte;

/**
 *
 * @author lui12
 * 
 * Java 31 - Classi Astratte
 * 
 * cosa sono?
 * Creare classe astratta veicolo
 * creae classi fragile macchina
 * metodi astratti
 * 
 * 
 * Possiamo definite le classi astratte come classi abbastanza ristrette
 * che non possono essere create per produrre oggetti
 * servono solo per essere ereditate da altre classi.
 * 
 * non possiamo creare l'oggetto veicolo
 * es: Veicolo veicolo = new Veicolo(); sarà un comando non riconosciuto dalla JVM e JDK
 * ma si potra' chiamare l'oggetto Macchina
 * 
 * 1. creiamo classe veicolo
 * inseriamoci dei metodi vuoti
 * 2 creiamo le classi: Macchina, Moto, Bici.
 * Inseriamo all'interno dei metodi ereditati da Veicolo le caratteristiche di ogni metodo overried (sovrascritto)
 */
public class ClassiAstratte {
    

    public static void main(String[] args) {
        
        Macchina macchina = new Macchina();
        Moto moto = new Moto();
        Bici bici = new Bici();
        System.out.println("Azioni di una macchina:");
        macchina.partenza();
        macchina.muovi();
        macchina.frena();
        System.out.println();
        System.out.println("Azioni di una moto:");
        moto.partenza();
        moto.muovi();
        moto.frena();
        System.out.println();
        System.out.println("Azioni di una bici:");
        bici.partenza();
        bici.muovi();
        bici.frena();
        
        
        
    }
    
}
