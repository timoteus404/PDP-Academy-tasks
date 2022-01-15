package IkkinchiDars;

import java.util.IllegalFormatException;

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
        if(accountNumber>0){
            this.accountNumber = accountNumber;
        }else{
            throw new NumberFormatException("Account nomi 0dan kichik.");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(accountNumber>0){
            this.balance = balance;
        }else{
            throw new NumberFormatException("Balans nomi 0dan kichik berilgan.");
        }
    }
}
