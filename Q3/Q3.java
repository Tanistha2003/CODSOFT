import java.util.*;


public class Q3 {
 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Bank_account account=new Bank_account(10000);
        int ch=-1;
        System.out.println("WELCOME to ATM Service!!");
        System.out.println("Enter your 4-digit pin:");
        int pin=sc.nextInt();
        while(ch!=4)
        {
            System.out.println("\n");
            account.menu();
            System.out.println("\n");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:account.check_balance();
                       break;
                case 2:System.out.println("Enter amount to deposit");
                       double amount=sc.nextDouble();
                       account.deposit(amount);
                       break;
                case 3:System.out.println("Enter amount you want to withdraw");
                       double amount1=sc.nextDouble();
                       account.withdraw(amount1);
                       break;
                case 4:System.out.println("Thank You for using the ATM Service");
                       break;
                default:System.out.println("Invalid choice. Please select a valid option from the menu"); 
            }
        }
        sc.close();
    }
}
