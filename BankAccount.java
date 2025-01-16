package Exception;

public class BankAccount {
    String accountHolderName;
    double balance;
        BankAccount(String accountHolderName,double balance){
        this.accountHolderName = accountHolderName;
        this.balance=balance;
    }
    public void deposit(double amount) throws NegativeAmountException{
        if(amount<0){
            throw new NegativeAmountException("Amount deposited cannot be negative");
        }
        balance+=amount;
        System.out.println("Deposit Successful. Current Balance : "+balance);

    }
    public void withdraw(double amount) throws InsufficientFundsException,NegativeAmountException{
        if(amount>balance){
            throw new InsufficientFundsException("Amount withdrawing must be less than your balance!");

        }
        if(amount < 0){
            throw new NegativeAmountException("You cannot withdraw negative amount");
        }
        balance -= amount;
        System.out.println("WithDrawn Successfully. Your Curent Balance : "+balance);

    }
    public double getBalance(){
        return balance;
    }
    
}
