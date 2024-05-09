package ec.com.linkedinlearning.collections;

import java.util.LinkedList;

/**
 *
 * @author Steve
 */
public class LinkedListClass {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add("element_" + i);
        }
        System.out.println(list);

        String peek = list.peek(); // Devuelve el primer elemento, pero no lo quita de la lista
        System.out.println("peek: " + peek);
        System.out.println(list);

        String pop = list.pop(); // Devuelve el primer elemento, pero lo elimina de la lista
        System.out.println("pop: " + pop);
        System.out.println(list);

        String poll = list.poll(); // Devuelve el primer elemento, pero lo elimina de la lista
        System.out.println("poll: " + poll);
        System.out.println(list);

        String pollFirst = list.pollFirst(); // Devuelve el primer elemento, pero lo elimina de la lista
        System.out.println("pollFirst: " + pollFirst);
        System.out.println(list);

        String pollLast = list.pollLast(); // Devuelve el último elemento, pero lo elimina de la lista
        System.out.println("pollLast: " + pollLast);
        System.out.println(list);

        list.push("element_push"); // Agerga un elemento al inicio
        System.out.println(list);

        list.offer("element_offer"); // Agerga un elemento al final
        System.out.println(list);

        list.offerFirst("element_offer_fisrt"); // Agerga un elemento al inicio
        System.out.println(list);

        list.offerLast("element_offer_last"); // Agerga un elemento al final
        System.out.println(list);
    }
}
