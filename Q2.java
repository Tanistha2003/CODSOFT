import java.util.*;

public class Q2 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //The grade chart is displayed below

        System.out.println("The percentage system for calculating Student Grade is as follows: \n");
        System.out.println("Average Marks>=90    || Grade-A+");
        System.out.println("80<=Average Marks<90 || Grade-A");
        System.out.println("70<=Average Marks<80 || Grade-B");
        System.out.println("60<=Average Marks<70 || Grade-C");
        System.out.println("50<=Average Marks<60 || Grade-D"); 
        System.out.println("40<=Average Marks<50 || Grade-E");
        System.out.println("Average Marks<40     || Grade-FAIL");       
        System.out.println();

        System.out.println("Enter number of total subjects of the student\n");
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println(" Enter the marks of the student in "+i+" no. subject");
            double marks=sc.nextDouble();
            sum+=marks;
        }
        double avg=sum/n;
        System.out.println("\n");
        System.out.println("The total sum of marks of the student in "+n+" subjects is "+sum);
        System.out.println("The average perecentage is calculated to be "+avg);
        if(avg>=90)
        System.out.println("Grade is : A+");
        else if(avg>=80)
        System.out.println("Grade is : A");
        else if(avg>=70)
        System.out.println("Grade is : B");
        else if(avg>=60)
        System.out.println("Grade is : C");
        else if(avg>=50)
        System.out.println("Grade is : D");
        else if(avg>=40)
        System.out.println("Grade is : E");
        else
        System.out.println("Grade is : FAIL");
        
        sc.close();
    }
    
}
