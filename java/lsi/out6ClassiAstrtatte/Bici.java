/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.out6ClassiAstrtatte;

/**
 *
 * @author lui12
 */
public class Bici extends Veicolo{

    @Override
    void muovi() {
    System.out.println("La bici si accellera coi pedali");
    }

    @Override
    void frena() {
        System.out.println("La bici si ferma coi freni anteriori e posteriori");
    }

    @Override
    void partenza() {
        System.out.println("La bici viene pedalata e accellera");
    }
    
}
