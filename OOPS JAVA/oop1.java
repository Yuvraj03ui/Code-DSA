import java.util.Scanner;

class Car{
    String name;
    int price ;

    public void detail(){
        System.out.println("car name is :"+this.name);
        System.out.println("car price is : "+this.price);
    }
}
public class oop1 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();  

        
        System.out.println("enter the name "); 
        c1.name = sc.nextLine();

         System.out.println("enter the price"); 
        c1.price = sc.nextInt();

        c1.detail();
        
        
    }
}
