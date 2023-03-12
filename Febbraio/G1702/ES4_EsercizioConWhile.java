package Febbraio.G1702;

public class ES4_EsercizioConWhile {
    public static void main(String[] EsercizioRichiesto) {
        int giorni_fluiti = 0;
        int giorni_rimasti= 28;
        while (giorni_fluiti <= 27 ){
            giorni_fluiti++;
            giorni_rimasti--;
            System.out.println("Hai a disposizione ancora" + giorni_rimasti + "giorni di ferie");
        }
        
    }
    
}
