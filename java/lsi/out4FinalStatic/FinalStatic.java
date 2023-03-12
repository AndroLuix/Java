
package lsi.out4FinalStatic;

/**
 * 
 * @author lui12
 * 
 * Java 29 - final e static keyword
 * 
 * final 
 * static
 * 
 * 
 */

public class FinalStatic {

   
    public static void main(String[] args) {
       
        //normalmente una variabile può essere cambiata.
        //es:
        int prova = 5;
        prova = 10;
        System.out.println(prova);
        
        // con il comando final invece non cambia la variabile
        
        final int esempio = 5;
        //esempio = 10; errato.
        System.out.println();
        
        
        //con il metodo static
        Persone persona1 = new Persone("Luca","Rossi");
        Persone persona2 = new Persone("Lucia","Russi");
         Persone persona3 = new Persone("Marco","DeNicola");
         
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        
        //System.out.println("Numero di persone elencate "+Persone.numeroPersone); 
        /**
         * //precedentemente invocavamo questo metodo, adesso però abbiamo creato il metodo proprio per invocare 
         * il System.print, ossia il metodo mostraNumPersone:
         */
        Persone.MostraNumPersone();
        
        
             
        
    }
    
}
