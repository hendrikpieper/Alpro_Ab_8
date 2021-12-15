package A3;
import A3.Berechnung;
import A3.Daten;

public class Main {
    public static void main(String[] args) {
        Berechnung berechnung = new Berechnung();
        Daten daten = new Daten();
        int[][] montag = berechnung.hoechsterTagesWert(0, daten.temperaturesOverTheWeek);
        int[][] woche = berechnung.hoechsterWochenWert(daten.temperaturesOverTheWeek);
        berechnung.datenDruckenArrayArray(woche);
    }
}
