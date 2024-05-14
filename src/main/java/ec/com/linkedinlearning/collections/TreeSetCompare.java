package ec.com.linkedinlearning.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Steve
 */
public class TreeSetCompare {

    public static void main(String[] args) {
        Person p1 = new Person("Martha", "Perez");
        Person p2 = new Person("Pablo", "Gomez");
        Person p3 = new Person("Laura", "Lopez");

        Set<Person> friends = new TreeSet<>();
        friends.add(p1);
        friends.add(p2);
        friends.add(p3);
        System.out.println(friends);
    }
}
