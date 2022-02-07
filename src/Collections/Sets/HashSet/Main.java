package Collections.Sets.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hi");
        hashSet.add("Привет");
        hashSet.add("Hello");
        iteras(hashSet);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(hashSet.contains(str) ? "Элемент найден." : "Элемент отсутствует.");
        hashSet.remove("Hi");
        System.out.println("Удалили 1, осталось: " + hashSet.size());
        hashSet.clear();
        System.out.println("Удалили всё, осталось: "+hashSet.size());
        hashSet.add("Highlander");
        System.out.println("Добавили 1, стало: "+ hashSet.size());
        iteras(hashSet);
    }
    public static void iteras(HashSet<String> hashSet){
        System.out.println("Сейчас кол-во элементов: " + hashSet.size()+"\n"+"Все элементы: ");
        hashSet.forEach(System.out::println);
    }
}
