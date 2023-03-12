package Febbraio.G0902;
public class gliArray {
    public static void main(String[] args) {
        int giorni_mesi[] = { 31, 28, 31, 31, 30, 31, 30, 31, 30, 31, 30, 31 }; // array con all'interno i giorni per
                                                                                // ogni mese (12 mesi)
        System.out.println("Gennaio ha " + giorni_mesi[0] + " giorni");
        System.out.println("Febbraio ha " + giorni_mesi[1] + " giorni");
        System.out.println("Marzo ha " + giorni_mesi[2] + " giorni");
        System.out.println("Gennaio ha " + giorni_mesi[3] + " giorni");
        System.out.println("Febbraio ha " + giorni_mesi[4] + " giorni");
        System.out.println("Marzo ha " + giorni_mesi[5] + " giorni");
        System.out.println("Gennaio ha " + giorni_mesi[6] + " giorni");
        System.out.println("Febbraio ha " + giorni_mesi[7] + " giorni");
        System.out.println("Marzo ha " + giorni_mesi[8] + " giorni");
        System.out.println("Gennaio ha " + giorni_mesi[9] + " giorni");
        System.out.println("Febbraio ha " + giorni_mesi[10] + " giorni");
        System.out.println("Marzo ha " + giorni_mesi[11] + " giorni");
        System.out.println(" ");

        int var_anno; // dichiarazione del calcolo

        var_anno = giorni_mesi[0] + giorni_mesi[1] + giorni_mesi[2] + // il calcolo
                giorni_mesi[3] + giorni_mesi[4] + giorni_mesi[5] +
                giorni_mesi[6] + giorni_mesi[7] + giorni_mesi[8] +
                giorni_mesi[9] + giorni_mesi[10] + giorni_mesi[11];

        System.out.println("Un anno è composto da " + var_anno + "giorni"); // quello che viene stampato su terminale

    }
}
