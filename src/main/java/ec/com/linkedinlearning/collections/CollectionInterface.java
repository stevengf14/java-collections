package ec.com.linkedinlearning.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author Steve
 */
public class CollectionInterface {
    
    public static void paintCollection(Collection col) {
        for (Object element : col) {
            System.out.println(element);
        }
        System.out.println();
        
    }
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("list " + i);
        }
        paintCollection(list);
        
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }
        paintCollection(queue);
        
        Collection<Character> set = new HashSet<>();
        String word = "collection";
        for(int i=0;i<word.length(); i++){
            set.add(word.charAt(i));
        }
        paintCollection(set);
    }
}
