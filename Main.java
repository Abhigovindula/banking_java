package Exception;

import java.util.*;
public class Main 
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount myaccount = new BankAccount("abhi",500.0);
        System.out.println("Welcome to banking application!");
        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
    
    try{
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Enter Deposit Amount:");
            double depositAmount=sc.nextDouble();
            myaccount.deposit(depositAmount);
            break;
            case 2:
            System.out.println("Enter amount to be withdrawn : ");
            double withdrawAmount=sc.nextDouble();
            myaccount.withdraw(withdrawAmount);
            break;
            case 3:
            System.out.println("Current Balance :"+myaccount.getBalance());
            break;
            case 4:
            System.out.println("Exiting the app.Thank You!");
            sc.close();
            return;
            default:
            System.out.println("Enter a valid choice!");
        }
    }
    catch(InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        sc.next(); 
    } 
    catch (NegativeAmountException | InsufficientFundsException e) {
        System.out.println(e.getMessage());
    } 
    catch (Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
    }
}
    }
}
