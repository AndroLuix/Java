package Esercizi;

public class somma {
    public static void main(String[] Rob) {

        int voto_a = 8;
        int voto_b = 7;
        int voto_c = 4;

        boolean votosuperiore3;
        boolean votosuperiore2;
        boolean votosuperiore1;

        boolean promozione1;
        boolean promozione2;
        boolean promozione3;
        boolean promozioneDef;
        
        votosuperiore1 = voto_a > 6;
        votosuperiore2 = voto_b > 6;
        votosuperiore3 = voto_c > 6;

        

        promozione1 = votosuperiore3 && votosuperiore2; // 4 > 6 && 7 > 6
        promozione2 = votosuperiore2 && votosuperiore1; // 7> 6 && 8 > 6
        promozione3 = votosuperiore2 && votosuperiore1; // 7>6 && 8>6

        /*
         *  promo1 = false && true
         * promo2 = true && true
         * promo3 = true && true
         */

        promozioneDef = promozione1 || promozione2 || promozione3;
        // promozionedef serve per dire che basta un solo true appinto per promuovere
        // l'alunno
        int media, somma1;
        media = ( voto_a + voto_b + voto_c) / 3;
        somma1 = ( voto_a + voto_b + voto_c);

        boolean somma2 = ( voto_a + voto_b + voto_c) > 24;

        System.out.println("L'lallievo è stato promosso: " + promozioneDef +" | media: "+ media);
        System.out.println("La somma è maggiorre di 24:  somma alunno: " + somma1 + " : "+ somma2);
    
      
       
      
      
    }

}
