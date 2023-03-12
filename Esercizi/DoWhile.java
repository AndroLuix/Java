package com.JAVA.Esercizi;

public class DoWhile {
    public static void main(String[] bobby) {
       
        int veicolo = 0;
        while ((veicolo >= 0) && (veicolo <= 2)){
            System.out.println("Attualmente nel garage ci sono "+veicolo+" auto");
         veicolo++;
        }
        do {
            System.out.println( " E vi sono " + veicolo + " moto");
            veicolo++;
        } while(( veicolo >= 3)&&( veicolo<= 5));{
            System.out.println(veicolo + " Veicoli in totale");
        }
        
    }
    
}
