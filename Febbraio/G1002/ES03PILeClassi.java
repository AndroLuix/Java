package Febbraio.G1002;

import java.util.function.Function;

public class ES03PILeClassi {
        public static void main(String[] args) {

                boolean ris;
                String name = "Luigi";
                String name0 = "Luigi";

                ris = name0 != name;

                // System.out.println( "Risultato del primo booleano:"+ris);

                ris = name0 == name;
                System.out.println("Risultato del secondo booleano:" + ris);
                System.out.println("");

                String paesi[] = { "Italia ", "Francia ", "Germania " };
                System.out.println("Paesi richiamati: " + paesi[0] + paesi[1] + paesi[2]);

                int abitanti[] = { 68000000, 51000000, 65000000 };

                // System.out.println("Numero di abitanti per paese: " + paesi[0] + abitanti[0]
                // );
                // System.out.println("Numero di abitanti per paese: " + paesi[1] +
                // abitanti[1]);
                // System.out.println("Numero di abitanti per paese: " + paesi[2] +
                // abitanti[3]);

                int italiaAbitanti = 59000000, franciaAbitanti = 67000000, germaniaAbitanti = 84000000;

                boolean calcolo;
                calcolo = italiaAbitanti > franciaAbitanti;

                System.out.println(
                                "Abitanti per Nazione | Italia: " + italiaAbitanti + " Francia: " + franciaAbitanti
                                                + " Germania: "
                                                + germaniaAbitanti);
                System.out.println("Italia ha più abitanti della Francia?:" + calcolo);

                calcolo = germaniaAbitanti > italiaAbitanti;

                System.out.println("Germania ha più abitanti dell'Italia?:" + calcolo);

                // PIL ProCapite USD
                double PilItalia = 34.321, PilFrancia = 42.953, PilGermania = 47.662;
                // Crescita PIL PP; (dati ITA 6.6 FRA 7.09 GER 7.5)
                double crescitaItalia = 0.66, crescitaFrancia = 0.709, crescitaGermania = 0.75;

                boolean pilItaFra;
                boolean pilFraGer;
                boolean pilGerIta;

                pilItaFra = PilItalia > PilFrancia;
                pilFraGer = PilFrancia < PilGermania;
                pilGerIta = PilGermania > PilItalia;

                System.out.println("");
                System.out.println(
                                "GDP per capita per Nazione | Italia GDP: " + PilItalia + " Francia GDP: " + PilFrancia
                                                + " Germania GDP: " + PilGermania);
                // System.out.println("Italia "+ PilItalia +" Francia "+ PilFrancia + " Germania
                // " + PilGermania);
                System.out.println(" GDP p.c. ITA > GDP p.c. FRA " + pilItaFra);
                System.out.println(" GDP p.c. FRA < GDP p.c. GER " + pilFraGer);
                System.out.println(" GDP p.c. GER > GDP p.c. ITA " + pilGerIta);
                System.out.println("");

                // System.out.println("Crescita per tasso di crescita per ogni Nazione| PIL 2024
                // ITA: ");

                double italia2024 = PilItalia * crescitaItalia, PilFrancia2024 = PilFrancia * crescitaFrancia,
                                PilGermania2024 = PilGermania * crescitaGermania;

                char dol = '$';

                System.out.println(
                                " Crescita per tasso di crescita per ogni Nazione|  PIL 2024 ITA: " + italia2024 + dol
                                                + "| PIL 2024 FRA: " + PilFrancia2024 + dol + " |  PIL 2024 GER: "
                                                + PilGermania2024 + dol);

                double gdp_cittadino_Ita = PilItalia % italiaAbitanti,
                                gdp_cittadino_Ger = PilGermania % germaniaAbitanti,
                                gdp_cittadino_fra = PilFrancia % franciaAbitanti;
                System.out.println("");
                System.out.println("Media GDP per cittadino per anno   | ITA: " + gdp_cittadino_Ita + dol + " |  GER: "
                                + gdp_cittadino_Ger + dol + " |  FRA: " + gdp_cittadino_fra + dol);
                System.out.println("");

                // verificare classe
                double reddito40K = 40.000;
                double reddito20K = 20.000;
                double reddito10K = 10.000;

                boolean redditoSuperiroe40K;
                boolean redditoSuperiroe20K;
                boolean redditoSuperiroe10K;

                boolean classeA;
                boolean classeB;
                boolean classeC;
                boolean redditoClasseC;
                boolean redditoClasseB;
                boolean redditoClasseA;

                redditoSuperiroe40K = reddito40K > 10.000;
                redditoSuperiroe20K = reddito20K > 10.000;
                redditoSuperiroe10K = reddito10K > 10.000;

                classeA = redditoSuperiroe40K && redditoSuperiroe20K;
                classeB = redditoSuperiroe40K && redditoSuperiroe10K;
                classeC = redditoSuperiroe20K && redditoSuperiroe10K;

                // classeA = true && true;

                // classeB = true && false;
                // classeC = true && false;

                redditoClasseC = classeA || classeB || classeC;

                // redditoClasseC = true || false || false;

                // redditoClasseB = classeA || classeB || classeC;

                // redditoClasseB = true || false || false;

                // redditoClasseA = classeA || classeB || classeC;

                // redditoClasseA = true || false || false;

                System.out.println("Le tutte e tre Nazioni fanno parte della classe C?: " + redditoClasseC);

                redditoSuperiroe40K = reddito40K > 40.000;
                redditoSuperiroe20K = reddito20K > 40.000;
                redditoSuperiroe10K = reddito10K > 40.000;

                classeA = redditoSuperiroe40K && redditoSuperiroe20K;
                classeB = redditoSuperiroe40K && redditoSuperiroe10K;
                classeC = redditoSuperiroe20K && redditoSuperiroe10K;

                redditoClasseA = classeA || classeB || classeC;

                // redditoClasseC = true || false || false;

                // redditoClasseB = classeA || classeB || classeC;

                // redditoClasseB = true || false || false;

                // redditoClasseA = classeA || classeB || classeC;
                System.out.println("Le tutte e tre Nazioni fanno parte della classe C?: " + redditoClasseC);
              
        }
}
