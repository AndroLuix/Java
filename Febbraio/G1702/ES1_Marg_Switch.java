package Febbraio.G1702;

/*
 * Insegna Switch (interruttore)
 * docente Margherita Demichelis
 * 17-02-2023
 */
public class ES1_Marg_Switch {
    public static void main(String[] Marg) {

        int var_importo;
        int var_spese_spedizione;

        var_importo = 44;
        switch (var_importo) {
            case 55:
                var_spese_spedizione = 16;
                System.out.println("Le spese di spedizione sono 16");
                break;
            case 54:
                var_spese_spedizione = 15;
                System.out.println("Le spese di spedizione sono 15");
                break;
            case 53:
                var_spese_spedizione = 14;
                System.out.println("Le spese di spedizione sono 14");
                break;
            case 52:
                var_spese_spedizione = 13;
                System.out.println("Le spese di spedizione sono 13");
                break;
            case 51:
                var_spese_spedizione = 12;
                System.out.println("Le spese di spedizione sono 12");
                break;
            case 50:
                var_spese_spedizione = 11;
                var_importo = 66;
                System.out.println("Le spese di spedizione sono 11");
                break;
            default:
                System.out.println("sono nella default");
                break;
        }

    }

}
