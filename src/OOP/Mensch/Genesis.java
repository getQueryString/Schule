// Copyright© by getQueryString/Fin

package OOP.Mensch;

public class Genesis {
	
/*	public final BRAUN = "Braun";
	public final BLOND = "BLOND";
	public final SCHWARZ = "SCHWARZ";*/
	
	/*public final M = 'M';
	public final W = 'W';*/

    enum Haarfarbe {BRAUN, BLOND, SCHWARZ,}

    //enum Geschlecht {		M,		W	}

    public static void main(String... args) {
		/*
		private String name;
		private	int alter;
		private char geschlecht;
		private double groesse;
		private double gewicht;
		private String haarfarbe;
		*/
        Mensch fin = new Mensch("Fin", 20, 'M', 1.7, 60, Haarfarbe.BRAUN.toString());
        fin.sprechen();
        System.out.println(fin.name);
    }
}
