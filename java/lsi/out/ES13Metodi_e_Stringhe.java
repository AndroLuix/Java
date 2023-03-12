/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */
public class ES13Metodi_e_Stringhe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Metodi delle stringhe
         * 
         * - equals, qeualsIgnoreCase, lenght, charAt
         * - indexOf, isEmpty, toUpperCase, toLowerCase
         * - trim, replace
         */
        
        //ricorda: String non è primitivo, può avere metodi e perciò è un reference
        String nome = "Leonardo";
        boolean risultato_bol;
        
        //METODO  .equals
        //ci restituisce un boolean
        
        risultato_bol = nome.equals("Leonardo");
        System.out.println(risultato_bol); //true
        
        risultato_bol = nome.equals("leonardo");
         System.out.println(risultato_bol); //false
         //risulta false per motivo CaseSensitive: la L iniziale non è maiuscola.
         
         
         //per rendere estranei i problemi di Case, si utilizza il comando
         //equalIgnoreCase
          risultato_bol = nome.equalsIgnoreCase("leonardo");
         System.out.println(risultato_bol); //true
         //ora la L minuscola non fa la differenza.
         
         //METODO .length
         int risultato_int;
         risultato_int = nome.length();
         System.out.println(risultato_int); //ris: 8
         
         //METODO .charAt
         //capire la posizione del carattere.
         char risultato_char = nome.charAt(7);
          System.out.println(risultato_char); //esce la lettera "o"
          
          //METODO .trim
          String nome1 = "    Leonardo";
          String risultato_str;
          risultato_str = nome1.trim();
          System.out.println(risultato_str); //uscirà leonardo senza spazio
           
          //METODO .replace
          //serve per sostiuire tutte le occorrenze di un carattere con un altro carattere
          risultato_str = nome1.replace('o', 'i');
          System.out.println(risultato_str); //da leonardo a leinardi
          
         
         
         
    }
    
}
