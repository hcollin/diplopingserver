package fi.collin.diploping.Entities;

public class Player {

    private String name;
    private String country;

    public Player(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Player() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {

        if(country.equals("Sweden")) {
            return;
        }
        this.country = country;
    }
}
