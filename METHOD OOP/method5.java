import java.util.Scanner;

public class method5{
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static int sum(){


    Scanner in = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER ");
    int num = in.nextInt();
    int num2 = in.nextInt();
    int sum = num+ num2;
    return sum;
}

}

