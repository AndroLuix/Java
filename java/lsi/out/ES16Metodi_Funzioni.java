package lsi.out;

public class ES16Metodi_Funzioni {
    public static void main(String[] args) {
        /*
         * I Metodi / Funzioni
         * 
         * Cosa sono i metodi
         * Creiamo un semplice metodo void
         * Parametri dei metodi
         * il return
         */

        // cosa sono i metodi:
        /**
         * immaginiamoci una lista per cucinare la pasta
         * per cucinare la pasta abbiamo bisogno:
         * pentola, acqua, sale, fuoco, fornelli, elettricità etc etc.
         * aspettare la temperatura dell'acqua, il sugo da preparare
         */

        /*
         * esempio:
         * 
         * prendi pentola
         * metti acqua
         * metti sale
         * mettere pasta
         * preparare sugo
         * ...
         * 
         */

        // Nel nostro programma la "pasta" l'andremmo ad eseguire più volte.
        /*
         * anzichè riscrivere tutte le volte la procedura per cucinare la pasta
         * noi utilizzeremo dei metodi per chiudere in una classe le procedure per
         * cucinarla
         * evitando di ripetere troppe votle lo stesso codice
         * 
         */

         faiPasta(); //preso dalla classe fai pasta
         faiPasta();
         faiPasta();
         
         //inserimento dei parametri
         cucinaPranzo("carne"); //preso dalla classe cicinaPranzo
         cucinaPranzo("pasta");//sempre preso dalla classe cucinaPranzo
         cucinaPranzo("Pizza");
         cucinaPranzo("Pollo e insalata");
         cucinaPranzo("Statt riun ca sals");
         
         addizione(10, 5);
         sottrazione(10, 5);
         moltiplicazione(4, 4);
         divisione(10, 2);
         resto(10, 2);
         
         //dare a una variabile il valore di una funzione/metodo
         //int totaleSpeso = addizione(100, 50);
         //ce lo da errore perché la funzione/metodo è void e non int
         
         //metodo esatto è:
         //vai nella classe addizioneConReturn per capire meglio la logica
         int totaleSpeso = addizioneConReturn(100, 50);
         
         //possiamo prelevare il return quando vogliamo:
         System.out.println();
         
         
         
    }

    //creazione metodo void 
    //(necessario lo static per farlo apparire in un altra classe static
    static void faiPasta(){
        System.out.println("Sto cucinando la pasta");
    }
    
    //Parametri dei metodi
    static void cucinaPranzo(String cibo) {
    System.out.println("Sto cucinando " + cibo);
    }
    static void addizione(int x, int y){
        int risultato= x+y;
        System.out.println(risultato);
    }
     static void moltiplicazione(int x, int y){
        int risultato= x*y;
        System.out.println(risultato);
    }
     static void divisione(int x, int y){
        int risultato= x/y;
        System.out.println(risultato);
    }
    
    static void resto(int x, int y){
        int risultato= x%y;
        System.out.println(risultato);
    }
    static void sottrazione(int x, int y){
        int risultato= x-y;
        System.out.println(risultato);
    }
    
    //da notare il comando "int" che sostituisce il "void"
    static int addizioneConReturn(int  x, int y){
        int risultato = x+y;
        System.out.println(risultato);
        return risultato; //da notare il return aggiunto con la variabile "risultato"
    }
}
