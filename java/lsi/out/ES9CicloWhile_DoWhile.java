/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */
public class ES9CicloWhile_DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * cos'è un ciclo
         * a cosa serve un ciclo
         * 
         * Ciclo While
         * Ciclo Do while
         * 
         */
        
        //   il ciclo possiamo definirlo come un blocco di codice, che ci permette
        //   di eseguire un codice potenzialmente all'infinito, 
        //   fin quando la condizione non sia falsa.
        
        int i = 2;
        int contatore = 0;
        while(i >=0 && i <= 10 ){ // 0 è maggiore uguale a 10? true AND 0 è minore uguale a 10? true
            i++; //aumento della cifra ogni volta che aumenta il ciclo
            contatore++; //contatore visualizzato su scanner
            System.out.println( "Il contatore è a "+contatore);
        } 
        System.out.println();
        
        i = 0;
        contatore = 0;
        while (i < 5){
            i++; //aumento della cifra ogni volta che aumenta il ciclo
            contatore++; //contatore visualizzato su scanner
            System.out.println( "Il contatore è a "+contatore);
        }
        System.out.println();
        
        //IL CICLO DO WHILE
        
        /**
         * Il cilo while ci permette di esegurie la condizione prima della verifica
         */
         i = 0;
        contatore = 0;
        do{
           System.out.println( "Il contatore è a "+i);
           i++;
        }while(i<5);
        
       
   }
    
}
