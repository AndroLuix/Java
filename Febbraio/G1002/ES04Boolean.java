package Febbraio.G1002;

public class ES04Boolean {
    public static void main(String[] args) {

        /*
    Esercizi:
    
    1. tutti i voti sono maggiori di 6, visualizzare a video "l'allievo è promosso"
    
    2. almeno 2 voti sono maggiori di 6, visualizzare a video "l'allievo è promosso"
    
    3. se la media dei voti è superiore o uguale a 24, visualizzare a video "l'allievo è promosso"

    */




// dichiarazioni variabili booleane
    boolean voto1;
    boolean voto2;
    boolean voto3;
    boolean voto4;
    
    boolean voto_media;
    boolean ammesso_esame;
    
    // dichiarazione variabili intere
    int voto_a = 6;
    int voto_b = 7;
    int voto_c = 4;
    int voto_d = 9;
    
    
    //utilizzo operatori aritmetici, relazionali e logici, stampo a schermo i risultati
    voto1 = voto_a < voto_b;
    
    System.out.println(voto1);
    
    voto2 = voto_b > voto_c;
    
    System.out.println(voto2);
    
    voto3 = voto_c != voto_d;
    
    System.out.println(voto3);
    
    voto4 = voto_d > voto_a;
    
    System.out.println(voto4);
    
    voto_media = voto1 && voto2 && voto3 && voto4;
    
    System.out.println(voto_media);
    
    ammesso_esame = voto_media == true;
    
    System.out.println(ammesso_esame);




    
}
}
