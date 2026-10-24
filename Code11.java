
// ########## SINGLE LEVEL INHERITANCE ######################

// class Shape{
    
//     public void area(){
//   System.out.println("display");
// } 
// }
// class Triangle extends Shape {

//     public void area(int l , int h){

//     System.out.println(1/2*l*h);

//     }
// }

// public class Code11 {
     

//     public static void main(String arg[]){

//   Triangle t1= new Triangle();
//         t1.area(5,9);
//     }
// }
//  ########### MUTLILEVEL INHERITANCE ########################

class Shape{
    
    public void area(){
  System.out.println("display");
} 
}
class Triangle extends Shape {

    public void area(int l , int h){

    System.out.println(1/2*l*h);

    }
}
class Circle extends Shape {

    public void area(int l , int h){

    System.out.println();

    }
}
public class Code11 {
     

    public static void main(String arg[]){

  Circle C1= new Circle();
        C1.area(5,9);
    }
}