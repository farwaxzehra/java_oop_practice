package BankAccount;

class BankAccount {
    String accountHolder;
    int balance;

    BankAccount(String accountHolder, int balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void Deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
        
    }

    void Withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }else{
            System.out.println("Insufficient balance.");
        }
    }
    void checkBalance(){
        System.out.println("Current Balance: " + balance);
    }
}
public class BankAcc{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Farwa", 5500);

        acc1.checkBalance();
        acc1.Deposit(2000);
        acc1.Withdraw(1000);
        acc1.checkBalance();


    }
}
