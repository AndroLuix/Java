
package lsi.out9_Incapsulamento;

/**
 *
 * @author lui12
 * 
 * Java 33 - Incapsulamento / Encapsulation
 * 
 * Incapsulamento = processo in cui nascondiamo attributi di una classe
 * all'esterno mettendoli private diventando accessibili solo tramite dei metodi (getters/setters)
 * 
 * creiamo classe persona
 * aggiungiamo attributi private
 * definiamo getters e setters
 * 
 * l'incapsulamento è uno dei fondamentali della programmazione ad oggetti OOP
 * 
 * 
 */
public class Incapsulamento {

    public static void main(String[] args) {
        
        Persona persona = new Persona ("Luigi","Edomis",20);
               

        //nella classe persona nome ha la key default
        //mentre cognome key private
        System.out.println(persona.nome);
        //System.out.println(persona.cognome); Non viene preso, è segnato come errore perché cognome è private
        //cognome essendo private non è accessibile all'infuori della classe Persona
        //stessa cosa per eta.
        
        //per accedere a cognome abbiamo un unico modo: Getters e Setters
        //getters (prendere) setters (settare)
        
         System.out.println("Utente: " + persona.nome+ " "+persona.getCognome()+ ", eta "+persona.getEta());
        System.out.println(persona.getCognome());
        
        
        
        //ora modifichiamo l'eta e il cognome col comdando set
        
        persona.setCognome("Iadicola");
        persona.setEta(25);
        
        System.out.println("Utente: " + persona.nome+ " "+persona.getCognome()+ ", eta "+persona.getEta()); 
    }
    
}
