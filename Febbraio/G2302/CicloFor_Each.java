package Febbraio.G2302;

public class CicloFor_Each {
    public static void main(String[] args) {
        /*
         * Dato un array i cui valori sono:
         *  1, 2, 5, 6, 7, 8, 9, 11, 13 
         * 
         * Visualizzare a video l’indice che contiene il valore pari
         */

        int serie_num[] = { 1, 2, 5, 6, 7, 8, 9, 11, 13 };
        int contatore = 0;
        for (int serie_num_temp : serie_num) {
            contatore++;
            if (serie_num_temp % 2 == 0) {
                System.out.println("Indice con  numero pari" + serie_num_temp);
                System.out.println("contatore: " + contatore);
            }
        }

    }
}
