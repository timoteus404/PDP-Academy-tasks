import abstractionAndInterface.taskThree.CheckingAccount;

public class Main {

    public static void main(String[] args) {

        CheckingAccount account1 = new CheckingAccount();

        System.out.println("Initial Balance for account1: " + account1.check());
        account1.deposit(120);
        System.out.println("Current Balance: " + account1.check());

        CheckingAccount account2 = new CheckingAccount();

        System.out.println("\nInitial Balance for account2: " + account2.check());
        account2.deposit(90);
        System.out.println("Current Balance: " + account2.check());
        account2.withdrawal(10);
        System.out.println("Current Balance: " + account2.check());

    }

}
