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
//        getCompare(arrayList, linkedList, 0);
//        getCompare(arrayList, linkedList, LIM / 4);
//        getCompare(arrayList, linkedList, LIM / 2);
//        getCompare(arrayList, linkedList, 3 * LIM / 4);
//        getCompare(arrayList, linkedList, LIM - 1);

        addCompare(arrayList, linkedList, -1);
        addCompare(arrayList, linkedList, 0, -1);
        addCompare(arrayList, linkedList, LIM / 4, -3);
        addCompare(arrayList, linkedList, LIM / 2, -4);
        addCompare(arrayList, linkedList, 3 * LIM / 4, -5);
        addCompare(arrayList, linkedList, LIM - 1, -6);

        containsCompare(arrayList, linkedList, -2);
        containsCompare(arrayList, linkedList, -3);
        containsCompare(arrayList, linkedList, -4);
        containsCompare(arrayList, linkedList, -5);
        containsCompare(arrayList, linkedList, -6);
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

    public static void addCompare(List<Integer> arrayList, List<Integer> linkedList, int value) {
        System.out.println("Add Compare");

        long milisA = System.currentTimeMillis();
        arrayList.add(value);
        long milisB = System.currentTimeMillis();
        System.out.println("arrayList.add(): " + (milisB - milisA));

        long milisC = System.currentTimeMillis();
        linkedList.add(value);
        long milisD = System.currentTimeMillis();
        System.out.println("linkedList.add(): " + (milisD - milisC));

        System.out.println();
    }

    public static void addCompare(List<Integer> arrayList, List<Integer> linkedList, int position, int value) {
        System.out.println("Add Compare, position: " + position);

        long milisA = System.currentTimeMillis();
        arrayList.add(position, value);
        long milisB = System.currentTimeMillis();
        System.out.println("arrayList.add(" + position + "): " + (milisB - milisA));

        long milisC = System.currentTimeMillis();
        linkedList.add(position, value);
        long milisD = System.currentTimeMillis();
        System.out.println("linkedList.add(" + position + "): " + (milisD - milisC));

        System.out.println();
    }

    public static void containsCompare(List<Integer> arrayList, List<Integer> linkedList, int value) {
        System.out.println("Contains Compare, value: " + value);

        long milisA = System.currentTimeMillis();
        arrayList.contains(value);
        long milisB = System.currentTimeMillis();
        System.out.println("arrayList.contains(" + value + "): " + (milisB - milisA));

        long milisC = System.currentTimeMillis();
        linkedList.contains(value);
        long milisD = System.currentTimeMillis();
        System.out.println("linkedList.contains(" + value + "): " + (milisD - milisC));

        System.out.println();
    }

}
