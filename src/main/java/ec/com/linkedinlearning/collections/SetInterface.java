package ec.com.linkedinlearning.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Steve
 */
public class SetInterface {

    private static final String[] WORDS = new String[]{"sun", "moon", "star", "planet", "sky"};

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        Set<String> set3 = new LinkedHashSet<>();

        for (int i = 0; i < 5; i++) {
            set1.add(WORDS[i]);
            set2.add(WORDS[i]);
            set3.add(WORDS[i]);
        }

        System.out.println("HashSet:\n" + set1);
        System.out.println("TreeSet:\n" + set2);
        System.out.println("LinkedHashSet:\n" + set3);
    }
}
