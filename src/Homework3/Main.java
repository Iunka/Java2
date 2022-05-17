package Homework3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"ff", "bb", "cc", "dd", "nn", "aa", "ss", "bb", "cc", "gg", "ss", "rr"};
        System.out.println(Arrays.toString(words));

        Map<String, Integer> hmap = new HashMap<>();
        for (String x : words) {
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hmap);

        Phone phBook = new Phone();
        phBook.add("Иванов", "654654654");
        phBook.add("Иванов", "5645643454");
        phBook.add("Петров", "5646452456");
        phBook.add("Сидоров", "5546154661456");
        phBook.add("Петров", "841564435454");

        System.out.println("Тел:" + phBook.get("Иванов"));
        System.out.println("Тел:" + phBook.get("Петров"));
        System.out.println("Тел:" + phBook.get("Сидоров"));

    }

}
