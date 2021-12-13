package A3;
import A3.Berechnung;
import A3.Daten;

public class Main {
    public static void main(String[] args) {
        Berechnung berechnung = new Berechnung();
        Daten daten = new Daten();
        berechnung.datenDruckenArrayArray(daten.temperaturesOverTheWeek);
    }
}
