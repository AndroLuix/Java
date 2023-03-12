package Febbraio.G2202;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class ES2CicloFor_Stella {
    /**
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("*"); // print senza ln non va a capo
            System.out.println("");
        }

        /* oppure */ System.out.println("");

        int righe = 5;
        int asterisco = 5;
        String caratteri;
        for (int i = 0; i <= righe; i++) {
            caratteri = "";
            for (int j = 0; j <= asterisco; j++) {
                caratteri = caratteri + "*";
                // System.out.println("caratteri vale: " + caratteri);
            }
            System.out.println(caratteri);
            asterisco--;
        }

        for (int stella = 10; stella > 0; stella--) {
            for (int riga = 0; riga < stella; riga++) {
                System.out.print(" I");
                System.out.print(" <3");
                System.out.print(" Java");
            }

            System.out.println("");
        }

    }
}
