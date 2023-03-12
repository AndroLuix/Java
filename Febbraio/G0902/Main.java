package Febbraio.G0902;
public class Main {
    public static void main(String[] args) {

        String var_testo;
        String var_altro_testo;
        String var_n1;
        String var_n2;

        var_n1 = "PROF";
        var_n2 = "ALEX";

        // DICHIARAZIONE ALLIEVI

        String nomi_allievi[] = { "ROBERTA", "MARIO", "ALEX", "GIOVANNI", "ANTONIO" };

        // POSIZIONE [0] = ROBERTA

        // POSIZIONE [1] = MARIO

        // POSIZIONE [2] = ALEX

        var_testo = ("OGGI ANDREMO A FARE UN BEL RIPASSO DI MATEMATICA");
        var_altro_testo = ("COMINCIAMO CON " + nomi_allievi[2]);

        System.out.println(var_n1 + ": BUONGIORNO A TUTTI STUDENTI ");
        System.out.println(var_testo);
        System.out.println(var_altro_testo);

        // addizione

        int numero1, numero2, numero3;
        numero1 = 150;
        numero2 = 200;
        numero3 = 350;

        int var_somma = numero1 + numero2 + numero3;

        boolean var_prova1;
        var_prova1 = true;

        System.out.println("ECCO A TE COMINCIAMO CON UNA SOMMA");
        System.out.println("QUANTO FA SECONDO TE " + numero1 + "+" + numero2 + "+" + numero3);
        System.out.println(var_n2 + ": SECONDO ME FA " + var_somma);
        System.out.println(var_n1 + ": CALCOLATTRICE" + " = " + var_prova1);
        System.out.println("NIENTE MALE, MA NON E' ANCORA FINITA :)");

        // dichiarazione giorno settimana-------------------------------------------

        // ARRAY versione estesa

        /*
         * String giorni_week [] = new String [7];
         * 
         * giorni_week [0]= "lun";
         * giorni_week [1]= "mar";
         * giorni_week [2]= "mer";
         * giorni_week [3]= "gio";
         * giorni_week [4]= "ven";
         * giorni_week [5]= "sab";
         * giorni_week [6]= "dom";
         */

        // versione sintetica

        String giorni_week1[] = { "lun", "mar", "mer", "gio", "ven", "sab", "dom" };

        // sottrazione

        // versione leggibile:
        int Numero1, Numero2, Numero3;
        Numero1 = 700;
        Numero2 = 150;
        Numero3 = 952;

        // versione meno leggibile

        /*
         * int Numero1 = 700, Numero2= 150, Numero3=952;
         * 
         * 
         * int Numero1,
         * Numero2,
         * Numero3;
         * 
         * Numero1=700;Numero2=150;Numero3=952;
         */

        int var_sottrazione = Numero1 - Numero2 - Numero3;

        int var_moltiplicazione = Numero1 * Numero2;

        System.out.println("ECCO A TE UNA SOTTRAZIONE");
        System.out.println("QUANTO FA SECONDO TE " + Numero1 + "-" + Numero2 + "-" + Numero3);
        System.out.println("ALEX:" + "SECONDO ME FA " + var_sottrazione);
        System.out.println(var_n1 + ": CALCOLATRICE " + var_prova1);
        System.out.println("SEMBRA CHE TU ABBIA STUDIATO, BRAVISSIMO :)");
        System.out.println("CON GLI STESSI NUMERI FAI UNA MOLTIPLICAZIONE :)");
        System.out.println("ECCO QUA :" + var_moltiplicazione);

        System.out.println("DIREI CHE SEI PROPRIO BRAVO, ANCHE SENZA CALCOLATRICE");

        System.out.println("PERFETTO METTO IL VOTO, DIREI UN 8");

        System.out.println("OGGI SIAMO " + giorni_week1[3] + " 09 FEBBRAIO 2023");

        System.out.println("ECCO QUI INSERITO NEL REGIOSTRO ELETTRONICO");

    }
}
