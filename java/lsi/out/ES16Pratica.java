/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

import java.util.Scanner;

/**
 *
 * @author lui12
 */
public class ES16Pratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sceltaCliente = new Scanner(System.in);
        
        System.out.println("Scegli il tipo di farina: bianca, cereali, integrale");
        farinaPizza(sceltaCliente.nextLine());
        System.out.println("Scegli gli ingredienti, minimo due");
        ingredienti(sceltaCliente.nextLine(),sceltaCliente.nextLine(),sceltaCliente.nextLine(),sceltaCliente.nextLine());
        
     
        
        
    }
  
  static void farinaPizza(String farina){
        System.out.println("tipo di farina "+farina);
    }
  
   static void ingredienti(String primo, String secondo, String terzo, String quarto){
   System.out.println("Ingredienti "+ primo + " "+ secondo+" "+terzo+" "+quarto);

  }
  static void ingredienti(String primo, String secondo, String terzo){
   System.out.println("Ingredienti "+ primo + " "+ secondo+" "+terzo);
 
  }
  static void ingredienti( String primo, String secondo){
   System.out.println("Ingredienti "+ primo + " "+ secondo);
 
  }
  
}
