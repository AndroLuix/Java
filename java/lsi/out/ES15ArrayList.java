/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

import java.util.ArrayList;

/**
 *
 * @author lui12
 */
public class ES15ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * Le Arraylist
        * 
        * Le arraylist sono array ridimensionabili, accettano però solo reference
        * 
        * Creare un ArrayList
        * 
        * Metodi:
        * Aggiungere elementi add()
        * Mandare a schermo elementi get()
        * Modificare elementi set()
        * Rimuovere elementi remove(), clear()
        * 
        * ArrayList 2D
        */
       
       
       //SCRIVERE UN ARRAYLIST
       ArrayList<String> persone = new ArrayList();
       
       //aggiungere elementi nell'arraylist:
       persone.add("Luca");
       persone.add("Marco");
       persone.add("Anna");
       
       //stampare a video un elemento dell'array
       System.out.println("Mandata a schermo indice 0 "+persone.get(0));
        System.out.println();
       //Mandare a schermo tutti gli elementi dell'array col ciclo for
       //metodo .size anzichè .length
       System.out.println("Mandata a schermo l'intero arraylist");
       for(int i=0; i < persone.size();i++){
           System.out.println(persone.get(i));
       }
        System.out.println();
       
       //MODIFICARE ARRAYLIST
       //Come modificare gli elementi di un array
       //comando .set()
       
       persone.set(0,"Luigi");
        System.out.println("ArrayList Modificato");
       for(int i=0; i < persone.size();i++){
           System.out.println(persone.get(i));
       } 
       System.out.println();
       
       
       //RIMUOVERE ELEMENTI NELL'ARRAYLIST:
       //comando remove() o comando clear()
       System.out.println("Rimozione indice 1 dell'ArrayList");
       persone.remove(1);
        for(int i=0; i < persone.size();i++){
           System.out.println(persone.get(i));
       } System.out.println();
       
       
       //RIMUOVERE TUTTI GLI ELEMENTI DI UN ARRAYLIST
       System.out.println("Rimozione di tutti gli indici dell'ArrayList");
       persone.clear();
       for(int i=0; i < persone.size();i++){
           System.out.println(persone.get(i));
       } System.out.println();
       
       
       
       //CREAZIONE DI UN  ARRAY INTEGER (int)
       ArrayList<Integer> festeggiati = new ArrayList<Integer>();
       festeggiati.add(1);
       festeggiati.add(100);
       festeggiati.add(1000);
       
       for(int i=0; i<festeggiati.size(); i++){
           System.out.println(festeggiati.get(i));
       }System.out.println();
       
       
       
       //ARRAYLIST 2D
       ArrayList<ArrayList<String>> generi = new ArrayList();
       
       ArrayList<String> maschi = new ArrayList<String>();
       maschi.add("Luigi");
       maschi.add("Gianni");
       maschi.add("Marco");
       
       ArrayList<String> femmine = new ArrayList<String>();
       femmine.add("Anna");
       femmine.add("Roberta");
       femmine.add("Francesca");
       
       generi.add(maschi);
       generi.add(femmine);
       
       //Mandare a schermo l'ArrayList 2D
       System.out.println();
       
       for (int i = 0; i < generi.size(); i++){
           System.out.println();
           for(int j = 0; j < generi.get(i).size(); j++ ){
                System.out.println(generi.get(i).get(j)+" ");
           }
       }
       
       
    }
}
