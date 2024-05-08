package ec.com.linkedinlearning.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.List;

/**
 *
 * @author Steve
 */
public class ListInterface {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();
        List<Integer> list4 = new Stack<>();

        for (int i = 0; i < 5; i++) {
            list1.add(i);
            list2.add(i);
            list3.add(i);
            list4.add(i);
        }

        System.out.println("list1: " + list1);
        list1.add(2, 5);
        System.out.println("list1.add(2, 5): " + list1);
        Integer num = list1.get(4);
        System.out.println("list1.get(4): " + num);
        System.out.println();

        System.out.println("list2: " + list2);
        list2.set(2, 5);
        System.out.println("list2.set(2, 5): " + list2);
        list2.remove(0);
        System.out.println("list2.remove(0): " + list2);
        System.out.println();

        System.out.println("list3: " + list3);
        System.out.println("list4: " + list4);
        list3.addAll(list4);
        System.out.println("list3.addAll(list4): " + list3);
        list3.addAll(2, list4);
        System.out.println("list3.addAll(2, list4): " + list3);
        System.out.println();

        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);
        listOfLists.add(list4);
        System.out.println(listOfLists);
    }
}
