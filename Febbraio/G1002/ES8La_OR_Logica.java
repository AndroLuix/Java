package Febbraio.G1002;

public class ES8La_OR_Logica { 
    public static void main(String[] args) {
/*////////////////////// LA "OR LOGICA" 

SImbolo: |

A cosa serve: la OR con due barre ||, il primo valore se è true allora il 
secondo valore che sia false o true è indifferente.
 Il risultato è sempre "true"
Quindi, non appena la macchina legge il primo "true" smette di 
visualizzare gli altri valori e dà coem risultato "true".

invece con la OR logica, invece, la macchina continua a
 leggerre oltre il primo risultato.
tuttavia il risultato è sempre lo stesso: true,
 anche se ci sono tre valori "false" e uno "true"

Esempio:  */


        boolean var_risultato;


  var_risultato = true || true;
  System.out.println ("true || true:" + var_risultato );

  var_risultato = true | true;
  System.out.println ("true | true:" + var_risultato );

  var_risultato = false || true;
  System.out.println ("false || true:" + var_risultato );

  var_risultato = false | true;
  System.out.println ("false | true:" + var_risultato );

  var_risultato = false || false ;
  System.out.println ("false || false :" + var_risultato );

  var_risultato = false | false ;
  System.out.println ("false | false :" + var_risultato );

  var_risultato = true || false ; //
  System.out.println ("true || false:" + var_risultato );

  var_risultato = true | false ;
  System.out.println ("true | false:" + var_risultato );
        
    }
    
}
