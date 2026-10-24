import java.util.Scanner;


class  Doctor{
    String name;
    String speaclization;

  
    public void doctorinfo() {
        System.out.println("doctor name is :"+this.name);
        System.out.println("speaclization is:"+this.speaclization);

    }

 
}
    
public class oop2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Doctor d1 = new Doctor(); 
  
        System.out.println("ENTER THE NAME ");
        d1.name = sc.nextLine();

        d1.speaclization = sc.nextLine();
        d1.doctorinfo();
    }
}
