package ec.com.linkedinlearning.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Steve
 */
public class ArraysClass {

    public static void main(String[] args) {
        String[] array = new String[]{
            "blue", "green", "yellow", "red", "white"
        };
        List<String> list = Arrays.asList(array);
        // List<String> list = Arrays.asList("blue", "green", "yellow", "red", "white");

        // list.add("black");
        System.out.println(list);

        List<String> newList = new ArrayList<>(list);
        System.out.println("New list: " + newList);

        List<String> directList = new ArrayList<>(Arrays.asList("blue", "green", "yellow", "red", "white"));
        System.out.println("Direct List: " + directList);

        list.set(2, "purple");
        System.out.println("List: " + list);
        newList.add("black");
        System.out.println("New list: " + newList);

        List<String> listOf = List.of("blue", "green");
        System.out.println("List of: " + listOf);

        String[] copy = Arrays.copyOf(array, 2);
        System.out.println("Copy: " + copy);
        System.out.println(Arrays.toString(copy));

        String[] other = list.toArray(new String[0]);
        System.out.println("Other before: " + Arrays.toString(other));
        Arrays.sort(other);
        System.out.println("Other after: " + Arrays.toString(other));

        int posBlack = Arrays.binarySearch(other, "black");
        System.out.println("Pos black: " + posBlack);
        int posRed = Arrays.binarySearch(other, "red");
        System.out.println("Pos red: " + posRed);
    }
}
