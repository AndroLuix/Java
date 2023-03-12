/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */
public class ES10CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Ciclo For
         * 
         * for annidati
         * versione enhanced/foreach
         * beack e continue
         */
         System.out.println("IL CICLO FOR: ");
            System.out.println("Sono prima ciclo for ");
        for (int i = 0; i < 5 ; i++)
        {
            System.out.println("Sono del ciclo for "+i);
        }
          System.out.println("Sono dopo ciclo for ");
           System.out.println();
          
          //il for si utilizza molto negli array. 
          
          
          //I FOR ANNIDATI
           System.out.println("I FOR ANNIDATI: ");
          
           for (int i = 0; i < 5 ; i++)
        {
            System.out.println("riga "+i);
            for(int j = 0; j < 5 ; j++){
                System.out.println("colonna "+j);
            }
        }
           System.out.println();
           
        //CREAZIONE DI UN ARRAY PER IL CICLO FOR
        /**
         * prima di iniziare, dobbiamo capire cos'è un Array. 
         * un array è un contenitore ove all'interno vi sono dei valori
         * questi valori possono essere di varie tipologie: Stringhe, numeri interi e non
         * all'interno dell'array vi sono dei valori che hanno un indice
         * 
         * es: 
         * String[] array = {"luigi","michele","luca"}
         * luigi ha l'indice 0
         * michele ha l'indice 1
         * luca ha l'indice 2
         * 
         * un array quindi contiene al suo interno dei valori indicizzati.
         *
         */
        
        System.out.println(" array con ciclo per estrarre le cifre all'interno dell'array numeri");
        int [] numeri = {10,20,30,40,50};  
                for(int cifra: numeri){
                    System.out.println("riga " +cifra );
                } System.out.println();
        //per ogni numero che ho qua dentro, mi stampi la cifra.
        
        /**
         * ogni qualvotla che numeri ha un elemento dentro l'array, il ciclo riparte
         * ogni volta che parte il ciclo, esce la cifra.
         * la cifra non è altro che l'indice di un array.
         * 
         */
        
        //esempio di array col ciclo for con le Stringhe: 
        System.out.println(" array con ciclo per elencare i nomi di persone");
         String [] persone = {"Francesco","Luigi","Gianni"};
                for(String nomi: persone){
                    System.out.println("nome " +nomi );
                } System.out.println();
         /**
          * l'array persone contiene all'interno dei nomi
          * la funzione del ciclo for è questa:
          * ogni volta che viene eseguito il ciclo viene inserito l'indice successivo.
          */
         
                System.out.println("array con ciclo per elencare le marche delle automobili");
          String [] automobili = {"Mercedes","Audi","Volvo","Zima","Fiat","Bugatti","Ferrari"};
                for(String marca: automobili){
                    System.out.println("Marca " +marca );
                } System.out.println();
                
                
            // interrompere un ciclo: COMANDO BREAK
            System.out.println("Ciclo con all'interno break sul 3");
            for (int i = 0; i<5; i++){
                if(i==3){
                    break;
                   
                }
                 System.out.println("il ciclo è stato ripetuto: " +i);
            }System.out.println();
            
            //saltare una fase del ciclo: COMANDO CONTINUE
            System.out.println("Ciclo con all'interno continue sul 3");
            for (int i = 0; i<5; i++){
                if(i==3){
                    continue;
                }
                 System.out.println("il ciclo è stato ripetuto: " +i);
            }System.out.println();
            
            String [] citta = {"Milan","Napole","Genova","Rome"};
                for(String nomicitta: citta){
                    System.out.println("nome " +nomicitta );
                } System.out.println();
          
    }
    
}
