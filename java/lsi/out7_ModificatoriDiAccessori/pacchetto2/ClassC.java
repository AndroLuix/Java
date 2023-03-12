/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.out7_ModificatoriDiAccessori.pacchetto2;

import java.util.ServiceLoader;
import lsi.out7_ModificatoriDiAccessori.pacchetto1.*;

/**
 *
 * @author lui12 dobbiamo importare: import
 * lsi.out7_ModificatoriDiAccessori.pacchetto1.*; (l'asterisco sta per tutto il
 * pacchetto) per fare l'extends (ereditarieta') alla Classe A che si trova in
 * unaltro package facciamo la stessa cosa con la ClassB
 */
public class ClassC extends ClassA {
    
    protected String nome ="Maria";
    //protected class subclass package 
    
    public static void mmm(String[] args) {
        //inseriemnto oggetto classB
        ClassB prova = new ClassB();
        System.out.println(prova.nome);
        //funziona
    }   
}
