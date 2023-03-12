/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out3;

import lsi.out2.PersonaCostruttore;

/**
 *
 * @author lui12
 */
public class MetodoToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Il metodo toString

        //creiamo l'oggetto persona
        PersonaCostruttore persona = new PersonaCostruttore("Luca", "Rossi", 25, "napoli");

        System.out.println(persona);//prima usciva l'id (collocazione nella memoria RAM)

        //con il metodo toString escono i dati:
        //andiamo nel file PeronaCostruttore
        //mettiamo all'interno del codice:
        /**
         * public String toString(){ String stringa = this.nome+ "\n"
         * +this.cognome +"\n" +this.eta +"\n" +this.citta;
         *
         * return stringa; }
         */
        
        System.out.println(persona); //ora esce come vogliamo noi.
    }

}
