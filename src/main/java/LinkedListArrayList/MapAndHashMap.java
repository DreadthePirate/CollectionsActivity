package LinkedListArrayList;

import java.util.HashMap;

public class MapAndHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();
        //map is used to map Keys to Values.

        empIds.put("Heath", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 8675309);

        System.out.println(empIds);
        System.out.println(empIds.get("Carl"));

        System.out.println(empIds.containsKey("Heath"));

        System.out.println(empIds.containsValue(8675309));

        empIds.put("Heath", 12354);
        //this updates a key value pair
        empIds.replace("John", 777);
        System.out.println(empIds);
        empIds.putIfAbsent("Steve", 222);
        System.out.println(empIds);
        empIds.remove("Steve", 222);
        System.out.println(empIds);
    }

}
