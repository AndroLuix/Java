package Febbraio.G1002;

public class ES02Boolean {
    public static void main(String[] args) {

        boolean var_relazione;
        var_relazione = (3 + 2) > (3 + 4); // false
        System.out.println("var_relazione: " + var_relazione);

        // var_relazione = true > 4; //true

        System.out.println("var_relazione: " + var_relazione);

        System.out.println("");
        var_relazione = 3 + (2 * 3) > 4; // true
        System.out.println("var_relazione: " + var_relazione);

        System.out.println("");
        var_relazione = 3 > 2 || 3 > 4; // true (con l'operatore "or" || basta che uno di questo sia vero)
        System.out.println("var_relazione: " + var_relazione);
        System.out.println("");
        System.out.println("Con gli operatori OR ");
        System.out.println("");

        var_relazione = true || true;
        System.out.println("var_relazione: " + var_relazione); // risultato true

        var_relazione = true || false;
        System.out.println("var_relazione: " + var_relazione); // risultato true
        System.out.println("");

        /*
         * La variabile var_applica_sconto consente di comprendere se applicare lo
         * sconto al cliente.
         * Nel caso il cliente sia un cliente fedele (abbia effettuato altri
         * acquisti) O nel caso sia iscritto alla newsletter, lo sconto si applica.
         */

        boolean var_applica_sconto; // true -> appliccherò lo sconto
        boolean var_iscritto_newsletter; // true -> cliente è iscritto
        boolean var_cliente_fedele; // true -> cliente è fedele

        var_iscritto_newsletter = false;
        var_cliente_fedele = false;

        var_applica_sconto = var_iscritto_newsletter || var_cliente_fedele;
        System.out.println("var_applica_sconto :" + var_applica_sconto);

        var_relazione = true || false;
        System.out.println("var_relazione: " + var_relazione); // risultato true

        var_relazione = false || false;
        System.out.println("var_relazione: " + var_relazione);// risultato false
        System.out.println("");

        /*
         * La variabile var_applica_sconto consente di comprendere se applicare lo
         * sconto al cliente.
         * Nel caso il cliente sia un cliente fedele (abbia effettuato altri
         * acquisti) O nel caso sia iscritto alla newsletter, lo sconto si applica.
         */

        var_iscritto_newsletter = true;
        var_cliente_fedele = false;

        var_applica_sconto = var_iscritto_newsletter || var_cliente_fedele;
        System.out.println("var_applica_sconto :" + var_applica_sconto);
        System.out.println("");

        /*
  La variabile var_applica_sconto consente di comprendere se applicare lo 
  sconto al cliente.
  Se il cliente è un cliente fedele (abbia effettuato altri 
  acquisti) E se è iscritto alla newsletter, lo sconto si applica.
  */

  //boolean var_applica_sconto;        //true -> appliccherò lo sconto
  //boolean var_iscritto_newsletter;   //true -> cliente è iscritto
  //boolean var_cliente_fedele;        //true -> cliente è fedele

  var_iscritto_newsletter = true;
  var_cliente_fedele = true;

  var_applica_sconto = var_iscritto_newsletter && var_cliente_fedele;
  System.out.println("var_applica_sconto :" + var_applica_sconto);

    }
}
