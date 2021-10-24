package JavaEE;

public class M9_24 {


    public void show(){
        Student.grade grade = new Student().new grade();
        Student.family family = new Student.family();

    }
}

class Student{
    private String name;
    private String sex;
    public  int age;
    class grade{
        private int Chinese;
        private int math;

        public void show(){
            System.out.println(name+"的成绩为："+Chinese);
        }

        public int getChinese() {
            return Chinese;
        }

        public void setChinese(int chinese) {
            Chinese = chinese;
        }

        public int getMath() {
            return math;
        }

        public void setMath(int math) {
            this.math = math;
        }
    }

    static class family{
        private String fatherName;
        private String motherName;
    }
    public void showInfo(){
        grade grade = new grade();
        System.out.println(grade.Chinese);
        System.out.println(grade.math);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
