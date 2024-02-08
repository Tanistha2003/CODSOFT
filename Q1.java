import java.util.*;

class Q1{

    /**
    * @return
    */
   
    public static void main(String args[])
    {
       
       String play="yes";
       Scanner sc=new Scanner(System.in);
       int score=0,round=0;
       while(play.equals("yes"))
       {
         round++;
         Random rand=new Random();
        int num=rand.nextInt(100)+1;
         int trials=0 ;
        System.out.println("You only have 5 tries to correctly guess the number ");
        System.out.println("\n");
         while(trials<5)
        {
         System.out.println("Enter your guess between 1 and 100 ");
         int g=sc.nextInt();
         trials++;
         if(g==num)
         {
            System.out.println("Correct!! You guessed it in "+trials+" trials");
            score++;
            break;
         }
         else if(g<num)
         {
            System.out.println("Wrong!! Your guess is too low. You have "+(5-trials)+" trials left");
         }
         else
         {
            System.out.println("Wrong!! Your guess is too high. You have "+(5-trials)+" trials left");
         }
        }
        System.out.println(" Do you want to play more rounds? Type yes or no");
        play=sc.next();
        System.out.println("\n");
        System.out.println("Your score is "+score+" Out of "+round+" rounds");
       }
       sc.close();
    }
}

