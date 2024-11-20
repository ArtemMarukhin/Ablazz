package oop.inharitance.lesson9.practice2;

public class Country {

    private String language;

    private int humanCount;

    private String continent;

    public Country(String language, int humanCount, String continent) {
        this.language = language;
        this.humanCount = humanCount;
        this.continent = continent;
    }

    public String getLanguage() {
        return language;
    }

    public int getHumanCount() {
        return humanCount;
    }

    public String getContinent() {
        return continent;
    }
}
