  class books {

    String name;
    int price;

   public void info(){
    System.out.println(this.name);
    System.out.println(this.price);
   } 

    books(String name ,int price){
        this.name = name;
        this.price =price;
    }
  
}


public class constructor {
    public static void main(String[] args) {
        
      books b1 = new books("yuvaj",191);

      System.out.println(b1.name+" "+b1.price);
    //   b1.name = "english";
    //   b1.price = 188;
    //   books b2 = new books();
    //   b2.name = " hindi";
    //   b2.price = 450;
    //   b1.info();
    //   b2.info();

    }
}
