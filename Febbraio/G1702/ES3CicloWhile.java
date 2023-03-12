package Febbraio.G1702;

public class ES3CicloWhile {
    public static void main(String[] args) {
        
        int contatore =0 ;
        int var_3 = 3;

        /*  while(var_3 <= 10){
            var_3++;
            contatore++;
            System.out.print("ciclo ripetuto " +contatore);
        }*/
       

        while( var_3 >2 && var_3<4){ //falso (ciclo infinito)
            contatore++;
            var_3++;
            System.out.print("ciclo ripetuto " +contatore);
        }

    }
    
}
