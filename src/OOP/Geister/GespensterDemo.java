// Copyright© by getQueryString/Fin

package OOP.Geister;

public class GespensterDemo {

    public static void main(String[] args) {
        Gespenst blutigerBaron = new Gespenst("Bluter Baron", "Rassel!");
        Gespenst maulendeMyrte = new Gespenst("Maulende Myrte", "Seufz!");
        Gespenst fastKopfloserNick = new Gespenst("Fast kopfloser Nick", "Buh!");

        Geisterhaus heulendeHuette = new Geisterhaus();

        heulendeHuette.einziehen(blutigerBaron);
        heulendeHuette.einziehen(maulendeMyrte);
        heulendeHuette.geisterstunde(4);
        heulendeHuette.ausziehen(blutigerBaron);

        heulendeHuette.ausziehen(fastKopfloserNick);

        /*System.out.println(blutigerBaron.getSpukImpact());

        blutigerBaron.spuken(10);
        maulendeMyrte.spuken(2);
        fastKopfloserNick.spuken(2);

        System.out.println(blutigerBaron.getSpukImpact());*/
    }
}