package 接口;

public class InterfaceTest {
    public static void main(String[] args) {
        CompareableTest ct = new CompareableTest();
        CompareObject cc = ct.getCompareObject();
        CompareCircle c1 = (CompareCircle) cc;
    }
}

interface CompareObject {
    public int compareTo(Object o);
}

class Circle {
    private int radius;

    Circle() {
    }

    Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

class CompareCircle extends Circle implements CompareObject {
    CompareCircle() {
    }

    CompareCircle(int radius) {
        super(radius);
    }

    public int compareTo(Object o) {
        if (this == o)
            return 0;
        else if (o instanceof CompareCircle) {
            CompareCircle temp = (CompareCircle) o;
            return this.getRadius() - temp.getRadius();
        } else return -1;
    }
}

class CompareableTest {

    public CompareObject getCompareObject() {
        return new CompareCircle();
    }
}


