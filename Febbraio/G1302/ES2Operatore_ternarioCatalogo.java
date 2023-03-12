package Febbraio.G1302;

public class ES2Operatore_ternarioCatalogo {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////
        /*
         * CREARE UN CATALOGO CON OGGETTI SCONTATI
         * MOSTRA SOLO PRODOTTI SCONTATI
         * int sconto = 10;
         * String messaggio;
         * messaggio = sconto > 0 ? "scontato" : "nessun scontro presente";
         * System.out.println(messaggio);
         * 
         */
        //////////////////////////////////////////////////////////////////////////

        double catalogo_mercedes, catalogo_audi, catalogo_volvo;
        String modello[] = {
                "|  mercedes1 EURO: ", "|  mercedes2 EURO: ", "|  mercedes3 EURO: ", // sconto 10%
                "|  audi1 EURO: ", "|  audi2 EURO: ", "|  audi3 EURO: ", // sconto 7%
                "|  volvo1 EURO: ", "|  volvo2 EURO: ", "|  volvo3 EURO: " // sconto 0%
        };
        //SCONTI APPLICATI E NON
        double sconto10 = 1.10, sconto7 = 1.07, sconto0 = 1;

        //PREZZO INTERO DEI MODELLI AUTO
        int mercedes[] = {200000, 75000,600000};
        int audi[] = {100000,55000,20000};
        int volvo[] = {90000,35000,15000};

        double app = sconto0, app2 = sconto10, app3 = sconto7;

        //VERIFICA SCONTI SE APPLICATI O NO
        String messaggio, messaggio2, messaggio3;
        messaggio = app > 1 ? "Volvo sconti applicati" : "nessun scontro presente su Volvo";
        messaggio2 = app2 > 1 ? "Mercedes sconti applicati" : "nessun scontro presente su Mercedes";
        messaggio3 = app3 > 1 ? "Audi sconti applicati" : "nessun scontro presente su Audi";
       
        // VERIFICA SCONTI SU VIDEO
        System.out.println(messaggio);
        System.out.println(messaggio2);
        System.out.println(messaggio3);

        //MODELLI E PREZZI SU VIDEO``

        catalogo_mercedes = mercedes[0] / sconto10;
        catalogo_audi = audi[0] / sconto7;
        catalogo_volvo = volvo[0] /sconto0; 
        System.out.println(modello[0] + catalogo_mercedes+  
        modello[3] + catalogo_audi +
        modello[6] + catalogo_volvo);

        catalogo_mercedes = mercedes[1] / sconto10;
        catalogo_audi = audi[1] / sconto7;
        catalogo_volvo = volvo[1] / sconto0; 
        System.out.println(modello[1] + catalogo_mercedes+  
        modello[4] + catalogo_audi +
        modello[5] + catalogo_volvo);

        catalogo_mercedes = mercedes[2] / sconto10;
        catalogo_volvo = volvo[2] /sconto0; 
        catalogo_audi = audi[2] / sconto7; 
        System.out.println(modello[2] + catalogo_mercedes+  
        modello[5] + catalogo_audi +
        modello[7] + catalogo_volvo); 

    }
}
