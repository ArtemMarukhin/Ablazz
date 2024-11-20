package oop.record;

import java.util.Objects;

public class Human {
    private final int birtYear;
    private final String name;
    private final String surname;
    private final String lastname;


    public Human(int birtYear, String name, String surname, String lastname) {
        this.birtYear = birtYear;
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        System.out.println("Hello");
    }

    public int getBirtYear() {
        return birtYear;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birtYear == human.birtYear && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(lastname, human.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birtYear, name, surname, lastname);
    }

    @Override
    public String toString() {
        return "Human{" +
                "birtYear=" + birtYear +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
