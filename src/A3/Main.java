package A3;

public class Main {
    public static void main(String[] args) {
        Berechnung berechnung = new Berechnung();
        Daten daten = new Daten();
        int[][] montag = berechnung.hoechsterTagesWert(0, daten.temperaturesOverTheWeek);
        int[][] woche = berechnung.hoechsterWochenWert(daten.temperaturesOverTheWeek);
        berechnung.datenDruckenArrayArray(woche);
        berechnung.datenDruckenArrayArray(montag);
        berechnung.datenDruckenArrayArray(berechnung.hoechsterTagesWert(1, daten.temperaturesOverTheWeek));
        berechnung.datenDruckenArrayArray(berechnung.niedrigsterTagesWert(3, daten.temperaturesOverTheWeek));
        berechnung.druckeDurchschnittsTemperatur(berechnung.wochenDurchschnittsTemperatur(daten.temperaturesOverTheWeek));
        berechnung.druckeDurchschnittsTemperatur(berechnung.tagesDurchschnittsTemperatur(4, daten.temperaturesOverTheWeek));
    }
}


