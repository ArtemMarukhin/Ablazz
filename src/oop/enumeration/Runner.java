package oop.enumeration;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Country.ARGENTINA.getName());
        System.out.println(Country.GRECEE.getPeopleCount());
        System.out.println(Arrays.toString(Country.values()));

        System.out.println(Country.valueOf("JAPAN").getPeopleCount());

    }

    public static CountryOld[] getCountries(){
        CountryOld[] countries = new CountryOld[3];
        countries[0] = new CountryOld("Япония", 140000000, "Японсикй");
        countries[1] = new CountryOld("Греция", 10000000, "Греческий");
        countries[2] = new CountryOld("Аргентина", 47000000, "Испанский");
        return countries;
    }
}
