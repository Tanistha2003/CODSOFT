import java.util.*;

public class Q5 {
    
    public static void main(String args[]){
        Student_Management sm=new Student_Management();
        int ch=-1;
        Scanner sc=new Scanner(System.in);
       
        while(ch!=8){
        System.out.println("\n1.Add a student");
        System.out.println("2.Remove a student");
        System.out.println("3.Search a student");
        System.out.println("4.Edit student details");
        System.out.println("5.Display all students");
        System.out.println("6.Save to File");
        System.out.println("7.Load from File");
        System.out.println("8.Exit\n");

       System.out.println("Enter your choice!!");
       ch=sc.nextInt();

       switch(ch)
        {
           case 1: System.out.print("Enter name: ");
                  String name = sc.next();
                  System.out.print("Enter roll number: ");
                  int rollNumber = sc.nextInt();
                  System.out.print("Enter grade: ");
                  String grade = sc.next();
                  System.out.println("Enter phone number");
                  String ph=sc.next();

                  Student student = new Student(name, rollNumber, grade,ph);
                  sm.add(student);
                  break;

            case 2:System.out.println("\nEnter roll number of student you want to remove");
                   int roll=sc.nextInt();
                   sm.remove(roll);
                   break;

            case 3:System.out.println("Enter roll number of student you want to find");
                   int roll_n=sc.nextInt();
                   Student found=sm.find(roll_n);
                   if(found==null)
                   System.out.println("No such student exists");
                   else
                   System.out.println("Student found");
                   break;
                
            case 4:System.out.println("Enter roll number of Student you want to edit");
                   int rol1_n=sc.nextInt();
                   Student found1=sm.find(rol1_n);
                   System.out.println("Enter the field number you want to edit: 1.Name, 2.Roll number, 3.Grade, 4.Phone number");
                   int chice=sc.nextInt();
                   switch(chice){
                    case 1:System.out.println("Enter name");
                           String nam=sc.next();
                           found1.set_name(nam);
                           System.out.println("Edit done!");
                           break;
                    case 2:System.out.println("Enter roll");
                           int rol=sc.nextInt();
                           found1.set_roll(rol);
                           break;
                    case 3:System.out.println("Enter grade");
                          String g=sc.next();
                          found1.set_grade(g);
                          System.out.println("Edit done!");
                          break;
                    case 4:System.out.println("Enter phone number");
                            String p1=sc.next();
                            found1.set_phn(p1);
                            System.out.println("Edit done!");
                            break;
                    default:System.out.println("Wrong data field entered\n");

                   }
                  
                   break;

            case 5:List<Student> allStudent=sm.all();
                   if(allStudent.isEmpty())
                   System.out.println("No data is present. Add a astudent");
                   else{
                    for(Student s:allStudent){
                        s.display();
                        System.out.println();
                    }
                   }
                   break;

            case 6:sm.save("students.dat");
                   System.out.println("Data is saved successfully");
                   break;

            case 7:sm.loadFromFile("students.dat");
                   System.out.println("Data is successfully loaded");
                   break;

            case 8:System.out.println("Exiting the application\n");
                   sc.close();
                   break;

            default:System.out.println("Wrong choice enetered. Try again!!");

        }

      }
    }
}
