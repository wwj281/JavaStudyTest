package 常用类.日期与时间;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

public class dateTest {
    public static void main(String[] args) {
        /*
        * system类
        * */
        //获取时间戳
        /*System.out.println(System.currentTimeMillis());*/


        /*
        * 两个Date类
        * */
        /*Date date = new Date();
        Date date1 = new Date(1631451572795L);
        String str = date.toString();
        long l = date.getTime();
        System.out.println(str);
        System.out.println(l);

        java.sql.Date date2 = new java.sql.Date(1631451572795L);
        System.out.println(date2);*/


        /*
        * simpleDateFormat类
        * */
        /*Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str1 = sdf.format(date);
        System.out.println(str1);
        try {
            Date date1 = sdf.parse(str1);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2019-11-01";
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        java.sql.Date sql = new java.sql.Date(date.getTime());*/


        /*
        * calendar类
        * */
        Calendar instance = Calendar.getInstance();
        //get()
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.get(Calendar.DATE));
        System.out.println(instance.get(Calendar.DAY_OF_WEEK));
        //set()
        instance.set(Calendar.DAY_OF_MONTH,22);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        //add()
        instance.add(Calendar.DAY_OF_MONTH,3);
        //get/setTime()
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        Date date = instance.getTime();
    }
}
