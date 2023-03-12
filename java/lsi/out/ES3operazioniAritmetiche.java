/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */


public class ES3operazioniAritmetiche {

   
   
   
      /**
     * 
     * @param args
     * 
     * 
     */
    public static void main(String[] args) {
     /**
     *  - Operazioni 
     *  - operatori aritmetici: + - / * %
     *  - shorthand
     *  - incremento e decremento
     *  - esempi di espressioni
     */
     
     int x = 10; 
     int y = 2; 
     int z = x+y;
     System.out.println("x = "+ x +" e y = " +y);
     System.out.println("x + y = "+z);
     
     z = x/y; System.out.println("x : y = "+z);
     z = x-y; System.out.println("x - y = "+z);
     z = x%y; System.out.println("x : y (resto) = "+z); //non è percentuale ma modulo: ossia il resto della divisione.
     z= x*y; System.out.println("x * y = "+z);
     
     
     //aggiungere 3 a x
     x = x + 3;
     //oppure con la shorthand
     x += 3;
      System.out.println("x = "+x); //16
     x -=6;
     System.out.println(x);
     x*=3;System.out.println(x);
     x/=3;System.out.println(x);
     
     //incremento e decremento di una variabile
     x++; System.out.println(x);
     x--;System.out.println(x);
     
     //ordine dell'espressione
     //x = 10;
     y = 3;
     z = 9;
     int risultato = ((y + x)*y+(4-2)*z);
     System.out.println("risultato "+risultato);
     
     
    }
    
}
