package LinkedListArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {


    public static void main(String[] args) {

        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Heath");
        namesLinkedList.add("Connor");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1, "Jerry");

        String[] names = new String[4];
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Heath");
        namesArrayList.add("Connor");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");
        System.out.println(namesArrayList.get(2));
        namesArrayList.add(1, "Jerry");
    }
}
