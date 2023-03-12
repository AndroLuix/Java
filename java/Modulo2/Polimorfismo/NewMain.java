/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modulo2.Polimorfismo;

/**
 *
 * @author lui12
 * 
 * Java 36 - polimorfismo 
 * significa: capacità di assumere più forme. 
 * in questo caso un oggetto è un grado di assumere più forme:
 * ossia collegarsi a più tipi di dati
 * 
 * creiamo tre classi: 
 * 1. Persona: che sarà la superclasse
 * 2. Insegnante: che eredita da Persona
 * 3. Studente: che eredita semrpe da Persona
 */
public class NewMain {
    public static void main(String[] args) {
        
        Studente std1 = new Studente("Luca","rossi");
        Studente std2 = new Studente("Marco","Grocci");
        Studente std3 = new Studente("Michela","Fiorentino");
        Studente std4 = new Studente("Emanuele","Sannino");
        
        Insegnante ins1 = new Insegnante("Margherita", "De Michelis");
        
        
        //ECCO IL POLIMORFISMO:
        Persona[] classe = {std1, std2, std3, std4, ins1};
        for(Persona persona: classe ){
            persona.saluta();
        }
    }
    
}
