package Collections.Sets.TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> treeSet = new TreeSet<>();

        boolean check = true;
        while (check){
            String str = scanner.nextLine();
            if (str.equals(" ")) break;
            treeSet.add(str);
        }
        iteras(treeSet);
    }
    public static void iteras(TreeSet<String> treeSet){
        System.out.println("Сейчас кол-во элементов: " + treeSet.size()+"\n"+"Все элементы: ");
        treeSet.forEach(System.out::println);
    }
}
