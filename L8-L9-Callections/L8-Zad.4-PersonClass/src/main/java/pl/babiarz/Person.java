package pl.babiarz;

import java.time.LocalDate;

public class Person implements Comparable<Person>{
    private final String name;
    private final String lastName;
    private final int yearOfBirth;
    private final int height;
    private final int weight;


    public Person(String name, String lastName, int yearOfBirth, int height, int weight) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(LocalDate.now().getYear() - this.yearOfBirth, LocalDate.now().getYear() - o.yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }


}
