/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo2.CopiareOggetti;

/**
 *
 * @author lui12
 */
public class Automobili {
    String marca;
    String modello;
    String colore;
    private int kilometri;
    private int prezzo;
    int quantita;
    
    Automobili(String marca, String modello, String colore, int kilometri, int prezzo, int quantita){
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.kilometri = kilometri;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }
    
    public String vediAuto(){
       String vedi_auto = this.marca +" \n"+
                            this.modello+" \n"+
                            this.colore+" \n"+
                            //this.kilometri+" \n"+
                           // this.prezzo+" \n"+
                            this.quantita;
        return vedi_auto;
    }
    
    public int getKilometri(){
        return kilometri;
    }
    public int getPrezzo(){
        return prezzo;
    }
    
    public int setKm(int kilometri){
        this.kilometri = kilometri;
        return kilometri;
    }
    public int setPrezzo(int prezzo){
         this.prezzo = prezzo;
         return prezzo;
    }
    public void copy(Automobili auto){
        this.marca = auto.marca;
        this.modello = auto.modello;
        this.colore = auto.colore;
        this.quantita = auto.quantita;

        this.setPrezzo(auto.getPrezzo());
        this.setKm(auto.getKilometri());
    }
    
    //mettere il metodo copy in questo modo: 
    //per copiare l'oggetto in modo più veloce
    //facendo cosi:
    // Automobili auto1 = new Automobili( caratteristiche);
    
    //Automobili auto2 = new Automobili( auto1)
    Automobili(Automobili auto){
        this.copy(auto);
    }
}
