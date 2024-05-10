package ec.com.linkedinlearning.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Steve
 */
public class ArrayListVsLinkedList {

    private static final int LIM = 10000000;

    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < LIM; i++) {
            Integer num = r.nextInt(LIM);
            arrayList.add(num);
            linkedList.add(num);
        }
        getCompare(arrayList, linkedList, 0);
        getCompare(arrayList, linkedList, LIM / 4);
        getCompare(arrayList, linkedList, LIM / 2);
        getCompare(arrayList, linkedList, 3 * LIM / 4);
        getCompare(arrayList, linkedList, LIM - 1);
    }

    public static void getCompare(List<Integer> arrayList, List<Integer> linkedList, int position) {
        System.out.println("Ger Compare, position: " + position);

        long milisA = System.currentTimeMillis();
        arrayList.get(position);
        long milisB = System.currentTimeMillis();
        System.out.println("arrayList.get(" + position + "): " + (milisB - milisA));

        long milisC = System.currentTimeMillis();
        linkedList.get(position);
        long milisD = System.currentTimeMillis();
        System.out.println("linkedList.get(" + position + "): " + (milisD - milisC));
    }

}
