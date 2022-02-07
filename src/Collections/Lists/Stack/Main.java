package Collections.Lists.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int x = stack.pop();
        int y = stack.peek();
        printUpStackElement(x,y);
        System.out.println("Возврат элемента с верха стака: " + y);
        x = stack.pop();
        y = stack.peek();
        printUpStackElement(x,y);
        stack.push(4);
        stack.push(5);
        x = stack.pop();
        y = stack.peek();
        printUpStackElement(x,y);
        System.out.println("Поиск search: " + stack.search(4)); // возвращает "1" если найден и "-1" если нет.
    }
    public static void printUpStackElement(Integer x, Integer y){
        System.out.println("Забираем элемент с верха стака: " + x);
        System.out.println("Верхний элемент: " + y);
    }
}
