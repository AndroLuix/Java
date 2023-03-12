/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out3;

import java.util.Scanner;

/**
 *
 * @author lui12
 */
public class PassareOggettiComeParametri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Passare degli oggetti come parametri di metodi
        //abbiamo creato il file Pers.java per semplificare il lavoro
        //abbiamo creato degli oggetti che richiamano la classe Pers. 
        Pers persona1 = new Pers("Luigi", "Iadicola", 25, "Napoli");
        Pers persona2 = new Pers("Marco", "Rossi", 25, "Napoli");

        persona1.saluta(persona2);
        /**
         * persona1 è Luigi persona2 è Marco
         *
         * nel metodo c'è il seguente codice: 
         * void saluta(PerspersonaDaSalutare){
         * System.out.println("Ciao "+personaDaSalutare.nome
         * +" io sono "+this.nome); 
         * }
         * 
         * Pers ossia la classe contenente i nomi. 
         * nella stringa personaDaSalutare.nome si prende la variabile con il nome di Marco
         * invece con this.nome si utilizza il nome della persona.
         * Possiamo farlo anche a parti invertire, Marco che saluta Luigi
         *
         */
        persona2.saluta(persona1);
        //oppure Marco che saluta unaltro Marco
        persona2.saluta(persona2);
        
        //ricordi il metodo scanner? utilizza la stessa tecnica: ossia passa un parametro di un oggetto come metodo
        Scanner scanner = new Scanner(System.in);
      //Classe  oggetto = nuovo Costruttore(parametro);
        

    }

}
