/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */
public class ES8Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // o Switch
        
        /**
         * gli switch sono simili agli if, ma con ugualianza. 
         */
        String nome = "Luigi";
        
        switch (nome){
            case "Raffaele": System.out.println("Ciao "+nome);
            case "Luigi": System.out.println("Ciao "+nome);
            case "Roberta": System.out.println("Ciao "+nome);
                            break; //con questo comando, semplicemente si interrompe l'esecuzione del codice.
            //case "Luigi"  (considerato errato, poichè la casistica Luigi già è esistente
            case "Edoardo": System.out.println("Ciao "+nome);
                             break;
            default: 
            System.out.println("Nome non presente della casistica, sono nel default");
                 
            
        }
    }
    
}
