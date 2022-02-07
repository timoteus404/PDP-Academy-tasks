package abstractionAndInterface.taskThree;

public abstract class BankAccount {

    private String owner;
    private int balance;

    public abstract void deposit(int amount);
    public abstract void withdrawal(int amount);

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
