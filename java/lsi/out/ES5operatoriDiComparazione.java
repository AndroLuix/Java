/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */
public class ES5operatoriDiComparazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Operatori di comparazione
         * 
         * operatori: 
         * >    Maggiore
         * >=   Maggiore Uguale
         * <    Minore (>)
         * <=   Minore Uguale (>)
         * ==   Uguale a
         * !=   Diverso da
         * 
         */
        
        int num = 10;
        int num1 = 21;
        boolean risultato = 3>10;
        boolean ris2= 10>2;
        System.out.println("boolean 3>10? "+risultato); //3 è maggiore di 10? : false
        System.out.println("boolean 10>3? "+ris2); // 10 è maggiore di 3? : true
        risultato = 11 != 10;
        System.out.println("11 != 10; "+risultato ); //11 è diverso da 10? : true
        
        risultato = 11 == 10;
        System.out.println("11 == 10; "+risultato ); //11 è uguale a 10? : false
        
         risultato = 11 >= 10;
        System.out.println("11 >= 10; "+risultato ); //11 è maggiore uguale a 10? : true
        
        risultato = 11 <= 10;
        System.out.println("11 <= 10; "+risultato ); //11 è minore uguale a 10? : false
        
        
    }
    
}
