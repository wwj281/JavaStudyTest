package 集合;

import java.util.*;

public class CollectionsToolTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(123);
        numbers.add(122);
        numbers.add(31);
        numbers.add(54);
        Collections.reverse(numbers);
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        List list = Arrays.asList(new Integer[numbers.size()]);
        System.out.println(list);
        Collections.copy(list,numbers);
        System.out.println(list);
        Integer max = Collections.max(numbers);
        System.out.println(max);
        Integer min = Collections.min(numbers);
        System.out.println(min);
        Collections.replaceAll(numbers,31,54);
        System.out.println(numbers);
        List<Integer> integers = Collections.synchronizedList(numbers);
    }
}
