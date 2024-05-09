package ec.com.linkedinlearning.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Steve
 */
public class ListManipulation {

    public static void main(String[] args) {
        List<Character> lettersList = new ArrayList<>();
        for (Character letter : "aeiou1234".toCharArray()) {
            lettersList.add(letter);
        }
        System.out.println(lettersList);
        lettersList.removeIf(letter -> (Character.isDigit(letter)));
        System.out.println(lettersList);

        Integer[] numbers = new Integer[]{3, 5, 7, 1, 2, 3, 9, 0};
        List<Integer> numbersList = Arrays.asList(numbers);
        System.out.println(numbersList);
        numbersList.sort(Comparator.naturalOrder());
        System.out.println(numbersList);

        while (!lettersList.isEmpty()) {
            lettersList.remove(0);
            System.out.println(lettersList);
        }
    }
}
