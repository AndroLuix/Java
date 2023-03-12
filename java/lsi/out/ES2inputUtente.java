/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package lsi.out;

/**
 *
 * @author lui12
 */

/**
 * user input
 *  importare java.util.Scanner
 * creare oggetto scanner 
 * creare domande per utente: nome, cognome, eta, città
*/
import java.util.Scanner;
public class ES2inputUtente {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //tipo di dato di referenza
        
        System.out.println("Qual è il tuo nome?");
        String nome = scanner.nextLine();
         System.out.println("Qual è il tuo conome?");
         String cognome = scanner.nextLine();
        
        System.out.println("Quanti anni hai?");
        int eta = scanner.nextInt();//next int non sposta il cursore a capo
        //questo non ci permetterà di compilare altri campi.
        //il metodo è il seguente: 
        scanner.nextLine(); //scrivere il metodo nextline
        System.out.println("Qual è la tua città");
        String citta = scanner.nextLine();
        
        System.out.println("Ciao "+nome +" "+cognome);
        System.out.println("Abiti a "+citta +" e hai "+eta+ " anni");
        
        System.out.println("Da quanto tempo vivi a "+ citta +" ?");
        int anni_abitazione = scanner.nextInt();
        scanner.nextLine();
        int eta_prima = eta - anni_abitazione;
        System.out.println("Vivi a " + citta + " da "+ anni_abitazione);
        System.out.println("ti sei trasferito all'eta di "+ eta_prima +" anni");
        
    }
    
}
