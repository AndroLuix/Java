package Febbraio.G1302;

public class ES3Esercizio {

    public static void main(String[] esercizio) {
        // calcolo area di una quadrato e mostra a video
        int altezza = 50, base = 50;
        int area_quadrato = altezza * base;
        System.out.println("area del quadrato è: " + area_quadrato); // ris: 2.500

        // Calcolare l’area di un rettangolo e mostrarla a videoS
        altezza = 50;
        base = 200;
        int area_rettangolo = altezza * base;
        System.out.println("area del rettangolo è: " + area_rettangolo); // ris: 10.000

        /*
         * 3. Confrontare l’area del quadrato e l’area del rettangolo e
         * indicare a video se l’area del quadrato è maggiore di
         * quella del rettangolo
         */
        boolean confronto = area_quadrato > area_rettangolo;

        System.out.println("Area del quadrato è maggiore del rettangolo? Risposta:  " + confronto);

        String messaggio;
        messaggio = area_quadrato > area_rettangolo ? "è maggiore" : "è minore";
        System.out.println(messaggio);

    }
}
