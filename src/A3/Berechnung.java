package A3;
import java.util.Arrays;


public class Berechnung {       //Funktion für den höchsten Tageswert
     public int[][] hoechsterTagesWert(int tag, int[][] daten){
        int[][] maximalWert = new int[2][1];
        maximalWert[0][0] = daten[tag][0];
        maximalWert[1][0] = 0;
        for(int i = 0; i < daten[tag].length; i++) {
            if (daten[tag][i] > maximalWert[0][0]) {
                maximalWert[0][0] = daten[tag][i];
                maximalWert[1][0] = i+1;
            }
        }
        return maximalWert;
    }
        //Funktion für den niedrigsten Tageswert
        public int[][] niedrigsterTagesWert(int tag, int[][] daten){
            int[][] minimalWert = new int[2][1];
            minimalWert[0][0] = daten[tag][0];
            minimalWert[1][0] = 0;
            for(int i = 0; i < daten[tag].length; i++) {
                if (daten[tag][i] > minimalWert[0][0]) {
                    minimalWert[0][0] = daten[tag][i];
                    minimalWert[1][0] = i+1;
                }
            }
            return minimalWert;
        }

    public int[][] hoechsterWochenWert(int[][] daten){
        int[][] hoechstWert = new int[3][1];
        hoechstWert[0][0] = daten[0][0];
        hoechstWert[1][0] = 0;
        hoechstWert[2][0] = 0;
        for(int i = 0; i < daten.length; i++) {
            int[][] vergleichsWert = hoechsterTagesWert(i, daten);
            if (vergleichsWert[0][0] > hoechstWert[0][0]) {
                    hoechstWert[0][0] = vergleichsWert[0][0];
                    hoechstWert[1][0] = vergleichsWert[1][0];
                    hoechstWert[2][0] = i+1;
            }
        }
        return hoechstWert;
    }

    public int[][] nidrigsterWochenWert(int[][] daten){
        int[][] nidrigsterWert = new int[3][1];
        nidrigsterWert[0][0] = daten[0][0];
        nidrigsterWert[1][0] = 0;
        nidrigsterWert[2][0] = 0;
        for(int i = 0; i < daten.length; i++) {
            int[][] vergleichsWert = hoechsterTagesWert(i, daten);
            if (vergleichsWert[0][0] < nidrigsterWert[0][0]) {
                nidrigsterWert[0][0] = vergleichsWert[0][0];
                nidrigsterWert[1][0] = vergleichsWert[1][0];
                nidrigsterWert[2][0] = i+1;
            }
        }
        return nidrigsterWert;
    }

    public void datenDruckenArrayArray(int[][] zudrucken){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < zudrucken.length; i++){
            if(i == 0){
                sb.append("Es waren: ");
                sb.append(zudrucken[0][0]);
                sb.append(" Grad, um ");
            }
            else if(i == 1){
                sb.append(zudrucken[1][0]);
                sb.append("Uhr.");
            }
            else if(i == 2){
                sb.append(" Am ");
                sb.append(zudrucken[2][0]);
                sb.append(" Tag.");
            }
        }
        System.out.println(sb);
    }


}





