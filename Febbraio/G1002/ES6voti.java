package Febbraio.G1002;

public class ES6voti {
    public static void main(String[] args) {
        int voto_a = 8;
        int voto_b = 7;
        int voto_c = 4;

        boolean votosuperiorea6;
        boolean votosuperiorea62;
        boolean votosuperiorea63;

        boolean promozione1;
        boolean promozione2;
        boolean promozione3;
        boolean promozioneDef;

        votosuperiorea6 = voto_a > 6; // qui so se il voto è maggiore 6
        votosuperiorea62 = voto_b > 6;
        votosuperiorea63 = voto_c > 6;

        promozione1 = votosuperiorea6 && votosuperiorea62; // 8>6 && 7>6
        promozione2 = votosuperiorea6 && votosuperiorea63; // 8>6 && 4>6
        promozione3 = votosuperiorea62 && votosuperiorea63; // 7>6 && 4>6

        /*
         * promozione1 = true && true; // true
         * 
         * promozione2 = true && false; // false
         * promozione3 = true && false; // 7>6 && 4>6
         * 
         * promozioneDef = promozione1 || promozione2 || promozione3;
         * 
         * promozioneDef = true || false || false;
         */

        // somma voti

        promozioneDef = promozione1 || promozione2 || promozione3;
        // promozionedef serve per dire che basta un solo true appinto per promuovere
        // l'alunno

        int somma;
        somma = (voto_a + voto_b + voto_c) / 3;

        System.out.println("L'allievo è promosso: " + promozioneDef);
        System.out.println("somma voti: " + somma);
    }
}
