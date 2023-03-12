/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */

 /*
        Java 05 - Tipi di dati primitivi e reference
        
        - boolean | true _ false | 1bit
        - byte | -128 : 127 | 1byte // da notare che non arriva a 127 poichè lo 0 è contato come numer positivo. Quindi vi sono 128 numeri positivi, contando lo 0.
        - short | -32768 : 32767 | 2byte //stesso discorso di prima dello 0
        - int | -2miliardi : 2miliardi | 4bytes
        - long | -9quintilioni : 9quintilioni | 8byte
        
        - float | numero con 6-7 cifre decimali 5.123456f | 4 bytes
        - double | numero con 15 cifre decimali 5.123456789012345 | 8 byte
        
        - char | singolo carattere/lettera/ASCII 'f' | 2 bytes
        - String | sequenza di caratteri "ciao, dal mio file" | variabile
        
        - differenze tra primitivi e reference (iniziale e attributi disponibili)

   */
public class ES1Tipologie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       //tipologie primitive: si possono riconoscere con l'iniziale minuscola
      boolean ilBoolean = true;
      byte ilByte = 127;
      short loShort = 32767;
      int loInt = 2_000_000_000;
      long ilLong = 9_000_000_000_000_000_000L;
      
      float ilFloat = 5.123456f;
      double il_double = 5.123456789012345;
      
      char il_char = 'a'; //carattere alfabetico
      char il_char_ASCII = '$'; //carattere ASCII
      char il_char_col_numero = 2; //carattere ASCII
      
      //tipologie reference: si possono riconoscere con l'iniziale maiuscola
      
      String var_stringa = "Questo è un insieme di caratteri";
      String var_string_con_singolo_carattere = "a";
      //var_stringa.toUpperCase(); : metodo per lo stampatello
      
      System.out.println(var_stringa);
      System.out.println(var_stringa.toUpperCase());
      
      // le tipologie primitive non possono avere metodi.
      
      //il_double.(no suggestion)
      
      
      
      
      
      
      
      
       
       
    }
    
}
