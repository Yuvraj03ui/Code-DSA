import java.util.Scanner;

class function {

    public int sumCalculate(int a, int b) {
        int sum = a + b;
        return sum;
    }

}

public class method4 {
    public static void main(String[] args) {
        function f1 = new function();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = f1.sumCalculate(a,b);
        System.out.println(sum);

    }
}
