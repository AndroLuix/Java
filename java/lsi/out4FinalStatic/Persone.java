/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.out4FinalStatic;

/**
 *
 * @author lui12
 */
public class Persone {
    String nome;
    String cognome;
    static int numeroPersone; //vogliamo rendere static questo int

    
//da notare che "numeroPersone" è di carattere italic/obliquo per identificare ad occhio che si tratta di uno static
    
    Persone(String nome, String cognome){
        this.nome = nome;                                                       //con "this." ogni nome è caratteristico al singolo oggetto
        this.cognome = cognome;                                                 // con "this." ogno cognome è caratteristico al singolo oggetto
        numeroPersone++;                                                        //ogni volta che stampiamo una persona incrementa questo int
        System.out.println(numeroPersone);                                    // mandiamo a schermo il numero di volte che abbiamo chiamato un oggetto con questa classe.
        
//quind il concetto di static è condividere un attributo tra tutti i metodi.
    }
    public String toString(){
        String stringa = this.nome+"\n"+this.cognome+"\n";
        return stringa;
    }
    
    //Questo metodo "saluta" può essere ignorato, poichè l'abbiamo svolto nelle lezioni precedenti.
    void saluta(Persone personaDaSalutare){
        System.out.println("Ciao "+ personaDaSalutare.nome+" io sono"+this.nome);
    }
    
    
    
    
    //CREAZIONE DEL METODO STATIC
    
     static void MostraNumPersone(){
   System.out.println("Numero persone elencate "+numeroPersone);
}
    
    
}
