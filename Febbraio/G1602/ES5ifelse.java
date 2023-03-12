package Febbraio.G1602;

public class ES5ifelse {
    public static void main(String[] ifelse) {

        /*
         * da 0 a 8.125€: no tax area;
        da 8.126€ a 15.000€: 23%;
        da 15.001€ a 28.000€: 27% (della parte eccedente i 15mila euro) alla quale si aggiungono 3.450€, ovvero il 23% di 15mila euro;  
        da 28.001€ a 55.000€: 38% (della parte eccedente i 28mila euro) più 6.960€ (l’imposta dovuta per il reddito fino a 28mila euro);
        da 55.001€ a 75.000€: 41% (della parte eccedente i 55mila euro) più 17.220€ (imposta dovuta per il reddito fino a 55mila euro);
        oltre i 75.000€: 43% (della parte che supera i 75mila euro) alla quale si aggiungono 25.420€ (imposta dovuta per il reddito che non oltrepassa questa soglia).
         */
        int ral;
        double tassa;
        double quota;
       
        String rientra;
        
        ral = 20000;
        
       
        
         if ( ral<=8125 ){
            rientra = " Quindi: No tax area ";
            System.out.println(ral + rientra );

        }else if(ral > 8125 && ral <= 15000) {
            rientra=" Prima fascia. Tassazione 23% "; 
            System.out.print(ral+rientra);
            tassa = 0.23;
            quota = ral * tassa;
            System.out.println(quota);

        }else if(ral > 15000 && ral <= 28000) { 
            rientra=" Seconda fascia. Tassazione: 27% "; 
            System.out.print(ral+rientra);
            tassa = 0.27;
            quota = ral * tassa;
            System.out.println(quota);

        }else if(ral > 28000 && ral <= 55000){ 
            rientra = " Terza fascia- tassazione 38%";
            System.out.println(ral + rientra);
            tassa = 0.38;
            quota = ral * tassa;
            System.out.println(quota);

        }else if(ral > 55000 && ral <= 75000) { 
            rientra=" Quarta fascia. Tassazione: 41% "; 
            System.out.print(ral+rientra);
            tassa = 0.41;
            quota = ral * tassa;
            System.out.println(quota);

        }else if(ral > 75000){ 
            rientra = " Quinta ed ultima fascia. Tassazione 43%";
            System.out.println(ral + rientra);
            tassa = 0.43;
            quota = ral * tassa;
            System.out.println(quota);
        }
        
    }
}
