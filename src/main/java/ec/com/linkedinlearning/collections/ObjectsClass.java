package ec.com.linkedinlearning.collections;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Steve
 */
public class ObjectsClass {

    private static final int LIM = 10;

    public static void main(String[] args) {
        Random r = new Random();
        int[] l1 = new int[LIM];
        int[] l2 = new int[LIM];

        for (int i = 0; i < LIM; i++) {
            Integer num = r.nextInt(LIM);
            l1[i] = num;
            l2[i] = num;
        }
        System.out.println("l1 and l2 equals? " + l1.equals(l2));
        System.out.println("l1 an l2 deep equals? " + Objects.deepEquals(l1, l2));

        Object n = null;
        // System.out.println(n.hashCode());
        System.out.println(Objects.hashCode(n));

        Dummy hello = new Dummy("hello");
        System.out.println(hello.something());
        Dummy isNull = new Dummy(null);
        // System.out.println(isNull.something());

        if (Objects.isNull(isNull)) {
            System.out.println("Don't do anything");
        }
    }
}

class Dummy {

    private String thing;

    public Dummy(String thing) {
        this.thing = thing;
    }

    public int something() {
        return thing.length();
    }

}
