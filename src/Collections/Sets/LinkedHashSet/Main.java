package Collections.Sets.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        boolean check = true;
        while (check){
            String str = scanner.nextLine();
            if (str.equals(" ")) break;
            linkedHashSet.add(str);
        }
        iteras(linkedHashSet);
    }
    public static void iteras(LinkedHashSet<String> linkedHashSet){
        System.out.println("Сейчас кол-во элементов: " + linkedHashSet.size()+"\n"+"Все элементы: ");
        linkedHashSet.forEach(System.out::println);
    }
}
