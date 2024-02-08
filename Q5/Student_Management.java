import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Student_Management{
    private List<Student> students=new ArrayList<>();

    public void add(Student student)
    {
        students.add(student);
    }

    public void remove(int roll){
       students.removeIf(student->student.get_roll()==roll);
    }

    public Student find(int roll){
        for(Student student:students){
            if(student.get_roll()==roll)
            return student;
        }
        return null;
    }

    public List<Student> all(){
        return students;
    }

    public void save(String filename){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}