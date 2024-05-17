package ec.com.linkedinlearning.collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Steve
 */
public class ClassHashMap {

    public static void main(String[] args) {
        Map<Character, String> abc = new HashMap<>();
        abc.put('A', "airplane");
        abc.put('B', "baby");
        abc.put('C', "cash");
        abc.put('D', "delay");
        abc.put('E', "example");
        abc.put('Q', "queue");
        abc.put('R', "rain");
        System.out.println("Table: " + abc);

    }
}
