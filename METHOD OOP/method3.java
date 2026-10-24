import java.util.Scanner;

public class method3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String name = in.next();

        String persal = mygreet(name );
        System.out.println(persal);

    }

    static String mygreet(String name ){
         String message  = "hello"+name;

         return message;

    }
}
