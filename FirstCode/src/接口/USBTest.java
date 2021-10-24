package 接口;

public class USBTest {
}

interface USB {
    int length = 10;
    int width = 5;

    void start();

    void stop();
}
class Flash implements USB{
    @Override
    public void start() {
        System.out.println();
    }

    @Override
    public void stop() {
        System.out.println();
    }
}