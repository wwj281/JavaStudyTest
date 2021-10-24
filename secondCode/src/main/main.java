package main;

import java.lang.reflect.Array;
import java.util.*;

public class main {
    public static void main(String[] args) {
        TreeMap<String, Integer> tMaps = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        tMaps.put("jerry",21);
        tMaps.put("may",12);
        tMaps.put("sherry",52);
        tMaps.put("andy",41);
        tMaps.put("tom",32);
        tMaps.put("li",24);
        tMaps.put("andy",66);
        System.out.println(tMaps);
        tMaps.remove("jerry");
        System.out.println(tMaps);
        Set<Map.Entry<String, Integer>> entries = tMaps.entrySet();
        for(Object o:entries){
            System.out.println(o);
        }
        System.out.println("+++++++");
        Set<String> strings = tMaps.keySet();
        for (String o:strings){
            System.out.println(o+":"+tMaps.get(o));
        }
        System.out.println("++++++");
        Collection<Integer> values = tMaps.values();
        for (Integer i:values){
            System.out.println(i);
        }
    }


}

