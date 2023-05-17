// Copyright© by getQueryString/Fin

package OOP.Geister;

import java.util.ArrayList;

public class Geisterhaus {

    private ArrayList<Gespenst> gespensterEinwohner = new ArrayList<>();

    public void einziehen(Gespenst g) {
        if (gespensterEinwohner.contains(g)) {
            System.out.println("Weg mit dir, " + g.getName() + "!");
        } else {
            gespensterEinwohner.add(g);
            System.out.println(g.getName() + " zieht ein!");
        }
    }

    public void ausziehen(Gespenst g) {
        if (gespensterEinwohner.contains(g)) {
            gespensterEinwohner.remove(g);
            System.out.println(g.getName() + " zieht aus!");
        } else {
            System.out.println(g.getName() + " ist kein Einwohner dieses Geisterhauses!");
        }
    }

    public void geisterstunde(int spukCount) {
        switch (gespensterEinwohner.size()) {
            case 0 -> System.out.println("Im Haus spukt kein Geist.");
            case 1 -> System.out.println("Im Haus spukt ein Geist.");
            default -> System.out.println("Im Haus spuken " + gespensterEinwohner.size() + " Geister.");
        }

        for (Gespenst gespenst : gespensterEinwohner) {
            gespenst.spuken(spukCount);
        }
    }
}