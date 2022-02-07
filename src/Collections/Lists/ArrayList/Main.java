package Collections.Lists.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();

    arrayList.add("Hi");
    arrayList.add("Привет");
    arrayList.add("Hello");
    iteras(arrayList);
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
        System.out.println(arrayList.contains(str) ? str + " Элемент найден." : str+ " Элемент отсутствует.");
    arrayList.remove("Hi");
        System.out.println("Удалили 1, осталось: " + arrayList.size());
    arrayList.clear();
        System.out.println("Удалили всё, осталось: "+arrayList.size());
    arrayList.add("Highlander");
        System.out.println("Добавили 1, стало: "+ arrayList.size());
    iteras(arrayList);
        System.out.println("Выбор конкретно 0-го элемента: "+ arrayList.get(0));

}
    public static void iteras(ArrayList<String> arrayList){
        System.out.println("Сейчас кол-во элементов: " + arrayList.size()+"\n"+"Все элементы: ");
        arrayList.forEach(System.out::println);
    }
}
