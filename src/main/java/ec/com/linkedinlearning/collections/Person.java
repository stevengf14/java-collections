package ec.com.linkedinlearning.collections;

/**
 *
 * @author Steve
 */
public class Person implements Comparable<Person> {

    protected String name;
    protected String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

    @Override
    public int compareTo(Person p) {
        int compareName = this.name.compareTo(p.getName());
        return compareName == 0 ? this.lastName.compareTo(p.getLastName()) : compareName;
    }

}
