package Febbraio.G0902;


public class ES6operatoriDiIncremento {
    public static void main(String[] args) {

        int var_num = 20;
        var_num = var_num + 100;
        var_num += 100;

        // le seguenti istruzioni sono identiche
        // entrambe aggiungono 1 alla variabile var_num

        var_num = var_num + 1;

        // operatore incrementale (aggiunge sempre 1)
        var_num++; // aggiunge sempre e solo 1.
        // sarebbe come questo:
        var_num = var_num + 1;

        // esempio:
        // var_totale = var_num++ + var_num2; 
        //(non sono stati dichiarate le funzioni, quindi ovviamente non funzionano)


        var_num--;//operatore di decremento (toglie solo e sempre 1)

        System.out.println("Numero è uguale a " + var_num); // quello che viene stampato su terminale

    }
}
