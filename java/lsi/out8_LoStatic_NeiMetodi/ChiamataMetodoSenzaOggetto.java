/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out8_LoStatic_NeiMetodi;

/**
 *
 * @author lui12
 * 
 * Cos'è static? 
 * Static è una key da mettere prima della classe o prima dei metodi.
 * Abbiamo visto come funziona la key static nelle classi
 * Ora la vediamo nei metodi. Creeremo delle classi, all'interno di questo file, con due metodi:
 * uno con static e l'altro senza static
 */

class Statico {
    
    String NoStatic = "NoStatic";
    static String Static = "Static";
    void Metodo() {
        System.out.println("Sono nel metodo NO Static");
    }

    static void metodo1() {
        System.out.println("Sono nel metodo  Static");
    }
}

public class ChiamataMetodoSenzaOggetto {

    public static void main(String[] args) {
        //non abbiamo bisogno di chiamare l'oggetto perché il metodo 1 è static 
        Statico.metodo1();//posso chiamarlo direttamente con la classe
        
        Statico noStatico = new Statico();
        noStatico.Metodo();//devo necessaeriamente chiamare l'oggetto
        
        System.out.println(Statico.Static); //posso chiamarlo direttamente con la classe
        System.out.println(noStatico.NoStatic);//devo necessaeriamente chiamare l'oggetto
         System.out.println(noStatico.Static);
        
        
    }

}


