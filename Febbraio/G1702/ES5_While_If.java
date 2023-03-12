package Febbraio.G1702;


public class ES5_While_If {
    public static void main(String[] args) {
        int alunni = 5;
        int contatore = 0;
        String[] alunno_cog_nome = {" Lucia Spina"," Francesco Sorrentino"," Giovanni DeLucia"," Umberto Rossi"," Carola DePadova",
             " Michele Sorrentino"," Luca Spina"," Sergio Gastardello"," Michele Bonoli", " Marco Bonanima"};
                                        
                                        
        if(alunni <=4){
                System.out.println("Lezione annullata: numero di alunni minimi non raggounto (5)");
               }  

        while(alunni >=5 && alunni <=10) { 
            
         
            if(alunni == 5){
                System.out.println("Alunni: " + alunno_cog_nome[0] + alunno_cog_nome[1] + alunno_cog_nome[2] + alunno_cog_nome[3] + alunno_cog_nome[4]);

                } else if (alunni==6){
                    System.out.println(alunno_cog_nome[5]);
                
                } else if (alunni==7){
                    System.out.println(alunno_cog_nome[6]);
                
                }else if(alunni==8){
                  System.out.println( alunno_cog_nome[7]);
                
                } else if(alunni  == 9){
                  System.out.println( alunno_cog_nome[8]);
                
                } else if (alunni == 10){
                  System.out.println(alunno_cog_nome[9]);
                
                };

          
            alunni++; //10
            //System.out.println("alunni:" + alunni );
         
           
        } 
        System.out.println("La classe è composta da " + --alunni + " alunni");
        //System.out.println("alunni vale:" + alunni);
    } 
}   
