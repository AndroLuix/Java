/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.out5Ereditarieta;

/**
 *
 * @author lui12
 */
public class Persona {
    String nome;
    String cognome;
    static int numeroPersone;
    
    Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome; 
        numeroPersone++;
    }
    
    void saluta(){ //da notare che è stato scritto overriden ossia sovrascritto. (Quindi le persone si potranno dare un saluto informale all'infuori dell'aula)
        System.out.println("Ciao");
    }
    static void NumPersone(){
        System.out.println("Numero di persone parteicipi in aula: "+numeroPersone);
    }
    
    @Override
     public String toString(){
        String stringa = this.nome+"\n"+this.cognome+"\n";
        return stringa;
    }
}
