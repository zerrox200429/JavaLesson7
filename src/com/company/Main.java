package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Map<String, String[]> map = new HashMap<>();
        map.put("A", new String[]{"B", "C"});
        map.put("B", new String[]{"A", "C"});
        map.put("C", new String[]{"B", "A"});

        map.put("D", new String[]{"E", "F"});
        map.put("E", new String[]{"D", "F"});
        map.put("F", new String[]{"E", "D"});

        map.put("G", new String[]{"H", "I"});
        map.put("H", new String[]{"G", "I"});
        map.put("I", new String[]{"H", "G"});

        map.put("J", new String[]{"K", "L"});
        map.put("K", new String[]{"J", "L"});
        map.put("L", new String[]{"K", "J"});

        System.out.println("Введите любое число или фразу");
        Scanner scanner = new Scanner(System.in);
        String phrase1 = scanner.next();
        String[] strings = map.get(phrase1);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
