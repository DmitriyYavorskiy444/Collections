package Maps.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        Hashtable<String,Double> balance = new Hashtable<>();

        double bal;

        balance.put("Маша", 3434.34);
        balance.put("Михаил", 123.22);
        balance.put("Олег", 1378.00);
        balance.put("Денис", 99.22);
        balance.put("Антон", -19.08);

        balance.forEach((k,v)-> System.out.println(k+" | "+v));

        System.out.println("Вносим 1000 на балланс Маши...");

        bal = balance.get("Маша");
        balance.put("Маша", bal + 1000);
        System.out.println("Новый баланс Маши: " + balance.get("Маша"));
    }
}

