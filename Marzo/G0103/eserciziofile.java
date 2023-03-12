package com.JAVA.Marzo.G0103;
import java.io.*;
import java.util.Scanner; // import the Scanner class

import java.util.*;
public class eserciziofile {
    public static void main(String[] args) {
        
        
        try {
            Scanner myObj = new Scanner(System.in);
            BufferedReader file_lettura = new BufferedReader(new FileReader("C:\\database\\utenti\\datiDiAccesso.txt"));
            String dati;
            String name;
            String password;
            String dati_inseriti;
            dati = file_lettura.readLine();
            boolean continua = true;
            
            System.out.println("Scrivi il tuo nome utente");
            name = myObj.nextLine();
            System.out.println("Scrivi la tua password");
            password = myObj.nextLine();

            dati_inseriti = name+password;




            //while (riga != null) { // se riga==null -> file finito
                
                //dati = file_lettura.readLine();
          
                //System.out.println(dati);
                //System.out.println("I tuoi dati inseriti: "+dati_inseriti);
             
           // 
           while (dati != null && continua == true){
             
                if ( dati.equals(dati_inseriti) ){
                    System.out.println("Accesso acconsentito");
                    continua = false;
                } else {
                    System.out.println("Accesso negato");
                }
                dati = file_lettura.readLine();
           }
            file_lettura.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
    }
}
