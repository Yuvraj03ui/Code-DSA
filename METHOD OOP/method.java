import java.util.Scanner;

public class method {
    
    public static void  main ( String[] args){

        Scanner in = new Scanner(System.in);
        

        System.out.println("ENTER THE NUMBER ");
        int  num1 = in.nextInt();

        System.out.println("ENTER THE NUMBER 2 ");

          int  num2 = in.nextInt();

          int result = num1+num2;

          System.out.println(result);
    }
}
