    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.JAVA.Marzo.G0103;
import java.util.Scanner; // import the Scanner class
import java.io.*;
/**
 *
 * @author lui12
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            Scanner myObj = new Scanner(System.in);
            BufferedReader file_lettura = new BufferedReader(new FileReader("C:\\database\\utenti\\datiDiAccesso.txt"));
            String dati;
            String name;
            String password;
            String dati_inseriti;
            dati = file_lettura.readLine();
            System.out.println("Scrivi il tuo nome utente");
            name = "Luigi";
            System.out.println("Scrivi la tua password");
            password = "2222";

            dati_inseriti = name+password;




            //while (riga != null) { // se riga==null -> file finito
                
                //dati = file_lettura.readLine();
          
                System.out.println("dati nel file "+dati);
                System.out.println("I tuoi dati inseriti: "+dati_inseriti);
             
           // 
                if ( dati_inseriti.equals(dati) ){
                    System.out.println("Accesso acconsentito");
                } else {
                    System.out.println("Accesso negato");
                }
            file_lettura.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
