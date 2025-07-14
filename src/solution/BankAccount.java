package solution;

//Bank Account System
//File: BankAccount.java
//Input: deposit(1000), withdraw(300)
//Output: Balance: 700

class UserAccount{
    private int balance = 0;

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }
}

public class BankAccount{
    UserAccount userAccount = new UserAccount();

    public void withdraw(int amount){
        if(userAccount.getBalance() <= 0){
            System.out.println("Insufficient Balance");
        }else{
            userAccount.setBalance(userAccount.getBalance() - amount);
            System.out.println("Balance: " + userAccount.getBalance());
        }

    }

    public void deposit(int amount){
        userAccount.setBalance(userAccount.getBalance() + amount);
        System.out.println(userAccount.getBalance());
    }
}

