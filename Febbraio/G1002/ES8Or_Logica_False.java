package Febbraio.G1002;

public class ES8Or_Logica_False {
    public static void main(String[] args) {
        boolean var_risultato;
        int var_numero = 1;
        System.out.println("1 - var_numero:" + var_numero);
        var_risultato = true || (var_numero++ > 2);
        System.out.println("true || (var_numero++ > 2):" + var_risultato);
        System.out.println("2 - var_numero:" + var_numero);
        System.out.println();

        var_risultato = true | (var_numero++ > 2); // true or false
        System.out.println("true | (var_numero++ > 2):" + var_risultato);
        System.out.println("3 - var_numero:" + var_numero);
        System.out.println("1 - var_numero:" + var_numero);

        System.out.println();
        var_risultato = false || (var_numero++ > 2);
        System.out.println("false || (var_numero++ > 2):" + var_risultato);
        System.out.println("2 - var_numero:" + var_numero);
        System.out.println();
        var_risultato = false | (var_numero++ > 2); // true or false
        System.out.println("false | (var_numero++ > 2):" + var_risultato);
        System.out.println("3 - var_numero:" + var_numero);

    }

}
