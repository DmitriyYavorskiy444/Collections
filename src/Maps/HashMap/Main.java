package Maps.HashMap;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> passNames = new HashMap<>();
        HashMap<Integer,String> passNames2 = new HashMap<>();
            passNames.put(123,"Pupkov Petr");
            passNames.put(231, "Ivanov Vano");
            passNames.put(345,"Sidorov Nik");
        System.out.println("All elements: "+ passNames);
        passNames.remove(123);
        System.out.println("All elements after removing: "+ passNames);
        System.out.println("Concrete element: "+ passNames.get(345));
        System.out.println("Searching by key: "+ (passNames.containsKey(121212) ? "present" : "absent"));
        System.out.println("Searching by value: "+ (passNames.containsValue("Ivanov Vano") ? "present" : "absent"));
        System.out.println("All keys: "+ passNames.keySet());
        System.out.println("All values: "+ new ArrayList<>(passNames.values()));
        System.out.println("Size: "+passNames.size());
            passNames2.put(222,"Shabliy Oleg");
            passNames2.put(333,"Konoplianko Vic");
        passNames.putAll(passNames2);
        System.out.println("Connecting 2nd Map: "+ passNames);
//        passNames.clear();


        System.out.println("Testing filling: "+ (passNames.isEmpty() ? "The map is empty" : "The map is full"));
        passNames.entrySet().forEach(System.out::println);

    }

}
