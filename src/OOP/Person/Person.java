// Copyright© by getQueryString/Fin

package OOP.Person;

public class Person {

    private String name;
    private char sex;
    private String geburtsOrt;
    private int personalNummer;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, char sex, String geburtsOrt, int personalNummer) {
        this.name = name;
        this.sex = sex;
        this.geburtsOrt = geburtsOrt;
        this.personalNummer = personalNummer;
    }

    // Getter & Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return this.sex;
    }


    public void setGeburtsOrt(String geburtsOrt) {
        this.geburtsOrt = geburtsOrt;
    }

    public String getGeburtsOrt() {
        return this.geburtsOrt;
    }


    public void setPersonalNummer(int personalNummer) {
        this.personalNummer = personalNummer;
    }

    public int getPersonalNummer() {
        return this.personalNummer;
    }


    public void printEverything() {
        System.out.println("Name :" + this.name + "\n" +
                "Geschlecht : " + this.sex + "\n" +
                "Geburtsort : " + this.geburtsOrt + "\n" +
                "Personalnummer: " + this.personalNummer);
    }

    public void printName() {
        System.out.println(this.name);
    }
}

