package factory;

public class factory {
    public static void main(String[] args) {
        newFactory f = new addFactory();
        cul c = new add();
        c.caculate();
        add a = (add) c;
        a.a = 1;
        a.get();
        if (c instanceof add) {
            System.out.println("hahha");
        }
    }
}

abstract class cul {
    abstract void caculate();
}

class add extends cul {
    public int a;
    public int b;

    @Override
    void caculate() {
        System.out.println("加法");
    }

    void get() {
        System.out.println("打印结果");
    }
}

class mul extends cul {
    @Override
    void caculate() {
        System.out.println("乘法");
    }
}

interface newFactory {
    cul createFactory();
}

class addFactory implements newFactory {
    @Override
    public cul createFactory() {
        return new add();
    }
}

class mulFactory implements newFactory {
    @Override
    public cul createFactory() {
        return new mul();
    }
}
