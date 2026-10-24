// class Pen {

//     String colour;
//     String type;

//     public void writing() {

//         System.out.println("writing ");
//     }
// }

// public class Code9 {

//     public static void main(String[] args) {

//   Pen pe1 = new Pen();

//   pe1.colour= "blue";
//   pe1.type= "gel";

//   pe1.writing();
//     }

// }

class Student {

    String name;
    int age;

    public void info() {

        System.out.println(this.name);
        System.out.println(this.age);

    }
}

public class Code9 {

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