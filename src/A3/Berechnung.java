package A3;
import java.util.Arrays;


public class Berechnung {
    //Funktion für den höchsten Tageswert und gibt ein Array mit den Daten zurück

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
    //Funktion für den höchsten WochenWert, zurückgegeben werden Wert, Uhrzeit
    // und Wochentag, in einem Array
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
    //Wie oben nur für den nidrigsten WochenWert
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
    // Berechnet Durchschnittstemperatur einer Tages und gibt diese mit Uhrzeit
    // zurück
    public double[][] tagesDurchschnittsTemperatur(int tag, int[][] daten){
         double[][] rueckgabe = new double[2][1];
         double gesamtTemperatur = daten[tag][0];
        rueckgabe[1][0] = tag;
         rueckgabe[0][0] = gesamtTemperatur;
         for(int i = 1; i < daten[tag].length; i++){
             gesamtTemperatur += daten[tag][i];
         }
         rueckgabe[0][0] = (gesamtTemperatur / (daten[tag].length));
         return rueckgabe;
    }

    public double[][] wochenDurchschnittsTemperatur(int[][] daten){
        double[][] rueckgabe = new double[2][1];
        double gesamtTemperatur = 0;
        rueckgabe[0][0] = gesamtTemperatur;
        int anzahlMessungen = 0;
         for(int i = 0; i < daten.length; i++){
             for(int j = 0; j < daten[i].length; j++){
                 gesamtTemperatur += daten[i][j];
                 anzahlMessungen += 1;
             }
         }
         rueckgabe[0][0] = (gesamtTemperatur/anzahlMessungen);
         rueckgabe[1][0] = 0;
         return rueckgabe;
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
                sb.append(wochenTag(zudrucken[2][0]));
                sb.append(".");
            }
        }
        System.out.println(sb);
    }

    public void druckeDurchschnittsTemperatur(double[][] zudrucken){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < zudrucken.length; i++){
            if(i == 0){
                sb.append("Die Durchschnittstemperatur beträgt: ");
                sb.append(zudrucken[0][0]);
                sb.append(" Grad. ");
            }
            else if(i == 1){
                if(zudrucken[1][0] > 0){
                    sb.append("Am ");
                    sb.append(wochenTag(zudrucken[1][0]));
                    sb.append(".");
                }
            }
        }
        System.out.println(sb);
    }
    public String wochenTag(double eingabe){
         if(eingabe == 0){
             return "Montag";
         }
         else if(eingabe == 1){
            return "Dienstag";
         }
         else if(eingabe == 2){
             return "Mittwoch";
         }
         else if(eingabe == 3){
             return "Donnerstag";
         }
         else if(eingabe == 4){
             return "Freitag";
         }
         else if(eingabe == 5){
             return "Samstag";
         }
         else if(eingabe == 6){
             return "Sonntag";
         }
         else{
             return "Hah, da ist ein neuer Wochentag!";
         }

    }
}





