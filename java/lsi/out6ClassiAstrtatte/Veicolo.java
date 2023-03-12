/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.out6ClassiAstrtatte;

/**
 *
 * @author lui12
 * 
 * abbiamo creato questa classe,
 * per renderla astratta ci utilizzare il comando abstract
 * 
 * dopo aver fatto cio' creiamo la classe macchina
 */
public abstract class Veicolo {
    //ora veicolo è una classe astratta
    //(il veicolo in se è una cosa astratta, puo' essere una bici, un auto etc
    
    //creiamo un metodo all'interno della classe astratta 
    abstract void muovi(); //le classi astratte non vogliono le parentesi graffe
    abstract void frena();
    abstract void partenza();
    //andremo a specificare i metodi nella classe Macchina
    
    
}
