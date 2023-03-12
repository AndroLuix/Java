package Febbraio.G1002;

public class ES8Or_LogicaTrue {
    public static void main(String[] args) {

        boolean var_risultato;
        int var_numero = 2;

        //////////////////////////////////// ESEMPIO CON FALSE
        System.out.println("1 - var_numero:" + var_numero);
        var_risultato = true || (var_numero++ > 2); // segna errore perché si ferma prima dell'operazione
        System.out.println("truee || (var_numero++ > 2):" + var_risultato);
        System.out.println("2 - var_numero:" + var_numero);

        var_risultato = true | (var_numero++ > 2); // true or false
        System.out.println("true | (var_numero++ > 2):" + var_risultato);
        System.out.println("3 - var_numero:" + var_numero);
    }
}
