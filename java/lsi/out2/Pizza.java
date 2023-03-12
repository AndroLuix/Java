/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.out2;

/**
 *
 * @author lui12
 */
public class Pizza {
    //inserimento degli scope/dati:
    String impasto;
    String salsa;
    String formaggio;
    String extra;
    String extra2;
    
    //creazione metodo con costruttori:
    Pizza(String impasto, String salsa, String formaggio, String extra){
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        this.extra = extra;
        
        //Mandiamo a schermo gli ingredienti direttamente nel metodo Pizza anziche nella classe main
        System.out.println("Ingredienti : "+impasto+ ", "+salsa+", "+formaggio+", "+extra);

    }
    
    //altri metodi con costruttori:
    Pizza(String impasto){
        this.impasto = impasto;
        System.out.println("Ingredienti impasto: "+impasto);
    }
    
       Pizza(String impasto, String salsa){
        this.impasto = impasto;
         this.salsa = salsa;
         System.out.println("Ingredienti : "+impasto+ ", "+salsa);
    }
       
       Pizza(String impasto, String salsa, String formaggio){
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        System.out.println("Ingredienti : "+impasto+ ", "+salsa+", "+formaggio);

    }
        Pizza(String impasto, String salsa, String formaggio, String extra, String extra2){
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        this.extra = extra;
        this.extra2 = extra2;
           System.out.println("Ingredienti : "+impasto+ ", "+salsa+", "+formaggio+", "+extra+", "+extra2);
    }
}
