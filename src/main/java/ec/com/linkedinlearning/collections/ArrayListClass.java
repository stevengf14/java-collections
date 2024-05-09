package ec.com.linkedinlearning.collections;

import java.util.ArrayList;

/**
 *
 * @author Steve
 */
public class ArrayListClass {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(16);
        list.add("hello");
        list.trimToSize(); // size 1
        list.add("bye");
        list.ensureCapacity(1000); // size 1000
    }
}
