package 异常;

public class ThrowTest {
    public static void main(String[] args) {
        Person p =new Person();
        try{
            p.show(-1);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }catch (MyException e){

        }
    }
}


class Person {
    public void show(int x) throws MyException{
        if(x>0){
            System.out.println("正常");
        }else {
            throw new MyException("数组越界了，哈哈哈！");
        }
    }
}
