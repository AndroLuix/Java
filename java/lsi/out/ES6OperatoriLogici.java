/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.out;

/**
 *
 * @author lui12
 */
public class ES6OperatoriLogici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * Gli operatori logici
        * 
        * operatori: AND, OR, NOT
        */
       
       boolean x = 3 % 2 == 0; //false (il resto è uno)
       System.out.println("x = 3 % 2 == 0");
       System.out.println(x);
       boolean y = 4 % 2 == 0; // true (il resto è zero)
        System.out.println("y = 4 % 2 == 0");
       System.out.println(y);
        System.out.println();
       
       
       
       x = 2 < 10 && 3 % 2 == 0; // false false = false
       System.out.println("x = 2 < 10 && 3 % 2 == 0 "+ x);
       
       x = 2 < 10 || 3 % 2 == 0; // false false = false
       System.out.println("x = 2 < 10 || 3 % 2 == 0 "+x);
       
       x = 10 > 2 && 3 % 2 == 0; //true false = false
       System.out.println(" x = 10 > 2 && 3 % 2 == 0 "+x);
       
        x = 10 > 2 || 3 % 2 == 0; //true false = true
        System.out.println(" x = 10 > 2 || 3 % 2 == 0; "+x);
        
         x = 10 > 2 && 4 % 2 == 0; //true true = true
       System.out.println(" x = 10 > 2 && 4 % 2 == 0 "+x);
       
        x = 10 > 2 || 4 % 2 == 0; //true true = true
       System.out.println(" x = 10 > 2 || 4 % 2 == 0 "+x);
        System.out.println();
       
       
       
       //descritto in modo più semplice: 
       x = true || false;
       System.out.println(x); //true
       
       x = false || false;
       System.out.println(x);  //false
       
       x = true && false;
       System.out.println(x);  //false
       
       x = false && true;
       System.out.println(x);  //false
       
        x = true && true;
       System.out.println(x);  //true
       
       
       //il NOT (punto esclamativo) !
       
       x = false ;
       System.out.println(!(x));  //true
       
       x = true;
        System.out.println(!(x)); // false
         System.out.println();
       
        
       x = 3<10; //3 è minore di 10? true. 
       System.out.println("Senza il NOT " + x); // true;
       System.out.println("con il NOT " + !(x)); // false;
        System.out.println();
       
       //non è vero che sei uscito ieri?
       //si, sono uscito ieri. 
       
       //il NOT è la negazione di quello che è il risultato di una condizione.
       // con il false, quindi, si inverte il risultato booleano.
       //un true diventa un false e viceversa. 
       
       //un booleano più complesso: 
       x = (3<10 && 3%2==0)||( 6< 10 && 6 % 2 == 0); 
       //Marcocalcolo: 
            // microcalcolo: (3<10 (true) && 3%2==0 (false)) // false
        //OR                         
            // microcalcolo: (6< 10 (true) && 6 % 2 == 0 (true) //false
       // risultato: true
       System.out.println(x);
           System.out.println();
       //con la NOT
        x = (!(3<10 && 3%2==0))&&( 6< 10 && 6 % 2 == 0);
        /**
         *  x = !(3<10 && 3%2==0) - questa operazione in verità è false, ma con la NOT diventa true
         * &&( 6< 10 && 6 % 2 == 0); -- questa è true
         */
        
        //risultato: true
        System.out.println(x);
        System.out.println();
        
        // normalmente, senza la NOT, è un false
         x = (3<10 && 3%2==0)&&( 6< 10 && 6 % 2 == 0); 
         //risultato false:
           System.out.println(x);
        
       
                            
       
       
       
       
       
       
       
       
       
       
       
               
         
       
    }
    
}
