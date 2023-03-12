package Febbraio.G1302;

public class ES2Operatore_Ternario {
    public static void main(String[] operatoreTernario) {
        // condizione1 ? espressione 1 : espressione 2
        int sconto = 10;
        String messaggio;
        messaggio = sconto > 0 ? "scontato" : "nessun scontro presente";
        System.out.println(messaggio);

        sconto = 0;
        messaggio = sconto > 0 ? "scontato" : "nessun scontro presente";
        System.out.println(messaggio);
        System.out.println("");

        // Esercizio personale:
        String email = "mariorossi@gmail.com", password = "Passw&£oérd7)H", accesso;
        accesso = email == /* database email */"mariorossi@gmail.com"
                && password == /* database pw */"Passw&£oérd7)H"
                        ? "accesso acconsentito"
                        : "accesso negato";
        System.out.println(accesso);
        System.out.println("");

        /*
         * EX NOVO ESERCIZIO SOMMA E VOTI
         * rifarlo con operatore ternario
         * int sconto = 10;
         * String messaggio;
         * messaggio = sconto > 0 ? "scontato" : "nessun scontro presente";
         * System.out.println(messaggio);
         * 
         */

        int voto_a = 8;
        int voto_b = 7;
        int voto_c = 4;
        String scheda;

        boolean votosuperiore3;
        boolean votosuperiore2;
        boolean votosuperiore1;

        boolean promozione1;
        boolean promozione2;
        boolean promozione3;
        boolean promozioneDef;

        votosuperiore1 = voto_a > 6;
        votosuperiore2 = voto_b > 6;
        votosuperiore3 = voto_c > 6;

        promozione1 = votosuperiore3 && votosuperiore2; // 4 > 6 && 7 > 6
        promozione2 = votosuperiore2 && votosuperiore1; // 7> 6 && 8 > 6
        promozione3 = votosuperiore2 && votosuperiore1; // 7>6 && 8>6

        /*
         * promo1 = false && true
         * promo2 = true && true
         * promo3 = true && true
         */

        promozioneDef = promozione1 || promozione2 || promozione3;
        // promozionedef serve per dire che basta un solo true appinto per promuovere
        // l'alunno
        int media, somma1;
        media = (voto_a + voto_b + voto_c) / 3;
        somma1 = (voto_a + voto_b + voto_c);
        scheda = media >= 6 ? "alunno promosso" : "alunno non passato";

        boolean somma2 = (voto_a + voto_b + voto_c) > 24;
        int media3 = (voto_a + voto_b + voto_c);
        String verificaMedia = media3 > 24 ? "Media superire a 8" : "Media inferiore a 8";

        System.out.println("L'lallievo è stato promosso: " + promozioneDef + " | media: " + media);
        System.out.println("La somma è maggiorre di 24:  somma alunno: " + somma1 + " : " + somma2);
        System.out.println("");
        System.out.println(scheda);
        System.out.println(verificaMedia);

        /*
         * CREARE UN CATALOGO CON OGGETTI SCONTATI
         * int sconto = 10;
         * String messaggio;
         * messaggio = sconto > 0 ? "scontato" : "nessun scontro presente";
         * System.out.println(messaggio);
         * 
         */

    }

}
