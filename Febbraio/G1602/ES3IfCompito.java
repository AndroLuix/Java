package Febbraio.G1602;

public class ES3IfCompito {
    public static void main(String[] Compito) {
        /*
         * IMPORTO SIA 50, spesa spedizione devono essere 11
         * IMPORTO SIA 51, spesa spedizione devono essere 12
         * IMPORTO SIA 52, spesa spedizione devono essere 13
         * IMPORTO SIA 53, spesa spedizione devono essere 14
         * IMPORTO SIA 54, spesa spedizione devono essere 15
         * IMPORTO SIA 55, spesa spedizione devono essere 16
         */

        double var_importo = 55;
        double spesa_spedizione;
        String acquisto = "Le spese di spedizioni sono ";

        if (var_importo == 50) {
            spesa_spedizione = 11;
            System.out.println(acquisto + spesa_spedizione);

        } else if (var_importo == 51) {
            spesa_spedizione = 12;
            System.out.println(acquisto + spesa_spedizione);

        } else if (var_importo == 52) {
            spesa_spedizione = 13;
            System.out.println(acquisto + spesa_spedizione);

        } else if (var_importo == 53) {
            spesa_spedizione = 14;
            System.out.println(acquisto + spesa_spedizione);

        } else if (var_importo == 54) {
            spesa_spedizione = 15;
            System.out.println(acquisto + spesa_spedizione);

        } else if (var_importo == 55) {
            spesa_spedizione = 16;
            System.out.println(acquisto + spesa_spedizione);

        }
        ;

    }
}
