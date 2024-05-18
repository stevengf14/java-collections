package ec.com.linkedinlearning.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Steve
 */
public class CollectionsClass {

    private static final int LIM = 100;

    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> col = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            col.add(r.nextInt(LIM));
        }

        System.out.println("col: " + col);
        System.out.println("max: " + Collections.max(col));
        System.out.println("min:" + Collections.min(col));
        Collections.reverse(col);
        System.out.println("reverse: " + col);
        Collections.sort(col);
        System.out.println("sort: " + col);
        col.sort(Comparator.naturalOrder());
        System.out.println("other sort: " + col);
        Collections.shuffle(col);
        System.out.println("suffle:" + col);
        Collections.swap(col, 0, 1);
        System.out.println("swap: " + col);
    }
}
