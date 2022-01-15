package IkkinchiDars;

/**
 * Quyidagi attributelardan iborat Account klassini
 * encapsulation prinsipi asosida yarating:
 * hisob raqami, ism familiyasi va balans.
 */
public class Account {
    private String name;
    private String lastname;
    private int accountNumber;
    private int balance;

    public Account(String name, String lastname, int accountNumber, int balance) {
        this.setName(name);
        this.setLastname(lastname);
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
    }

    //Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
