package main;

import java.util.*;
import java.util.stream.Collectors;

public class hashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> hMaps = new HashMap<>();
        hMaps.put("jerry",21);
        hMaps.put("may",12);
        hMaps.put("sherry",52);
        hMaps.put("andy",41);
        hMaps.put("tom",32);
        hMaps.put("li",24);
        hMaps.put("andy",66);
        System.out.println(hMaps);
        hMaps.remove("andy");
        System.out.println(hMaps);
        Set<String> strings = hMaps.keySet();
        System.out.println(strings);
        Collection<Integer> values = hMaps.values();
        System.out.println(values);
        Set<Map.Entry<String, Integer>> entries = hMaps.entrySet();
        System.out.println(entries);
        System.out.println(hMaps.get("tom"));

    }
}
