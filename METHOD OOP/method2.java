import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {
       int ans = sum();

       System.out.println(ans);

    }
    

    static int sum(){
        
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER ");
        int  num1 = in.nextInt();

        System.out.println("ENTER THE NUMBER 2 ");

          int  num2 = in.nextInt();

          int sum = num1+num2;

         return sum;}
    }
