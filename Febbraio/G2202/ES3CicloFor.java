package Febbraio.G2202;

public class ES3CicloFor {
    public static void main(String[] args) {

        /*
         * Dato un array i cui valori sono:
         * 1, 3, 5, 7, 8, 9, 11, 13
         * 
         * Visualizzare a video l’indice che contiene il valore pari
         */

        int arr[] = { 1, 3, 5, 7, 8, 9, 11, 13, 20, 2, 30 };
        System.out.println("Visualizzare a video l'indice che contiene il valore pari");

        for (int indice = 0; indice <= 10; indice++) {
            // arr[indice]++;
            // System.out.println("Numero arrai: " + arr[indice] + " | Indice " + indice);
            int diviso = arr[indice] % 2;
             //System.out.println("diviso " + diviso);
            if (diviso == 0) {
                diviso++;
                // System.out.println("Combinazioni trovate: " + contatore );
                System.out.println("Indice pari:" + indice
                        + " con valore all'interno: " + arr[indice]);
                
            }/*else if(diviso != 0) {
                diviso--;
                System.out.println("Indice dispari:" + indice
                + " con valore all'interno: " + arr[indice]);
            }*/

        }
    }
}
