// Copyright© by getQueryString/Fin

package OOP.Geister;

public class Gespenst {

    private String name;
    private String spukGeraeusch;
    private int spukImpact;

    public Gespenst() {
    }

    public Gespenst(String name, String spukGeraeusch) {
        this.name = name;
        this.spukGeraeusch = spukGeraeusch;
    }

    public void spuken(int count) {
        System.out.print(name + ":\t");
        for (int i = 0; i < count; i++) {
            System.out.print(spukGeraeusch + " ");
        }
        System.out.println();
        setSpukImpact(count);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSpukGeraeusch(String spukGeraeusch) {
        this.spukGeraeusch = spukGeraeusch;
    }

    public String getSpukGeraeusch() {
        return "Spruckgeraeusch von " + name + ": " + this.spukGeraeusch;
    }

    public void setSpukImpact(int spukImpact) {
        this.spukImpact = spukImpact;
    }

    public String getSpukImpact() {
        return "Impact von " + name + ": " + this.spukImpact;
    }
}