/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modulo2.CopiareOggetti;

import Modulo2.CopiareOggetti.Automobili;

/**
 *
 * @author lui12
 *
 * Java 34 - Copiare oggetti
 *
 * tramite metodo tramite costruttore
 */
public class CopiareOggetti {

    public static void main(String[] args) {

        Automobili auto = new Automobili("Fiat", "CLE", "Rossa", 1700, 2000, 10);
        Automobili auto1 = new Automobili("Volvo", "Giga", "Bianca", 2000, 3000, 20);
         Automobili auto2 = new Automobili("BMW", "Giga", "Bianca", 2000, 3000, 20);
          Automobili auto3 = new Automobili("Mercedes", "Giga", "Bianca", 2000, 3000, 20);
          
          //verifica dell'id
          System.out.println("Verifica ID prima auto: " + auto);
        System.out.println("Verifica ID seconda auto: " + auto1);
        System.out.println();
        
        //Stampo a video 
        //prima macchina
        System.out.println("Prima Auto " + auto.vediAuto());
        System.out.println(auto.getKilometri());
        System.out.println(auto.getPrezzo());
        System.out.println();

        //seconda macchina
        System.out.println("Seconda auto: " + auto1.vediAuto());
        System.out.println(auto1.getKilometri());
        System.out.println(auto1.getPrezzo());
        System.out.println();

        //id verifica degli oggetti
        auto = auto1;
        System.out.println("Verifica ID prima auto: " + auto);
        System.out.println("Verifica ID seconda auto: " + auto1);
        System.out.println();

        //gli id sono uguali @76ed5528
        //vogliamo che due oggetti uguali abbiano due id diversi.
        //dichiaro a video gli oggetti (le due auto)
        System.out.println(auto.vediAuto());
        System.out.println(auto.getKilometri());
        System.out.println(auto.getPrezzo());
        System.out.println();

        System.out.println(auto1.vediAuto());
        System.out.println(auto1.getKilometri());
        System.out.println(auto1.getPrezzo());
        System.out.println();

        //link per capire meglio: https://www.youtube.com/watch?v=EgiBTdvmW8E&list=PLP5MAKLy8lP9wbmTi6c4-tmqzyOtLglGP&index=35
        //creiamo un metodo copy
        /*
        nel metodo copy possiamo avere due oggetti uguali, ma con due id diversi
         */
        //applicazione del metodo copy
        auto2.copy(auto3);
        auto2.setKm(500000000);
        //verifica se l'id è diverso:
        System.out.println("Verifica ID prima auto: " + auto2);
        System.out.println("Verifica ID seconda auto: " + auto3);
        System.out.println();
         System.out.println(auto2.vediAuto());
        System.out.println(auto2.getKilometri());
        System.out.println(auto2.getPrezzo());
        System.out.println();

        System.out.println(auto3.vediAuto());
        System.out.println(auto3.getKilometri());
        System.out.println(auto3.getPrezzo());
        System.out.println();
        
  
        //e l'id cambia. 
        
        
        //con il metodo creato di nome copy
        Automobili auto5 = new Automobili("Dinamo", "Zinco", "Blu", 700, 2400, 1);
        Automobili auto6 = new Automobili(auto5);
        auto5.setKm(22200);
        //verifica se l'id è diverso:
        System.out.println("Verifica ID prima auto: " + auto5);
        System.out.println("Verifica ID seconda auto: " + auto6);
        System.out.println();
         System.out.println(auto5.vediAuto());
        System.out.println(auto5.getKilometri());
        System.out.println(auto5.getPrezzo());
        System.out.println();

        System.out.println(auto6.vediAuto());
        System.out.println(auto6.getKilometri());
        System.out.println(auto6.getPrezzo());
        System.out.println();
    }

}
