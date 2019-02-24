import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int roll;
    String name;
    int marks;

    public Student(int roll, String name, int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return "Student [" + name + "; " + roll + "; " + marks + "]";
    }

    public int compareTo(Student s){
        return (marks > s.marks) ? 1 : -1;
    }
}

class ComparableDemo{
    public static void main(String args[]){
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Ram", 23));
        students.add(new Student(102, "Ghanshyam", 11));
        students.add(new Student(103, "Gopal", 22));

        Collections.sort(students);
        Collections.sort(students, (i, j) -> i.roll > j.roll ? 1 : -1);

        for(Student s : students){
            System.out.println(s);
        }
    }
}