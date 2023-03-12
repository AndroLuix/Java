package Febbraio.G2202;

public class ES1CicloFor {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * ///////////////////////////////////////////////////////// *
         * for (int i = 10; i<=10 & i >= 0; i--){
         * System.out.println(i);
         * }
         * 
         * //Il ciclo fro è simile al ciclo while, ma cambia la sintassi rendendo il
         * codice più pulito
         * int j = 10;
         * while ( j <= 10 & j >= 0){
         * j--;
         * System.out.println(j);
         * }
         */
        /////////////////////////////////////////////////////////////////////



        ///////////////////////////////////////////////////// 
        //ciclo for per inserimento in array
        int giorniMese[] = new int[12];

        for (int indiceArray = 0; indiceArray <= 11; indiceArray++) {
            giorniMese[indiceArray] = 30;
            System.out.println(indiceArray + "primo for" + giorniMese[indiceArray]);
        }

        //ciclo for per visualizzare dati array (dopo il completamento dell'array)
        for (int indiceArrray = 0; indiceArrray <=11; indiceArrray++) {
            System.out.println("valore: secondo for "+ giorniMese[indiceArrray]);}
         ///////////////////////* */

       /*  for (int i = 0, j = 0; i <= 5 || j <= 5; i++, j++){
            System.out.println("for semplice valore i: "+ i + "  valore J: "+j);
        }
        */

        /////////////////////////////

    }


}


