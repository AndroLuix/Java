package Colleghi;

public class DoWhile {
    public static void main(String[] args) {
        int var_importo1 = 10;
       
         
        while (var_importo1 >= 6 ){
                System.out.println(" il risultato è:"+ var_importo1 );
                   var_importo1--;        
        }
           do {      
                   System.out.println("il risultato è (questo è DO):" +var_importo1 );
                   var_importo1++;
           }
           while  (var_importo1 <= 8 ) ;
                        System.out.println("il risultato è:" + var_importo1 );
    }
}
