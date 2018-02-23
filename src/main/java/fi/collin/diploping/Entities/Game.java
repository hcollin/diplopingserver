package fi.collin.diploping.Entities;

public class Game {

    private String name;

    private String pinEngland;
    private String pinFrance;
    private String pinGermany;
    private String pinItaly;
    private String pinAustria;
    private String pinRussia;
    private String pinTurkey;


    public Game(String name, String pinEngland, String pinFrance, String pinGermany, String pinItaly, String pinAustria, String pinRussia, String pinTurkey) {
        this.name = name;
        this.pinEngland = pinEngland;
        this.pinFrance = pinFrance;
        this.pinGermany = pinGermany;
        this.pinItaly = pinItaly;
        this.pinAustria = pinAustria;
        this.pinRussia = pinRussia;
        this.pinTurkey = pinTurkey;
    }

    public Game() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinEngland() {
        return pinEngland;
    }

    public void setPinEngland(String pinEngland) {
        this.pinEngland = pinEngland;
    }

    public String getPinFrance() {
        return pinFrance;
    }

    public void setPinFrance(String pinFrance) {
        this.pinFrance = pinFrance;
    }

    public String getPinGermany() {
        return pinGermany;
    }

    public void setPinGermany(String pinGermany) {
        this.pinGermany = pinGermany;
    }

    public String getPinItaly() {
        return pinItaly;
    }

    public void setPinItaly(String pinItaly) {
        this.pinItaly = pinItaly;
    }

    public String getPinAustria() {
        return pinAustria;
    }

    public void setPinAustria(String pinAustria) {
        this.pinAustria = pinAustria;
    }

    public String getPinRussia() {
        return pinRussia;
    }

    public void setPinRussia(String pinRussia) {
        this.pinRussia = pinRussia;
    }

    public String getPinTurkey() {
        return pinTurkey;
    }

    public void setPinTurkey(String pinTurkey) {
        this.pinTurkey = pinTurkey;
    }
}
