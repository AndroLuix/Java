/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.out6ClassiAstrtatte;

/**
 *
 * @author lui12
 * 
 * la classe Macchina deve prendere l'ereditarietà
 *  da classe Veicolo
 * 
 * quindi si utilizzera' il comando extends per ereditare da Veicolo 
 * 
 * la macchina è più dettagliata: ha 4 ruote per esempio
 * 
 * 
 */
public class Macchina extends Veicolo {

    //questi due metodi vengono ereditati automaticamente.
    @Override
    void muovi() {
        System.out.println("La macchina si muove");
    }

    @Override
    void frena() {
        System.out.println("La macchina si ferma");
    }

    @Override
    void partenza() {
    System.out.println("La macchina ha acceso il motore");
    }
    
}
