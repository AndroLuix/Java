package Esercizi;

import java.util.Random;

public class DoWhile0or0 {
    public static void main(String[] args) {
        /*
         * QUALSIASI NUMERO ESCA, DEVESSERE RIPORTATO A 0    
         */

        //creazione numero random
        Random rand = new Random();
        int num1000 = rand.nextInt(1000);
        int num2000 = rand.nextInt(2000);
        int num = num1000 - num2000;
        //Print numer'
        System.out.println("Numeri Random " + num1000 + " - "+ num2000);
        System.out.println("Risultato = " + num);

        
        if(num < 0){ //per i numeri negativi
            do{ 
                num++;
            }  while(num >= -2000 && num <= -1); //conversione del numero negativo allo 0                                //Conversione del num
            System.out.println("1 .Il numero è stato riportato a: " + num);

        } else if(num>11){ //per i numeri positivi
            do{
                num--;
        }while(num >=1 || num <= -1); //conversione del numero positivo allo 0
        System.out.println("Il numero è Stato riportato a: " + num);
        } 
}
}
