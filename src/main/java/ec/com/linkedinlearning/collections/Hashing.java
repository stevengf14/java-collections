package ec.com.linkedinlearning.collections;

/**
 *
 * @author Steve
 */
public class Hashing {

    public static void main(String[] args) {
        Character letter = 'A';
        System.out.println(letter.hashCode());

        String word = "hello";
        System.out.println(word.hashCode());

        Integer number = 3;
        System.out.println(number.hashCode());

        Person p = new Person("Juan", "Perez");
        System.out.println(p.hashCode());
    }
}
