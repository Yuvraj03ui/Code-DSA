class Bank {

    public String name;
    public int empolyes;
     protected String email;
     
    public void account() {

        System.out.println(this.name);
        System.out.println(this.empolyes);
        System.out.println(this.email);

    }

}

public class Code12 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.name = "bshg";
        b.empolyes = 45;
        b.email = "bdicbkkjch@gmail.com";
        b.account();
    }

}
