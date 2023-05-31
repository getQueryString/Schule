// Copyright© by getQueryString/Fin

package OOP.Mensch;

public class Mensch {

    char geschlecht;
    double groesse;
    double gewicht;
    String name;
    int alter;
    String haarfarbe;

    public Mensch(String name, int alter, char geschlecht, double groesse, double gewicht, String haarfarbe) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.groesse = groesse;
        this.gewicht = gewicht;
        this.haarfarbe = haarfarbe;
    }


    public void sprechen() {
        System.out.println("Hallo, " + this.name + "! Du bist " + this.alter + " Jahre alt.\n"
                + "Geschlecht: " + geschlecht + "\n"
                + "Groesse: " + groesse + " m\n"
                + "Gewicht: " + gewicht + " kg\n"
                + "Haarfarbe: " + haarfarbe);
    }
}
