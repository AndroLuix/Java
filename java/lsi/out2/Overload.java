/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out2;

/**
 *
 * @author lui12
 */
public class Overload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Overloaded methods
         * 
         * cosa sono
         * creiamo diversi metodi con una parm differenti
         * creiamo diversi metodi con tipi di dato differenti
         */
        
        /*
        Sono dei metodi, che hanno lo stesso nome e utilizzabili in modo diverso.
        */
        
        int addizione = addizione(3, 4);
        int tripla_addizione = addizione(10,9,4);
        double addizione_double =  addizione(1.5, 2.2);
        System.out.println("Metodo con addizione: "+ addizione);
        System.out.println("Metodo con tripla addizione: "+tripla_addizione);
        System.out.println("Metodo con double: " + addizione_double);
      
        
        
        
        
    }
    
    //Queste sono le overloaded:
    //lo stesso metodo con lo stesso nome ma con valori diversi
    static int addizione(int x, int y){
        int ris = x+y;
        return ris;
    }
    
    
    static int addizione(int x, int y, int z){
        int ris = x+y+z;
        return ris;
    }
    static double addizione(double x, double y ){
        double ris = y+x;
        return ris;
    }
    
    
    
}
