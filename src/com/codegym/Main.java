package com.codegym;

import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] strings = string.split("");
        for (String s : strings) {
            if (!treeMap.containsKey(s)) {
                treeMap.put(s.toUpperCase(Locale.ROOT), 1);
            } else {
                treeMap.put(s.toLowerCase(Locale.ROOT), treeMap.get(s) + 1);
            }
        }
        System.out.println(treeMap);
    }
}
