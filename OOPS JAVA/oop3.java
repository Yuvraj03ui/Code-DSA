 // using constructor in classs defalt and permeterized:// 

class Human {
    int age;
    String name;
    int salary;

 public Human(int age, String name , int salary){

 this.age = age;
 this.name = name;
 this.salary =salary;
}
    
}

public class oop3 {
    public static void main(String[] args) {
        
       Human  h1 = new Human(35, "yuvraj", 100000) ;
       
    System.out.println(h1.age+" " +h1.name + " "+h1.salary);
    }
}
