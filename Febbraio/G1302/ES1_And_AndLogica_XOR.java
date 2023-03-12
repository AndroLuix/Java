package Febbraio.G1302;

public class ES1_And_AndLogica_XOR {
    public static void main(String[] and) {

        /*
         * LA & LOGICA
         * Non si ferma al primo valore booleano "false".
         * 
         * A differenza della OR || che si ferma al primo true,
         * la AND && si ferma al primo valore booleano "false".
         */

        boolean vero = true;
        boolean falso = false;

        boolean varRisultato = vero && falso;
        System.out.println(varRisultato);

        varRisultato = vero & vero & falso & vero;
        System.out.println(varRisultato);

        varRisultato = vero & vero & vero & vero;
        System.out.println(varRisultato);
        System.out.println("");
        System.out.println("");

        boolean var_vero = true;
        boolean var_falso = false;
        boolean var_risultato = var_vero;

        // le seguenti istruzioni sono identiche
        // var_risultato = var_risultato && var_falso;
        var_risultato &= var_falso;
        System.out.println("var_risultato &:" + var_risultato);

        // le seguenti istruzioni sono identiche
        // var_risultato = var_risultato || var_falso;
        var_risultato |= var_falso;
        System.out.println("var_risultato |:" + var_risultato);
        System.out.println("");
        System.out.println("");

        // LA XOR (^): fa esattamente la stessa cosa della OR
        /*
         * molto utilizzato nella programmazione degli impianti industriali
         * nell'elettronica o nell'energia alternata
         */
        var_risultato = var_vero ^ var_falso; // true
        System.out.println("var_vero ^ var_faslo: " + var_risultato);

        var_risultato = var_vero ^ var_falso ^ var_falso; // true
        System.out.println("var_vero ^ var_falso ^ var_falso " + var_risultato);
        System.out.println("");
        /*
         * con la XOR
         * quando il numero (quantita) di valori è dispari vince la minoranza
         */
        var_risultato = var_vero ^ var_falso ^ var_vero; // false
        System.out.println("var_vero ^ var_falso ^ var_vero " + var_risultato);

        // in questo caso i valori hanno un numero pari la XOR funziona come la OR
        var_risultato = var_vero ^ var_falso ^ var_vero ^ var_vero; // true
        System.out.println("var_vero ^ var_falso ^ var_vero ^ var_vero " + var_risultato);

        var_risultato = var_falso ^ var_falso ^ var_falso ^ var_vero; // true
        System.out.println("var_falso ^ var_falso ^ var_falso ^ var_vero " + var_risultato);

    }

}
