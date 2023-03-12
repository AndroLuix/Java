package Febbraio.G1002;

import javax.swing.text.StyledEditorKit.BoldAction;

public class ES5boolean {
    public static void main(String[] args) {

        boolean applicaSconto = true, iscrittoNewsLetter = true, clienteFedele = true;
        boolean noNewsLetter = false, NoFedele = false;

        // CLIENTI SCONTO (SISTEMA RIGIDO)
        boolean cliente_federica = iscrittoNewsLetter && NoFedele; //AND
        boolean cliente_mario = iscrittoNewsLetter && clienteFedele;
        boolean cliente_francesco = noNewsLetter && clienteFedele;
        boolean cliente_michela = noNewsLetter && NoFedele;

        System.out.println("Clientie e sconto (Sistema Rigido):: ");
        System.out.println("Francesco: " + cliente_francesco);
        System.out.println("Mario: " + cliente_mario);
        System.out.println("Federica: " + cliente_federica);
        System.out.println("Michela: " + cliente_michela);
        System.out.println("");

        // CLIENTI SCONTO (SISTEMA FLESSIBILE)

        cliente_federica = iscrittoNewsLetter || NoFedele; //OR
        cliente_mario = iscrittoNewsLetter || clienteFedele;
        cliente_francesco = noNewsLetter || clienteFedele;
        cliente_michela = noNewsLetter || NoFedele;

        System.out.println("Clientie e sconto (Sistema Flessibile): ");
        System.out.println("Francesco: " + cliente_francesco);
        System.out.println("Mario: " + cliente_mario);
        System.out.println("Federica: " + cliente_federica);
        System.out.println("Michela: " + cliente_michela);

    }

}
