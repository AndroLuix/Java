package lsi.out;

import java.util.ArrayList;
import java.util.Collections;

public class ListeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        arrayStringa();
        
        //arrayNumerico();
        
    }
    
    public static void arrayStringa(){
        
        ArrayList <String> cibo = new ArrayList<String>();
        
        cibo.add("Pizza");      //0
        cibo.add("Pasta");      //1
        cibo.add("Insalata");   //2
        cibo.add("Zuccine");    //3
        
        System.out.println(cibo);
        /*
        System.out.println(cibo.get(3));
        
        cibo.set(3, "Zucchine");
        System.out.println(cibo);
        
        cibo.sort(null);    
        System.out.println(cibo);
        
        Collections.reverse(cibo);
        System.out.println(cibo);
        
        cibo.add(1, "Carne");      
        
        System.out.println(cibo);
        */
        //System.out.println(cibo.size());
        
        //cibo.forEach((cibo_dimensione) -> System.out.println(cibo_dimensione));
        
        //cibo.forEach((cibo_dimensione) -> cibo.set(cibo.indexOf(cibo_dimensione), cibo_dimensione + "*"));
                                            
        //System.out.println(cibo);
        
        
        /*
        i = 0;
        
        for (String cibo_temp : cibo) {
               
           cibo_temp.set(i, cibo_temp.get(i) + "*");
           i++;
        }
        */
    }
    
    public static void arrayNumerico(){
        ArrayList <Integer> numeri = new ArrayList<Integer>();
        
        numeri.add(1);       //0
        numeri.add(2);       //1
        numeri.add(3);       //2
        numeri.add(4);       //3
        
        System.out.println(numeri);
        System.out.println("1 All'indice 2 ho:" + numeri.get(2));
        
        System.out.println("1 L'arrayList ha " + numeri.size() + " dimensioni");
        
        numeri.remove(2);
        
        System.out.println("2 All'indice 2 ho:" + numeri.get(2));
        
        System.out.println("2 L'arrayList ha " + numeri.size() + " dimensioni");
        
        System.out.println(numeri);
        
        numeri.add(0, 1000);
        System.out.println(numeri);
        
        numeri.sort(null);    
        System.out.println(numeri);
        
        Collections.reverse(numeri);
        System.out.println(numeri);
    }

}
