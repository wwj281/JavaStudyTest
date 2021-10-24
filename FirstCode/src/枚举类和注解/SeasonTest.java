package 枚举类和注解;

public class SeasonTest {
    public static void main(String[] args) {
        /* 定义枚举类的方式：
        * 方式一：自定义枚举类
        * 方式二：enum关键字
        * */
        // 方式一：自定义枚举类
        Season season = Season.SPRING;
        System.out.println(season);


        // 方式二：enum关键字
        Season1 season1 = Season1.SPRING;
        System.out.println(season1);

        //enum常用方法
        Season1[] seasons = season1.values();
        for (int i=0;i<seasons.length;i++){
            System.out.println(seasons[i]);
            seasons[i].show();
        }
    }
}


// 方式一
class Season{
    private final String seasonName;
    private  final String seasonDesc;

    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public final static Season SPRING = new Season("春天","春暖花开");
    public final static Season SUMMER = new Season("夏天","春暖花开");
    public final static Season AUTUMN = new Season("秋天","春暖花开");
    public final static Season WINTER = new Season("冬天","春暖花开");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}

interface info{
    void show();
}

// 方式二：使用enum关键字
enum Season1 implements info{
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天","春暖花开"){
        @Override
        public void show() {
            System.out.println("夏天在哪里");
        }
    },
    AUTUMN("秋天","春暖花开"){
        @Override
        public void show() {
            System.out.println("秋天在哪里");
        }
    },
    WINTER("冬天","春暖花开"){
        @Override
        public void show() {
            System.out.println("冬天在哪里");
        }
    };

    private final String seasonName;
    private  final String seasonDesc;

    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

/*    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }*/

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
}