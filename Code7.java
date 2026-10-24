public class Code7 {

    static class Calculator {

        public int add(int n1, int n2) {
            int r = n1 + n2;
            return r;
        }
    }

    public static void main(String a[]) {

        // int x = 38;
        // int y = 23;

        Calculator calc = new Calculator();

        int result = calc.add(50,50 );

        System.out.println(result);
    }
}
