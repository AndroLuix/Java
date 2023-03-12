/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo2.Polimorfismo;

/**
 *
 * @author lui12
 */
 class Persona {
     String nome;
     String cognome;
    Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    
    private String mostraDati(){
        return nome+" "+cognome;
    }
    void stampaDati(){
        System.out.println(mostraDati());
    }
    void saluta(){
        System.out.println("Buongiorno");
    }
}
