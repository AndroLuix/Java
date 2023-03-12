package Febbraio.G1002;

public class ES7not {
    public static void main(String[] args) {

        boolean var_vero = true;
        boolean var_falso = false;

        boolean var_risultato_not = !(var_vero || var_falso); // ! (true) //si mette traparentesi: (var_vero ||
                                                              // var_falso) per dare precedenza a quest'operazione. E
                                                              // poi si svolge l'operazione NOT (!)

        System.out.println("var_risultato_not:" + var_risultato_not);
        System.out.println("var_vero:" + var_vero);
        System.out.println("var_falso:" + var_falso);

    }
}
