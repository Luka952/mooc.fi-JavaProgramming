
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account artosAccount = new Account("Arto's account", 100.00);

        System.out.println("Initial state");
        System.out.println(artosAccount);
        System.out.println("The balance of Arto's account is now: " + artosAccount.toString());
        artosAccount.deposit(20);
        System.out.println(artosAccount);
    }
}
