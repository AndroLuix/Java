/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.out5Ereditarieta;

import java.util.Arrays;

/**
 *
 * @author lui12
 */
/**
 * Siamo tutti persone, tuttavia copriamo un ruolo nella societa' in questo caso
 * alcune persone ricoprono il ruolo di insegnante.
 */
public class Insegnante extends Persona {
    String materia;
    String[] classi;
    
    public Insegnante(String nome, String cognome, String materia, String[] classi) {
        super(nome, cognome);
        this.materia=materia;
        this.classi = classi;
    }
     public Insegnante(String nome, String cognome, String materia) {
        super(nome, cognome);
        this.materia=materia;
    }
       public Insegnante(String nome, String cognome) {
        super(nome, cognome);
    }
    
    void infoInsegnante(String materia, String[] classi){
        this.materia = materia;
        this.classi = classi;
        System.out.println("Sto insegnango: " + materia + "nelle classi" + Arrays.toString(classi));
        
    }
    @Override
    void saluta(){
        System.out.println("Buongiono alunni, oggi faremo "+ this.materia);
    }
    
}
