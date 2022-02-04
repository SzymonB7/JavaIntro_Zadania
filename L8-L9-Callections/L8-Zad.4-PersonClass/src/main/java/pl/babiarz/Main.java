package pl.babiarz;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Person korneliusz = new Person("Korneliusz", "Baryłka",1975,175,88);
        Person antoni = new Person ("Antoni", "Padalec", 1968,172,73);
        Person genowefa = new Person("Genowefa","Grzyb",1985,165,61);
        Person jerzy = new Person("Jerzy","Gowryłło", 1987,185,78);

        Set<Person> people = new TreeSet<>();
        people.add(genowefa);
        people.add(korneliusz);
        people.add(jerzy);
        people.add(antoni);

        Set<Person> peopleByHeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getHeight(),o2.getHeight());
            }
        });

        peopleByHeight.addAll(people);

        Set<Person> peopleByWeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(-o1.getWeight(),-o2.getWeight());
            }
        });

        peopleByWeight.addAll(people);


        for (Person person:peopleByHeight) {
            System.out.println(person.getName());
        }

        System.out.println("-----------");

        for (Person person:peopleByWeight) {
            System.out.println(person.getName());
        }

        System.out.println("-----------");

        for (Person person:people) {
            System.out.println(person.getName());
        }
    }
}
