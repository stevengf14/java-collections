package ec.com.linkedinlearning.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steve
 */
public class ArraysVsLists {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2};
        String[] words = {"pencil", "pen", "eraser"};

        char[] arrayLetters = new char[5];
        arrayLetters[0] = 'h';
        arrayLetters[1] = 'e';
        arrayLetters[2] = 'l';
        arrayLetters[3] = 'l';
        arrayLetters[4] = 'o';

        List<Character> listLetters = new ArrayList<>();
        listLetters.add('h');
        listLetters.add('e');
        listLetters.add('l');
        listLetters.add('l');
        listLetters.add('o');

        System.out.println(arrayLetters.length);
        System.out.println(listLetters.size());

        System.out.println(arrayLetters[2]);
        System.out.println(listLetters.get(2));

        listLetters.add(0, 'i');
        listLetters.add('j');
        System.out.println(listLetters.size());
    }
}
