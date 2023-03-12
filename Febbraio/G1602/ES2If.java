package Febbraio.G1602;

/**
 * author margh
 */

public class ES2If
{

    /**
     * @param {args the command line arguments
     */
    public static void main(String[] args) {
        // todo...

        /*
         * nel caso in cui l'importo sia superiore a 50,00,
         * le spese di spedizione sono gratuite
         */

        double var_importo;
        double var_spese_spedizione;

        /*
         * if (condizione) {
         * istruzioni....
         * }
         */
        /*
         * var_importo = 51.0;
         * 
         * System.out.println ("Prima della if");
         * 
         * if (var_importo > 50.00) {
         * // la condizione è vera
         * var_spese_spedizione = 0.0;
         * System.out.println ("Le spese di spedizione sono gratuite");
         * }
         * 
         * System.out.println ("Dopo la if");
         */

        /*
         * if (condizione) {
         * istruzioni nel caso la condizione sia true
         * } else {
         * istruzioni della else
         * vuol dire che la condizione di if è false
         * }
         */

        /*
         * if (condizione1) {
         * istruzioni nel caso la condizione1 sia true
         * } else if (condizione2) {
         * condizione1 è false
         * istruzioni nel caso la condizione2 sia true
         * } else {
         * istruzioni della else
         * condizione1 è false
         * condizione2 è false
         * }
         */

        /*
         * if (condizione1) {
         * istruzioni nel caso la condizione1 sia true
         * } else if (condizione2) {
         * condizione1 è false
         * istruzioni nel caso la condizione2 sia true
         * } .....
         * 
         * else if (condizioneN) {
         * condizione1 è false
         * condizione2 è false
         * 
         * istruzioni nel caso la condizioneN sia true
         * }
         * 
         * else {
         * istruzioni della else
         * condizione1 è false
         * condizione2 è false
         * ......
         * condizioneN è false
         * }
         */

        /*
         * 
         * nel caso in cui l'importo uguale a 50,00,
         * le spese di spedizione a 5.0
         * 
         * nel caso in cui l'importo sia superiore a 50,00,
         * le spese di spedizione sono gratuite
         * 
         * in tutti gli altri casi quindi < 50.00
         * le spese di spedizione a 10.00
         */
        var_importo = 40.0;

        System.out.println("Prima della if");

        if (var_importo > 50.00) {
            // la condizione è vera
            var_spese_spedizione = 0.0;
            System.out.println("Le spese di spedizione sono gratuite: " + var_spese_spedizione);
        } else if (var_importo == 50.00) {
            // la condizione di if è falsa
            // la condizione di else if è vera
            var_spese_spedizione = 5.0;
            System.out.println("Le spese di spedizione sono scontate: " + var_spese_spedizione);
        } else {
            // la condizione di if è falsa
            // la o le condizioni di else if sono false
            var_spese_spedizione = 10.0;
            System.out.println("Le spese di spedizione le devi pagare: " + var_spese_spedizione);
        }

        System.out.println("Dopo la if");

        /*
         * *****************************************************************************
         * *********************
         * boolean var_boolean;
         * var_boolean = true;
         * 
         * System.out.println("Sono prima della if");
         * 
         * if (var_boolean) {
         * System.out.println("Sono all'interno della IF");
         * }
         * 
         * System.out.println("Sono dopo la if");
         * 
         * /*
         ***************************************************************************************************/

    }

}
