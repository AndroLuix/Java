package Febbraio.G0902;
public class somma {
    public static void main(String[] args) {

        int num1 = 5, num2 = 2, num3 = 3;
        int var_totale;
        var_totale = num1 + num2 + num3; // = 10

        // var_totale = var_totale -1;
        // var_totale = 6;

        var_totale = var_totale + 2;
        // soluzione alternativa
        var_totale += 2; // assegnazione addizionale

        var_totale = var_totale * 2;
        // soluzione alternativa
        var_totale *= 2;

        var_totale = var_totale / 2;
        // soluzione alternativa
        var_totale /= 2;

        System.out.println("il totale: " + var_totale); // somma di tutto il calcolo

    }
}