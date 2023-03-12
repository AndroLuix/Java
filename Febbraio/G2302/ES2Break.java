package Febbraio.G2302;

public class ES2Break {
    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            System.out.println(i);
            if (i==10){
                System.out.println(i);
                break;
            }
        }
    }
}
