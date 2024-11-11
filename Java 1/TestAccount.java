public class TestAccount {
    public static void main(String[] args) {

        Account First = new Account("UKT", "First", 6000);
        Account Second = new Account("UBD", "Second", 5000);

        System.out.println("Initial balance of First: $" + First.getBalance());
        System.out.println("Initial balance of Second: $" + Second.getBalance());

        First.transferTo(Second, 2000);

        System.out.println("Balance of First after transfer: $" + First.getBalance());
        System.out.println("Balance of Second after transfer: $" + Second.getBalance());
        
    }
    
}
