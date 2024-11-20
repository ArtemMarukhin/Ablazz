package oop.enumeration;

public class Example {
    public static void main(String[] args) {
        CountryOld[] countries = Runner.getCountries();
        for (CountryOld country : countries) {
            if (country.getName().equals("Греция")){
                country.getPeopleCount();
            }
        }

    }
}
