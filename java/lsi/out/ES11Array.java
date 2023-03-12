/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */
public class ES11Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Gli array
         * 
         * cosa sono
         * crea un array vuoto
         * Associare elementi
         * array.tostring
         * lunghezza array
         * modificare elementi
         * mostrare elementi
         * cicliare array con for e foreach
         * 
         */
        
        // gli array possiamo definirli come collezione di dati.
        /**
         * anzichè scrivere:
         * int x = 3
         * int y = 4
         * int z = 5
         * 
         * possiamo averli tutti in un unico punto perchè, magari, sono correlati.
         * si potrebbe scrivere
         * int[] voti_scolastici ={3,6,7,3,6,10};
         * abbiamo più voti in un unica variabile. 
         * consiste in allegare più dati in un unico valore anzichè diversi valori
         * 
        */
        
        //Creazione di un array vuoto
        int[] numeri = new int[3];
        //int[3] stiamo dando una lunghezza di 3
        //abbiamo creato "numeri" che è un array di int (interi) e abbiamo creato
        //un nuovo array int di 3
        
        //ora dobbiamo metterci degli elementi.
        numeri[0]= 10;
        numeri[1] = 20;
        numeri[2] = 30;
        /*
        aggiungendo altri elementi, ci darà il seguente errore:
        - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        numeri [3] = 40;
        numeri [4] = 50;
        l'errore è: ArrayIndexOutOfBoundsException
        
        abbiamo aggiunto due indici in più
        */
        
        
        //VEDIAMO LA LUNGHEZZA DI UN ARRAY
        System.out.println("Verifica lunghezza (quantità degli indici) dell'array numeri: "+numeri.length); //risultato 3
        
        //MOSTRARE A SCHERMO GLI ELEMENTI DELL'ARRAY:
        System.out.println("MOSTRARE A SCHERMO GLI ELEMENTI DELL'ARRAY:");
        System.out.println(numeri[0]+" "+ numeri[1]+ " "+numeri[2]);
        
        //CAMBIARE/MODIFICARE UN ELEMENTO DI UN ARRAY
        numeri[1] = 100;
        System.out.println("Cambio dell'indice 1:  "+ numeri[1]);
        System.out.println();
        
        //CREAZIONE DI UN ARRAY:
        int[] cifre = {10, 20, 30, 40};
         System.out.println( "indice 0 dell'array cifre: "+cifre[3]);
         //cosa sono gli indici: 
         /**
          * gli indici indicano la posizione di un elemento all'interno di un array
          * all'interno dell'array l'indice di partenza è lo 0
          * quindi in questo caso, nell'array "cifre" l'indice 0 indica l'elemento 10
          * in qualsiasi array l'indice di partenza è sempre lo 0
          * indipendentemente se si tratta di una stringa, di un int o double etc etc.
          */
         System.out.println( "lunghezza effettiva dell'array "+cifre.length);// qui è la lunghezza effettiva
         
         //raggiungere l'ultimo elemento dell'array
         System.out.println("ultimo elemento dell'array: " + cifre[cifre.length-1]);
         
         
         System.out.println("penultimo elemento dell'array: " + cifre[cifre.length-2]);
         System.out.println();
         
    // COME CICLARE GLI ELEMETNI DELL'ARRAY:
         for(int i = 0; i < cifre.length; i++){
             System.out.println(cifre[i]);
         }System.out.println();
         /**
          * ogno volta che si ripete il ciclo, i che parte da 0, 
          * incrementa di 1, fino a essere maggiore 
          * della "lunghezza" del ciclo
          * siccome il ciclo è lungo 4,
          * quando i raggiunge 5 come valore, il ciclo si ferma. 
          * ogni volta che incrementa "i", verrà stampato un indice diverso
          * questo richiamerà un elemento diverso dell'array.
          * 
          */
        
    //altro esempio di ciclo for e array.
        
        String[] cittadini = {"Michele","Paola","Ciruzzo","Carmela","Luigi","Federica"};
        for (int i = 0; i< cittadini.length; i++) {
            System.out.println("nome cittadino " + cittadini[i]);
        }
        
        
    //Tuttavia esiste anche il metodo FOR LOOP / FOREACH:
        for (String cittadini1 : cittadini) {
            System.out.println("nome cittadino (metodo for loop) " + cittadini1);
        }System.out.println();
        
    //possiamo saltare il nome di un cittadino col comando CONTINUE: 
         for (int i = 0; i< cittadini.length; i++) {
             if(i==2){
                        continue;
                    }
            System.out.println("nome cittadino, ignorando l'indice '2' " + cittadini[i]);
                    
        }System.out.println();
         
    //possiamo fermarci ad un certo indice: comando BREAK 
         for (int i = 0; i< cittadini.length; i++) {
             if(i==3){
                        break;
                    }
            System.out.println("nome cittadino, fermato all'indice '3' " + cittadini[i]);
                    
        }System.out.println();
        
       
        
                
    }
    
}
