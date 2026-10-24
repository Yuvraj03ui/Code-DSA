
 class Calculator  {

    public int add(int n1,int n2){
          int r = n1 + n2;
          return r;

    }

    
}


public class revison {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
   int result =  calc.add(5, 5);
 System.out.println(result);
    }
}
