/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modulo2.Interfacce;

/**
 *
 * @author lui12
 * 
 * Java 35 - Interfacce:
 * 
 * con le interfacce bisogna creare la classe:
 * class interface nomeClasse
 * per dare i metodi alle subclassi bisogna usare il comando "implements"
 * 
 * con le interfacce posiamo aggiungere più "implements" come nella classe Pesce
 * 
 */
public class NewMain {
    public static void main(String[] args) {
        Leone predatore = new Leone();
        Gazzella preda = new Gazzella();
        Pesce pesce = new Pesce();
        
        predatore.caccia();
        preda.scappa();
        pesce.caccia();
        pesce.scappa();
    }
    
}
