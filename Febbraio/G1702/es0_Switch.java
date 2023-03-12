package Febbraio.G1702;

public class es0_Switch {
    public static void main(String[] Switch) {
        // Perchè scegliere la switch: (interruttore)
        /*
         * la switch serve per l'uguaglianza:
         * 
         * da W3S:
         * Invece di scrivere molte dichiarazioni, è possibile utilizzare
         * l'istruzione.if..elseswitch
         * L'istruzione seleziona uno dei molti blocchi di codice da eseguire:switch
         */

        // SINTASSI

        /*
         * int expression;
         * 
         * switch (expression) {
         * case x:
         * // code block
         * break;
         * case y:
         * // code block
         * break;
         * default:
         * // code block
         * }
         */

        /*
         * Ecco come funziona:
         * 
         * L'espressione viene valutata una volta.switch
         * Il valore dell'espressione viene confrontato con i valori di ogni file .case
         * Se c'è una corrispondenza, viene eseguito il blocco di codice associato.
         * Le parole chiave e sono facoltative e verranno descritte più avanti in questo
         * capitolo.breakdefault
         * Nell'esempio seguente viene utilizzato il numero del giorno della settimana
         * per calcolare il nome del giorno della settimana:
         */

        // ESEMPIO:

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        // Outputs "Thursday" (day 4)
        /*
         * La parola chiave di pausa
         * Quando Java raggiunge una parola chiave, esce dal blocco dello switch.break
         * 
         * Ciò impedirà l'esecuzione di più codice e case test all'interno il blocco.
         * 
         * Quando viene trovata una corrispondenza e il lavoro è fatto, è tempo di una
         * pausa. Non c'è bisogno di ulteriori test.
         */

        /*
         * Parola chiave predefinita
         * La parola chiave specifica alcuni codici da eseguire se non è presente
         * Corrispondenza del caso:default
         */

        // int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
        // Outputs "Looking forward to the Weekend"
    }

}
