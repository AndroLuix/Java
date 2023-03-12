/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo2.Polimorfismo;

/**
 *
 * @author lui12
 */
 class Studente extends Persona {
    
     Studente(String nome, String cognome) {
        super(nome, cognome);
    }
     
     @Override
    void saluta(){
        System.out.println("Buongiorn prof");
    }
}
