/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */
public class ES7Condizioni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Le condizioni
         * 
         * If
         * else
         * 
         * if
         * else if
         * 
         * if
         * else if
         * else
         * 
         * if annidati
         * 
         * operatore ternario (trenaru operator)
         * 
        */
            
        //vogliamo che se succede una cosa, allora la condizione reagirà a tale azione
        
        
        //se un utente è online verrà stampato a video che è online
        
        boolean is_online = true;
        if(is_online){
            System.out.println("è online");
        } 
        
        /***************************/
        is_online = false;
        
        //con la NOT 
        if(!is_online){
            System.out.println("è offline");
        }
          System.out.println(); //quest System.out. lo utilizzo per lasciare uno spazio vuoto, per creare ordine nella visualizzazione         
        //essendo che la variabile è false, la condizione non la prenderà.
        //per fare in modo che is_online diventi true utiliziamo la not. 
        //in modo che la condizione venghi accettata e verrà stampato a vide "è offline".
        /***************************/
        
        //altro esempio: 
        if (10<2){
            System.out.println("Così non verrò mai visualizzato");
        }
        
        //ora utiliziamo la NOT
         if (!(10<2)){
            System.out.println("Ora invece verrò visualizzato");
        }
         System.out.println(); //quest System.out. lo utilizzo per lasciare uno spazio vuoto, per creare ordine nella visualizzazione         
         /**
          * in sintesi: se la condizione non è vera, la macchina non
          * leggerà mai cosa ci sarà all'interno della condizione. 
          */
         
         
         /*********************************/
         //Tuttavia esiste un altro metodo: if else.
         
         //stiamo dichiarando a pugno che l'utente è offline.
         is_online = false;
         
         //un modo, senza la NOT, per mostrare a video che è offline è la seguente:
         if(is_online){
             System.out.println("è online");
         }else {
             System.out.println("è offline");
         }
          System.out.println();
         
         /**coma possiamo notare il comando else non ha una condizione.
          * essa serve nel caso in cui, appunto, la condizione è falsa ma tuttavia vogliamo mettere a video 
          * che l'utente è offline
          */
         
          //In questo caso, invece, stiamo dichiarando a pugno che l'utente è online.
          is_online = true;
       
         if(is_online){
             System.out.println("è online");
         }else {
             System.out.println("è offline");
         }
                   System.out.println();

         
         /**
          * il comando if verrà considerata come una condizione vera.
          * il programma leggerà cosa c'è all'interno delle parentesi graffe di if
          * senza dover leggere cosa c'è all'interno di else
          * poichè la condizione in questo caso è vera.
          */
         
         /*************************************/
         
         //ALTRO ESEMPIO DELL'UTLIZZO DELLE CONDIZIONI SENZA TIPOLOGIE BOOLEANE DICHIARATE
         
         String abito = "Bianco";
         if(abito == "Bianco"){
                       System.out.println("l'abito è di colore bianco");
         } else {
                       System.out.println("l'abito non è bianco");

         }
         System.out.println();
         
         
         //il codice potrebbe essere scritto anche con il metodo .equals
          if("Bianco".equals(abito)){
                       System.out.println("l'abito è di colore bianco");
         } else {
                       System.out.println("l'abito non è bianco");

         }
          
         
          //LA CONDIZIONE IF ELSE IF
          /************************************************/
          abito = "blu";
          if("bainco".equals(abito)){
              System.out.println("Abito è bianco");
          }else if("blu".equals(abito)){
               System.out.println("Abito è blu");
          }else {
              System.out.println("Abito nè bianco nè blu");
          }
                       System.out.println();
          
          //LE IF ANNODATI
          int numero = 10;
          if(numero > 3){
              System.out.println("Il numero è maggiore di 3");
              if(numero > 4){
                   System.out.println("Il numero è maggiore di 4");
              } else {
                  System.out.println("Il numero NON è maggiore di 4");
              }
          }else {
              System.out.println("Il numero è maggiore di 3");
          }
                      System.out.println();
          /************************************/
          
          //altro esempio
          
           numero = 12;
          if(numero > 3){
              System.out.println("Il numero è maggiore di 3");
              if(numero % 2 == 0){
                   System.out.println("Il numero è pari");
              } else {
                  System.out.println("Il numero dispari");
              }
          }else {
              System.out.println("Il numero è maggiore di 3");
          }
               System.out.println();
          
          
         /************************************/
         
         //OPERATORI TERNARI: 
         
         String x = 3 < 10 ? "sì, è minore" : "no, non è minore";
         System.out.println(x);
         
         //sarebbe la stessa cosa di questa, ma meno sintetico.
        if(3 < 10){
            System.out.println("è minore");
        } else{
              System.out.println("è maggiore");
        }
        
         
    }

 
    
}
