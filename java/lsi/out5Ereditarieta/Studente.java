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
 * alcune persone ricoprono il ruolo di studente.
 */
public class Studente extends Persona {
    //qui stiamo definendo che studente è figlio di persona

    //aggiungiamo la materia preferita dello studente:
    String materiaPreferita;
    String classe;
    int[] voti;

    public Studente(String nome, String cognome, String materiaPreferita, String classe, int[] voti) {
        super(nome, cognome);
        this.materiaPreferita = materiaPreferita;
        this.classe = classe;
        this.voti = voti;

    }
     public Studente(String nome, String cognome, String materiaPreferita, String classe) {
        super(nome, cognome);
        this.materiaPreferita = materiaPreferita;
        this.classe = classe;
    }
       public Studente(String nome, String cognome, String materiaPreferita) {
        super(nome, cognome);
        this.materiaPreferita = materiaPreferita;
    }
       
       public Studente(String nome, String cognome) {
        super(nome, cognome);
    }

    void infoStudente(String materiaPrreferita, String classe, int[] voti) {
        this.materiaPreferita = materiaPreferita;
        this.classe = classe;
        this.voti = voti;
        System.out.println("L'alunno " + nome + " ha le seguenti caratteristiche"
                + materiaPreferita + " come materia preferita \n ed è nella classe"
                + classe + " e infine ha i voti: "
                + Arrays.toString(voti));
    }

    @Override //sovrascrive serve per indicare a 
    //noi e altri prog.tori che deriva dalla classe persona e stiamo 
    //sovrascrivendo questo metodo che è già presente nella classe Persona
    void saluta() {
        System.out.println("Buongiorno prof");
    }

}
