/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.out9_Incapsulamento;

/**
 *
 * @author lui12
 */
public class Persona {
     String nome;
    private String cognome;
    private int eta;
    
    Persona(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }
    
    //creiamo il metodo getCognome per mandare a schermo cognome
    
    public String getCognome(){
        return cognome;
    }
    
    //creiamo il metodo setEta per modificare l'eta'
    public void setEta(int eta){
        this.eta = eta;
    }
    
    //creiamo il metodo setCognome per modificarlo
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    
    //creiamo il metodo getEta per stamparlo a video
    public int getEta(){
        return eta;
    }
}
