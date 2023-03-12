package Febbraio.G1002;

public class ES01Incremento {
    public static void main(String[] args) {

        int var_somma = 0;
        int var_numero2 = 5;

        int var_numero = 0;
        System.out.println("var_numero:" + var_numero);

        // esegue prima l'incremento, poi la somma e infine l'assegnazione
        var_somma = var_numero2 + ++var_numero;
        System.out.println("var_somma :" + var_somma);
        System.out.println("var_numero:" + var_numero);

        System.out.println();

        var_somma = var_numero2 + var_numero++;
        // equivale a scrivere
        // var_somma = var_numero2 + +var_numero;
        // var_numero +1;

        var_somma = var_numero2 + ++var_numero;
        // Equivale a scrivere
        var_somma = var_numero2 + (var_numero + 1);

    }
}
