package Febbraio.G2202;

public class ES2CicloFor_Asterischi {
    public static void main(String[] args) {

        /*
         * // stampare a video il seguente output:
         *****
         ****
         ***
         **
         *
         */

        /*
         * int disegno[] = new int[4];
         * 
         * for (int indiceArray = 5; indiceArray >=0 ; indiceArray--){
         * 
         * switch(indiceArray){
         * case 5:
         * System.out.println("*****");
         * break;
         * case 4:
         * System.out.println("****");
         * break;
         * case 3:
         * System.out.println("***");
         * break;
         * case 1:
         * System.out.println("**");
         * break;
         * case 0:
         * System.out.println("*");
         * break;
         * }
         */

        // System.out.println(indiceArray);}

        for (int ripetizione = 5; ripetizione >= 0; ripetizione--) {
            for (int j = 0; j < ripetizione; j++) {
                System.out.println("*");
            }
            System.out.println("");
        }

    }
}
