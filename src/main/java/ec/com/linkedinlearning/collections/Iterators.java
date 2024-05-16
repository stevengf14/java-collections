package ec.com.linkedinlearning.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Steve
 */
public class Iterators {

    private static void iterateCollection(Collection col) {
        System.out.println(col);
        Iterator<Object> it = col.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
            // System.out.println(it.next());
        }
        for (Object obj : col) {
            System.out.println(obj);
        }
    }
    
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add("list "+i);           
        }
        iterateCollection(list);
        
        Deque<Integer> queue = new LinkedList<>();
        for(int i= 0; i<5; i++){
        queue.add(i);
        }
        iterateCollection(queue);
        
        Collection<Character> set = new HashSet<>();
        String word = "collection";
        for(int i=0;i<word.length(); i++){
            set.add(word.charAt(i));
        }
        iterateCollection(set);
    }
}
