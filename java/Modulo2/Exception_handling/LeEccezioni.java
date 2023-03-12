/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modulo2.Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lui12
 * 
 * Java 37 Exception hadling,
 * Le Eccezioni: un eccezione  non è un errore: è un veneto che protrebbe succedere
 * pertanto la gestione delle eccezioni si fa con Try Catch
 */
public class LeEccezioni {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
      try{
            System.out.println("Inserisci numero");
        int x = tastiera.nextInt();
        System.out.println("Inserire il secondo numero");
        int y = tastiera.nextInt();
        
        int ris = x/y;
        System.out.println("Il risultato è: "+ris);
                
      } catch(ArithmeticException err){
          System.err.println("Non si può dividere un numero con 0: Errore: " + err);
      } catch(InputMismatchException err){
          System.err.println("Non puoi scrivere una lettera o altri caratteri, solo numeri. \n errore: " +err);
      }catch (Exception err){
          System.err.println("C'è stato un problema, riprova. \n errore: "+err);
      } finally{
          System.err.println("Eseguito"); //finally è obbligatorio metterlo
          tastiera.close();     //tastiera.close() chiuse lo scanner
      }
    }
    
}
