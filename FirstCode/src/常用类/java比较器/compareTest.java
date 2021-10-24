package 常用类.java比较器;

import java.util.Arrays;
import java.util.Comparator;

public class compareTest {
    public static void main(String[] args) {
        /*
        * Comparable接口使用：
        * 重写compareTo()
        * */
        /*Goods[] goods = new Goods[4];
        goods[0]=new Goods("wang",61);
        goods[1]=new Goods("li",21);
        goods[2]=new Goods("zao",10);
        goods[3]=new Goods("qian",41);
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));*/

        /*
         * Comparator接口使用：
         * 重写compare()方法，当学要排序的对象没有实现Comparable接口或是实现方式不一致时使用
         * */
        Goods[] goods = new Goods[5];
        goods[0]=new Goods("wang",61);
        goods[1]=new Goods("li",21);
        goods[2]=new Goods("zao",10);
        goods[3]=new Goods("qian",41);
        goods[4]=new Goods("zao",61);
        Arrays.sort(goods, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Goods && o2 instanceof Goods){
                    Goods good1 = (Goods)o1;
                    Goods good2 = (Goods)o2;
                    if(good1.type == good2.type){
                        return -Double.compare(good1.price,good2.price);
                    }else{
                        return good1.type.compareTo(good2.type);
                    }
                }
                throw new RuntimeException("ss");
            }
        });
        System.out.println(goods);
    }
}

//自然排序
class Goods implements Comparable{
    public String type;
    public int price;

    public Goods(String type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods good = (Goods)o;
            return Double.compare(this.price,good.price);
        }
        throw new RuntimeException("传入数据不一致");
    }
}

//定制排序

