package Febbraio.G1602;

public class ES6Bis {
    public static void main(String[] args) {
        double noBisestile = 365;
        //double bisestile = 366;

   

        if((noBisestile/2)  == 182.5){
            System.out.println("No Bisestile");
        } else if (noBisestile/2 != 182.5){
            System.out.println("Bisestile");
        }
    }    
}
