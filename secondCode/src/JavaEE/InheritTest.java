package JavaEE;

public class InheritTest implements Cloneable{

    public double get(){
        return 1.0;
    }

    public InheritTest getInstance(){
        return this;
    }
}

class subClass extends InheritTest{

}