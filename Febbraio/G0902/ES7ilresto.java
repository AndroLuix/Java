package Febbraio.G0902;
public class ES7ilresto {
    // NOEM DEL FILE "es7ILRESTO" PER FAR FUNZIONARE JAVA BISOGNA NOMIANRE il file

    public static void main(String[] args) {
        // questo codice "main(String[] args)"" è importantissimo per Run Java

        int num = 20;
        System.out.println("1 - Il valore di num, ora è:" + num + "<"); // num
        int num2 = 2;
        int resto = num % num2; // risultato 0 coem resto.

        System.out.println("resto:" + resto + "<");
        /*
         * int num1 = 35;
         * int num4 = 2;
         * int resto1 = num1 % num4;
         * System.out.println("resto:" + resto1 + "<"); // resto 1
         */

        num = 35;
        System.out.println("2 - Il valore di num, ora è:" + num + "<"); // num
        num2 = 2;
        resto = num % num2;
        System.out.println("resto:" + resto + "<"); // resto
        System.out.println(" ");
        // resto++; //incremento di resto
        int diviso = num2 / resto++;
        System.out.println("risultato:" + num2 + " : " + resto + " + 1 = " + diviso + "<=");
        System.out.println(" ");

        diviso = 10; // cambio del valore "diviso"
        resto = 10; // cambio del valore "resto"
        int moltiplicato = resto * diviso;
        System.out.println("risultato:" + resto + " x " + resto + " = " + moltiplicato + "<=");

    }
}
