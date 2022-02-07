package abstractionAndInterface.taskThree;

public class SavingAccount extends BankAccount{

    @Override
    public void deposit(int amount) {
        setBalance(amount);
        System.out.println("Deposited: " + getBalance());
    }

    @Override
    public void withdrawal(int amount) {
        setBalance(getBalance()-amount);
        System.out.println("Withdrawal: " + getBalance());
    }

    public int save(){
        return getBalance();
    }
}
