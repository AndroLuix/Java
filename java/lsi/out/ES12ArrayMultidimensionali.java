/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */
public class ES12ArrayMultidimensionali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Array multidimensionali o array 2D
         * 
         * cosa sono gli array 2D: sono array dentro altri array
         * 
         * Accedere agli elementi degli array
         * ciclare con for
         */
        
        /**
         * Array normale:
         * int[] numeri ={10,20,30};
         */
        
        //CREAZIONE ARRAY 2D (vuoto)
        
        //il primo array contiene tutte le classi, il secondo array gli alunni all'intenro
        String[][] classi = new String[3][3];
        
        //inserimento elementi dentro l'array
        classi[0][0] = "Luca";
        classi[0][1] = "Anna";
        classi[0][2] = "Marco";
        
        classi[1][0] = "Lucia";
        classi[1][1] = "Maria";
        classi[1][2] = "Gianni";
        
        classi[2][0] = "Arianna";
        classi[2][1] = "Elisa";
        classi[2][2] = "Kekko";
        
        //visualizzare un alunno su video
        System.out.println("visualizzazione di un alinno/a su video "+ classi[2][1]);
        System.out.println();
        
        //CICLO FOR E ARRAY
        for(int aula = 0; aula < classi.length; aula++){
            String nomeclasse;
            System.out.println();
            if(aula <1){
                System.out.println("Classe A");
            }else if (aula <2){
                System.out.println("Classe B");
            } else {
                System.out.println("Classe C");
            }
            for(int studente = 0 ; studente < classi[aula].length; studente++){
                System.out.println(classi[aula][studente]+" ");
            }
        
        }
        
    // CREARE ARRAY 2D:
        String[][] auto = {
        {"Fiat", "Suzuki","Hyiunday", "Honda"},
        {"Mercedes","BMW","Audi","Benz", "Doodge" },
        {"Bugatti","Ferrari","Lamborghini", "Maserati"}
    };
         for(int sezione = 0; sezione < auto.length; sezione++){
            String nomeclasse;
            System.out.println();
            if(sezione <1){
                System.out.println("Classe Moderna");
            }else if (sezione <2){
                System.out.println("Classe Sportiva");
            } else {
                System.out.println("Classe Super Speed");
            }
            for(int marca = 0 ; marca < auto[sezione].length; marca++){
                System.out.println(auto[sezione][marca]+" ");
            }
        
        }System.out.println();
        
         //Oppure:
         for (String[] sezione:auto ){
             int i = 0;//inizio 05-03-2023
             ++i;//fine 05-03-2023
             System.out.println( i);
             for(String marca:sezione){
                 System.out.println("marca: " + marca);
                 
             }
         }
         
                
        
    }
    
}
