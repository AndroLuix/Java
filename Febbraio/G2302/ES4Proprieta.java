
/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package Febbraio.G2302;

/**
*
* @author lui12
*/
public class ES4Proprieta {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       
       // CTRL + SPACE = visualizza lista dei comandi
       
       
       String nome_utente = "Mario   ";
       String cognome = "    Rossi";
       String email = "Mariorossi@gmail.com";
       
        
       //comando eliminazione degli spazzi vuoti
       cognome = cognome.strip();
       nome_utente = nome_utente.strip();
       
       //prove
        System.out.println("Lunghezza nome: "+nome_utente.length());
        System.out.println("Lunghezza cognome: "+cognome.length());

      
        //conversione della "Striga" nome/cognome in "Int" (lunghezza nome/cognome)
        int length_nome = nome_utente.length(); 
        int length_cognome = cognome.length();
        
        
        //benvenuto
        String benvenuto = "Benvenuto "+nome_utente + " "+cognome;
        
        int length_min = 2, length_max = 15; //requisiti del nome/cognome utente
        
        
        if(length_nome >= length_min  && length_nome <= length_max && length_cognome >= length_min  && length_cognome <= length_max){
            System.out.println(benvenuto);
            
        }else {
            System.out.println("Il nome dev'essere lungo tra "+ length_min++ +" e "+ --length_max+" caratteri");
        } 
        
       /* 
        if(length_cognome >= length_min  && length_cognome <= length_max){
            System.out.println("");
            
        }else {
            System.out.println("Il nome dev'essere lungo tra "+ length_min +"e "+length_max+" caratteri");
        } 
        */
        
       
      
    
       
      
       
       
   }
   
}


