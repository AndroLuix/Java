package Febbraio.G1702;

public class ES2_CicloWhile {
    public static void main(String[] args) {

        int contatore = 1;
        int var_num3 = 3;
        int var_num7 = 7;
        System.out.println();
        while(var_num3 <= var_num7){ // 3 è minore uguale a 7? Fin quando è vero il ciclo si ripete, altrimenti si ferma
            var_num3++; //ogni volta che si ripete il ciclo il 3 incrementa di 1 (3+1 =4) secondo ciclo (4+1 =5) terzo ciclo (5+1 =6) ciclo finito
            contatore++;
            System.out.println(contatore);
        }

    }
}
