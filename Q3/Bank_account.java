public class Bank_account{
    private double balance;
    
    public Bank_account(double initial_balance)
    {
         this.balance=initial_balance;
    }

    public void menu()
    {
        System.out.println("-------------------");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit ");
        System.out.println("3.Withdraw");
        System.out.println("4.Quit");   
        System.out.println("-------------------");
    }

    public void check_balance()
    {
      System.out.println("\nYour current balance is Rs."+balance);
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
           balance+=amount;
           System.out.println("\nAfter depositing Rs."+amount+", the total bank banace of your account is Rs."+balance);
        }
        else
        System.out.println("\nInvalid amount for deposit");
    }

    public void withdraw(double amount)
    {
       if(amount>balance)
       System.out.println("\nYou don't have sufficient balance to withdraw. Your current bank balance is Rs."+balance);
       else if(amount>=0)
       {
           balance-=amount;
           System.out.println("\nWithdrawal of amount Rs."+amount+" is successful. Your current bank balance is Rs."+balance);
       }
       System.out.println("\n");
    }
}    
