public class Student {
    private String name;
    private int roll_number;
    private String grade;
    private String phn_number;

    public Student(String name,int roll_number,String grade, String phn_number)
    {
        this.name=name;
        this.roll_number=roll_number;
        this.grade=grade;
        this.phn_number=phn_number;
    }

    public void set_name(String nam){
        name=nam;
    }

    public void set_roll(int nam){
        roll_number=nam;
    }

    public void set_grade(String nam){
        grade=nam;
    }
    
    public void set_phn(String nam){
        phn_number=nam;
    }

    public int get_roll(){
        return roll_number;
    }

    public String get_name(){
        return name;
    }

    public String get_grade(){
        return grade;
    }

    public String get_phn(){
        return phn_number;
    }

    public void display(){
        System.out.println("Name of Student: "+name);
        System.out.println("Roll Number: "+roll_number);
        System.out.println("Grade obtained by the Student is "+grade);
        System.out.println("Phone number of the Student: "+phn_number);
    }

}
