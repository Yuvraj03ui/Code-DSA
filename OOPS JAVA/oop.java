  class Student{
    
 int age;
 String name;
 float marks;
 
 public void info(){

    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.marks);
 }
    
}

public class oop {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.age = 14;
         st1.marks = 58;
           st1.name = "yuvbraj";
           st1.info();
    }
}
