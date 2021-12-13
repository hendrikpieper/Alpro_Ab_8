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
                maximalWert[1][0] = i;
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
                    minimalWert[1][0] = i;
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
                    hoechstWert[2][0] = i;
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
                nidrigsterWert[2][0] = i;
            }
        }
        return nidrigsterWert;
    }

    public void datenDruckenArrayArray(int[][] zudrucken){
        System.out.println(Arrays.toString(zudrucken));
    }


}





