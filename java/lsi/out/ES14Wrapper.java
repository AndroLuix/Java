/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */
public class ES14Wrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Wrapper Class
         * 
         * le wrapper class ci permettono di utilizzare
         * i dati primitivi come reference 
         *  primitivi -> reference
         * boolean -> Boolean
         * char -> Character
         * int -> Integer
         * double -> Double
         * 
         * la differenza è che le reference, come string, ci permettono di applicare
         * i metodi.
         */
        
        
        //LE DIFFERENZE
        Boolean vero = true;
        boolean vero1 = true; 
        
        Character carattere = 'a';
        char carattere1 = 'a';
        
        Integer num = 1;
        int num1 = 1;
        
        double num_virgola = 0.1;
        Double num_virgola1 = 0.1;
        
        
        //come vengono trattati
        boolean a = true;
        char b = 'a';
        int c = 5;
        double d = 5.3;
        if(vero == a){
            System.out.println("prova");
        }
        
        
    }
    
}
