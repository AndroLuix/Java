package Febbraio.G1002;

public class ES8_1LaOrLogica {
    public static void main(String[] args) {
        String commento = "NON esegue (var_numero++ > 2): ";
        // NON esegue (var_numero++ > 2)
        boolean var_risultato;
        int var_numero = 1;
        var_risultato = true || (var_numero++ > 2);
        System.out.println(commento + var_risultato);
        // esegue (var_numero++ > 2)
        commento = "esegue (var_numero++ > 2): ";
        var_risultato = true | (var_numero++ > 2);
        System.out.println(commento + var_risultato);
        // NON esegue (var_numero++ > 2)
        commento = " NON esegue (var_numero++ > 2): ";
        var_risultato = false && (var_numero++ > 2);
        System.out.println(commento+  var_risultato);
        // esegue (var_numero++ > 2)
        commento = "esegue (var_numero++ > 2): ";
        var_risultato = false & (var_numero++ > 2);

        System.out.println(commento+ var_risultato);

    }
}
