/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.EserciziPratici;

/**
 *
 * @author lui12
 */
public class Automobile {
    String marca;
    String colore;
    int prezzo;
    
   public Automobile(String marca, String colore, int prezzo ){
        this.marca = marca;
        this.colore = colore;
        this.prezzo = prezzo;
       
       //System.out.println("la Marca è "+ marca);
       // System.out.println("Il colore è "+ colore);
       //System.out.println("il prezzo è "+ prezzo);
       //System.out.println();
    }
   
   public String toString(){
       return "La marca è: "+this.marca + "\n"+
               "il colore è "+this.colore+"\n"+
               "il prezzo: "+this.prezzo+"\n";
   }
}
