//#################### FUNCTION OVERLOADING ##################
class Student {

    String name;
    int age;

    public void info() {

        System.out.println(this.name);
        System.out.println(this.age);

    }
}

public class Code10 {

    public static void main(String[] args) {

        Student st1 = new Student();

        st1.name = "yuvraj";
        st1.age = 19;

        st1.info();
        Student st2 = new Student();
        st2.name = "vijay";
        st2.age = 45;
        st2.info();
    }
}
