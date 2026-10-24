class Company{
    String name;
    int salary;
    String id;

    public Company(int salary,String name,String id){
         
        this.name = name;
        this.id = id;
        this.salary = salary;
        
          System.out.println(name + " " + salary + " " + id);
    }

    

}
public class oop4 {
    public static void main(String[] args) {
        Company c1 = new Company(78 ,"yubagd" , "yuhisdnn@gamil.com");
        Company c2 = new Company(80000, "ajith", "ahithns@gmail.com");
   
    }
}
