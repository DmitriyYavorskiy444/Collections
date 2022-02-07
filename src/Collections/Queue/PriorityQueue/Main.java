package Collections.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();

        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        myPriorityQueue.add(4);

            myPriorityQueue.forEach(System.out::println);
//        myPriorityQueue.forEach(n-> System.out.println(n));
        System.out.println("Удаляем 1-го");
            myPriorityQueue.remove();
            myPriorityQueue.forEach(System.out::println);
        System.out.println("Вставка через предложение");
            myPriorityQueue.offer(55);
            myPriorityQueue.forEach(System.out::println);
        System.out.println("Берём конкретный (первый) элемент: " + myPriorityQueue.peek());
        System.out.println("Берём конкретный (первый) элемент через element(): "+myPriorityQueue.element());
            myPriorityQueue.forEach(System.out::println);

    }

}
