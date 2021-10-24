package 集合.MapTest;
import java.util.*;

public class MapMethodTest {
    public static void main(String[] args) {
        /*HashMap<Object, Object> maps = new HashMap<>();
        maps.put("aa",123);
        maps.put("sd",13);
        maps.put("ff",23);
        maps.put("jk",12);
        maps.put("aa",33);
        maps.put("fd",783);
        System.out.println(maps);
        Set<Object> kSet = maps.keySet();
        for(Object o :kSet){
            System.out.println(o);
        }
        System.out.println("+++++++++++");
        Collection<Object> values = maps.values();
        for(Object o :values){
            System.out.println(o);
        }
        System.out.println("+++++++++++");
        Set<Map.Entry<Object, Object>> entries = maps.entrySet();
        for (Object o:entries) {
            Map.Entry o1 = (Map.Entry) o;
            System.out.println(o1.getKey()+":"+o1.getValue());*/
        TreeMap<Object, Object> tMaps = new TreeMap<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;
                    return Integer.compare(p1.getAge(),p2.getAge());
                }
                throw new RuntimeException("传入参数类型不正确");
            }
        });
        Person person = new Person("jerry",20);
        Person person1 = new Person("tom",21);
        Person person2 = new Person("marry",3);
        Person person3 = new Person("andy",54);
        Person person4 = new Person("jerry",18);
        tMaps.put(person,12);
        tMaps.put(person1,12);
        tMaps.put(person2,12);
        tMaps.put(person3,12);
        tMaps.put(person4,12);
        System.out.println(tMaps);
    }
}
