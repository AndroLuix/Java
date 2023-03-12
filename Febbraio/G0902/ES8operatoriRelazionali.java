package Febbraio.G0902;

public class ES8operatoriRelazionali {
    // NOEM DEL FILE "es7ILRESTO" PER FAR FUNZIONARE JAVA BISOGNA NOMIANRE il file

    public static void main(String[] args) {
        // questo codice "main(String[] args)"" è importantissimo per Run Java

        /*
         * int cinque = 5;
         * int quattro = 4;
         * int var_totale = cinque + quattro;
         * 5>4
         * cinque > quattro
         * 
         * 
         * //boolean var_risultato_relazione;
         * //var_risultato_relazione = 5 > 4 (True)
         * //var_risultato_relazione= cinque > quattro; //true
         * var_risultato_relazione= cinque < quattro; //false
         * 
         * //come non scrivere
         * var_num + var_num2; //errore!!!
         * cinque < quattro; //errore!!!
         */
        int var_cinque = 5;
        int var_quattro = 4;

        int var_totale = var_cinque + var_quattro;

        boolean var_risultato_relazione;

        var_risultato_relazione = 5 > 4; // true

        var_risultato_relazione = var_cinque > var_quattro; // true
        System.out.println("var_risultato_relazione1(var_cinque > var_quattro):" + var_risultato_relazione);

        var_risultato_relazione = var_cinque < var_quattro; // false
        System.out.println("var_risultato_relazione2(var_cinque < var_quattro):" + var_risultato_relazione);

        var_risultato_relazione = var_cinque <= var_quattro; // false
        System.out.println("var_risultato_relazione3(var_cinque <= var_quattro):" + var_risultato_relazione);

        var_risultato_relazione = var_cinque == var_quattro; // false
        System.out.println("var_risultato_relazione4( var_cinque == var_quattro):" + var_risultato_relazione);

        var_risultato_relazione = var_cinque == var_cinque; // true
        System.out.println("var_risultato_relazione5 (var_cinque == var_cinque):" + var_risultato_relazione);

        var_risultato_relazione = var_cinque != var_quattro; // true
        System.out.println("var_risultato_relazione6 (var_cinque != var_quattro ):" + var_risultato_relazione);

        var_risultato_relazione = var_cinque != var_cinque; // false
        System.out.println("var_risultato_relazione7 (var_cinque != var_cinque):" + var_risultato_relazione);

        System.out.println( var_totale);

    }
}
