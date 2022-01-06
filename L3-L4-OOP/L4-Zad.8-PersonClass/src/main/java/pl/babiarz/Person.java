package pl.babiarz;

import java.util.Objects;

public class Person {
    private final String name;
    private final String lastName;
    private final int yearBorn;

    public Person(String name, String lastName, int yearBorn) {
        this.name = name;
        this.lastName = lastName;
        this.yearBorn = yearBorn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yearBorn == person.yearBorn && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, yearBorn);
    }
}
