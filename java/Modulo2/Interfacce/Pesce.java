/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo2.Interfacce;

/**
 *
 * @author lui12
 */
public class Pesce implements Preda, Predatore{

    @Override
    public void scappa() {
       System.out.println("Il pesce più piccolo scappa dai pesci più grossi");
    }

    @Override
    public void caccia() {
        System.out.println("Il pesce più grande caccia i pesci più piccoli.");
    }
    
}
