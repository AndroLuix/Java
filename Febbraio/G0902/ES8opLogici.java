package Febbraio.G0902;

public class ES8opLogici {
    public static void main(String[] args) {

        // int var_cinque = 5;
        // int var_quattro = 4;

        boolean var_risultato_relazione1;
        boolean var_risultato_relazione2;
        boolean var_risultato_relazione3;

        var_risultato_relazione1 = 5 > 4; // true
        var_risultato_relazione2 = 2 > 3; // false

        var_risultato_relazione3 = var_risultato_relazione1 || // true
                var_risultato_relazione2 || // false
                false;

        System.out.println("var_risultato_relazione3 :" +
                var_risultato_relazione3);

        System.out.println();

    }
}
