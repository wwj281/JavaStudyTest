package 常用类.日期与时间;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class newDateTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now.toEpochMilli());
        Instant instant = now.ofEpochMilli(1234556534);
        System.out.println(instant);
        System.out.println(now.atOffset(ZoneOffset.ofHours(8)));
    }
}
